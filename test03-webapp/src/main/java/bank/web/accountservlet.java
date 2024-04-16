package bank.web;

import bank.exception.moneynotenoughexception;
import bank.exception.transferexception;
import bank.service.accountService;
import bank.service.impl.accountserviceimpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @projectName: mybatis
 * @package: bank.web
 * @className: accountservlet
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/6 13:13
 * @version: 1.0
 */
@WebServlet("/transfer")
public class accountservlet extends HttpServlet {
    //为了让这个对象在其他方法中也能用，声明为实例变量
    accountService accountService = new accountserviceimpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //获取表单数据
        String fromActno = request.getParameter("fromActno");
        String toActno = request.getParameter("toActno");
        double money = Double.parseDouble(request.getParameter("money"));
        try {
            //调用service的转账方法完成转账，调用业务层
            accountService.transfer(fromActno,toActno,money);
            //调用view完成展示结果
            response.sendRedirect(request.getContextPath()+"/sucess.html");
        } catch (moneynotenoughexception e) {
            response.sendRedirect(request.getContextPath()+"/moneyenough.html");
        } catch (transferexception e) {
            response.sendRedirect(request.getContextPath()+"/transfernot.html");
        }catch (Exception e){
            response.sendRedirect(request.getContextPath()+"/transfernot.html");
        }


    }
}
