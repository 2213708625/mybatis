import fuxi.bean.User;
import fuxi.mapper.UserMapper;
import fuxi.util.sqlsessionutil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @projectName: mybatis
 * @package: PACKAGE_NAME
 * @className: testuser
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/22 11:59
 * @version: 1.0
 */
public class testuser {
    @Test
    public void testuserinsert(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "Lll",20);
        int i = mapper.insertUser(user);
        System.out.println(i);
        sqlSession.commit();
        sqlsessionutil.close(sqlSession);
    }
    @Test
    public void testuserdelete(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(3);
        System.out.println(i);
        sqlSession.commit();
        sqlsessionutil.close(sqlSession);
    }
    @Test
    public void testuserupdate(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(2, "顶顶顶", 12);
        int i = mapper.updateUser(user);
        System.out.println(i);
        sqlSession.commit();
        sqlsessionutil.close(sqlSession);
    }
    @Test
    public void testuserselectByID(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectByid(2);
        System.out.println(user);
        sqlsessionutil.close(sqlSession);
    }
    @Test
    public void testuserselectall(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectByall();
        for (User user : users) {
            System.out.println(user);
        }
        sqlsessionutil.close(sqlSession);
    }
}
