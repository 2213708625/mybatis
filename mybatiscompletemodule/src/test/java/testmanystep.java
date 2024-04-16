import likethis.bean.Clazz;
import likethis.mapper.ClazzMapper;
import likethis.utils.sqlsessionutil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @projectName: mybatis
 * @package: PACKAGE_NAME
 * @className: testmanystep
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/15 11:56
 * @version: 1.0
 */
public class testmanystep {
    @Test
    public void teststep(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        ClazzMapper clazzMapper = sqlSession.getMapper(ClazzMapper.class);
        List<Clazz> clazzes = clazzMapper.selectBYstepclazz(1000);
        for (Clazz clazz : clazzes) {
            System.out.println(clazz);
        }
        sqlSession.close();
    }
}
