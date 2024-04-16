import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import seniormapper.Utils.sqlsessionutil;
import seniormapper.bean.Clazz;
import seniormapper.bean.Student;
import seniormapper.mapper.clazzMapper;
import seniormapper.mapper.studentMapper;

/**
 * @projectName: mybatis
 * @package: PACKAGE_NAME
 * @className: studentMapperTest
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/12 9:08
 * @version: 1.0
 */
public class studentMapperTest {
@Test
    public void testselectBYidsenior(){
    SqlSession sqlSession = sqlsessionutil.opensession();
    studentMapper mapper = sqlSession.getMapper(studentMapper.class);
    Student student = mapper.selectByid(1);
    System.out.println(student);
    sqlSession.close();
    }
    @Test
    public void testselectByidassociation(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        Student student = mapper.selectByidassociation(1);
        System.out.println(student);
        sqlSession.close();
    }
    @Test
    public  void testselectBYstustep(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        Student student = mapper.selectBYstustep(1);
        System.out.println(student.getSname());
        sqlSession.close();
    }
    @Test
    public void testselectBYcollection(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        clazzMapper mapper = sqlSession.getMapper(clazzMapper.class);
        Clazz clazz = mapper.selectBYcollection(1000);
        System.out.println(clazz);
        sqlSession.close();
    }
}
