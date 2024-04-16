import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import seniormapper.Utils.sqlsessionutil;
import seniormapper.bean.Clazz;
import seniormapper.bean.Student;
import seniormapper.mapper.clazzMapper;

import java.io.IOException;
import java.util.List;

/**
 * @projectName: mybatis
 * @package: PACKAGE_NAME
 * @className: clazzMapperTest
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/12 9:08
 * @version: 1.0
 */
public class clazzMapperTest {
    @Test
    public void testclazzstep(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        clazzMapper mapper = sqlSession.getMapper(clazzMapper.class);
        Clazz clazz = mapper.selectBYid(1000);
        System.out.println(clazz.getCname());
        List<Student> stus = clazz.getStus();
        System.out.println(stus);
        sqlSession.close();
    }
    @Test
   public void testselecBycid() throws IOException {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        clazzMapper mapper1 = sqlSession1.getMapper(clazzMapper.class);
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        clazzMapper mapper2 = sqlSession1.getMapper(clazzMapper.class);
        Clazz clazz1 = mapper1.selectBYid(1000);
        System.out.println(clazz1);
        Clazz clazz2 = mapper2.selectBYid(1000);
        System.out.println(clazz2);
        sqlSession1.close();
        sqlSession2.close();
    }
}
