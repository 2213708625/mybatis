import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * @projectName: tomcatmybatis
 * @package: PACKAGE_NAME
 * @className: testmybatiscomplete
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/3 13:08
 * @version: 1.0
 */
public class testmybatiscomplete {
    public static void main(String[] args) {
        //将sqlsesion对象先定义在外边，为了回滚事务和关闭资源
        SqlSession sqlSession = null;
        try {
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis-config.xml"));
            //开启sqlsession会话
            sqlSession = sqlSessionFactory.openSession();
            //执行insert语句
            sqlSession.insert("insertall");
            //提交事务
            sqlSession.commit();
        } catch (Exception e) {
            //发生异常回滚事务
            if (sqlSession != null) {
                sqlSession.rollback();
            }
            e.printStackTrace();
        }finally {
            //关闭资源
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }
}
