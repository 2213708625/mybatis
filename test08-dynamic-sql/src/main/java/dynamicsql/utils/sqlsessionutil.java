package dynamicsql.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * @projectName: mybatis
 * @package: utils
 * @className: sqlsessionutil
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/4 8:47
 * @version: 1.0
 */
//mybatis快速创建sqlsession对象的工具类
public class sqlsessionutil {
    private sqlsessionutil(){}
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static ThreadLocal<SqlSession> local = new ThreadLocal<>();
    public static SqlSession opensession(){

        SqlSession sqlsession = local.get();
        if(sqlsession==null){
            sqlsession = sqlSessionFactory.openSession();
            //将sqlsession对象绑定到当前线程上
            local.set(sqlsession);
        }
        return sqlsession;
    }
    //从当前线程中移除sqlsession对象
    public static void close(SqlSession sqlsession){
        if(sqlsession!=null){
            sqlsession.close();
            local.remove();
        }
    }
}
