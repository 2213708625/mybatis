package WebSystem.web;

import WebSystem.bean.Car;
import WebSystem.mapper.CarMapper;
import WebSystem.mapper.UserMapper;
import WebSystem.utils.sqlsessionutil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.apache.ibatis.session.SqlSession;

import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @projectName: mybatis
 * @package: WebSystem.web
 * @className: Webservlet
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/9 18:04
 * @version: 1.0
 */
@WebServlet({"/login","/detail"})
public class Webservlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String servletPath = request.getServletPath();
        HttpSession session = request.getSession();
        if("/login".equals(servletPath)){
            dologin(request,response);
        }
        if(session!=null&&session.getAttribute("username")!=null){
            if("/detail".equals(servletPath)){
                dodetail(request,response);
            }
        }

    }
    private void dodetail(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //查询商品，将商品显示在detail.jsp中
        SqlSession sqlSession = sqlsessionutil.opensession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        List<Car> cars = mapper.selectall();
        request.setAttribute("cars",cars);
        request.getRequestDispatcher("detail.jsp").forward(request,response);
    }

    private void dologin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean flag=false;
        SqlSession sqlsession = sqlsessionutil.opensession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        /*User user = mapper.selectlogin(username, password);*/
        if(mapper.selectlogin(username, password)!=null){
            flag=true;
        }
        if(flag){
            HttpSession session = request.getSession();
            session.setAttribute("username",username);
            response.sendRedirect(request.getContextPath()+"/detail");
        }else{
            response.sendRedirect("loginerror.jsp");
        }
    }
}
