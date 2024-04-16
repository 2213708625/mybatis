package utils;

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
    public static SqlSession opensession(){
        return sqlSessionFactory.openSession();
    }
}
