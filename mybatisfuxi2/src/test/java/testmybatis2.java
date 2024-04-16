import fuxi.bean.Clazz;
import fuxi.bean.Student;
import fuxi.mapper.clazzMapper;
import fuxi.mapper.studentMapper;
import fuxi.utils.sqlsessionutil;
import org.apache.ibatis.ognl.MapElementsAccessor;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.rmi.MarshalledObject;
import java.util.List;
import java.util.Map;

/**
 * @projectName: mybatis
 * @package: PACKAGE_NAME
 * @className: testmybatis2
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/8/16 18:38
 * @version: 1.0
 */
public class testmybatis2 {
    /*
     * @Description: 测试student表的插入功能
     * @param
     * @return: void
     */
    /*@Test
    public void testinsert() {
        SqlSession sqlSession = sqlsessionutil.opensession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        Student student = new Student(7, "他整夜在写信", 2103);
        int i = mapper.insertStudent(student);
        System.out.println(i == 1 ? "插入成功" : "插入失败");
        sqlSession.commit();
    }*/

    /*
     * @Description:测试student表的删除功能
     * @param
     * @return: void
     */
    @Test
    public void testdelete() {
        SqlSession sqlSession = sqlsessionutil.opensession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        int i = mapper.deleteStudent(7);
        System.out.println(i == 1 ? "删除成功" : "删除失败");
        sqlSession.commit();
    }

    /*
     * @Description:测试student表的修改功能
     * @param
     * @return: void
     */
    /*@Test
    public void testupdate() {
        SqlSession sqlSession = sqlsessionutil.opensession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        int i = mapper.updateStudent(new Student(3, "王五", 2000));
        System.out.println(i == 1 ? "修改成功" : "修改失败");
        sqlSession.commit();
    }*/

    /*
     * @Description:测试student表的查询功能
     * @param
     * @return: void
     */
    @Test
    public void testselect() {
        SqlSession sqlSession = sqlsessionutil.opensession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        List<Student> students = mapper.select(null);
        for (Student student : students) {
            System.out.println(student);
        }
    }
    /*
     * @Description:测试查询返回map
     * @param
     * @return: void
     */
    @Test
    public void testselectReturnmap() {
        SqlSession sqlSession = sqlsessionutil.opensession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        List<Map<Student, Object>> maps = mapper.selectReturnMap(null);
        for (Map<Student, Object> map : maps) {
            System.out.println(map);
        }
    }
    /*
     * @Description:测试查询返回大map
     * @param
     * @return: void
     */
    @Test
    public void testBigeMap(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        Map<Integer, Map<Student, Object>> integerMapMap = mapper.selectBigMap(1);
        System.out.println(integerMapMap);
    }
    @Test
    public void testmanytoone(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        List<Student> students = mapper.selectMany(1);
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void testonetomany(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        clazzMapper mapper = sqlSession.getMapper(clazzMapper.class);
        List<Clazz> clazzes = mapper.selectMany(1000);
        for (Clazz clazz : clazzes) {
            System.out.println(clazz);
        }
    }

}
