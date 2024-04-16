package utils;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @projectName: mybatis
 * @package: utils
 * @className: sqlsessionutilTest
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/4 8:52
 * @version: 1.0
 */
public class sqlsessionutilTest {
    @Test//测试mybatis工具类
    public void testSqlsessionutil(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        sqlSession.insert("insertall");
        sqlSession.commit();
        sqlSession.close();

    }
}
