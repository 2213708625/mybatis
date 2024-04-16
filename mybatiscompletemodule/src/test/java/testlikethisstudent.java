import likethis.bean.Student;
import likethis.mapper.StudentMapper;
import likethis.utils.sqlsessionutil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @projectName: mybatis
 * @package: PACKAGE_NAME
 * @className: testlikethisstudent
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/13 20:05
 * @version: 1.0
 */
public class testlikethisstudent {
    @Test//查
    public void testSelectBYallstudent(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = studentMapper.selectBYallstudent();
        for (Student student : students) {
            System.out.println(student);
        }
        sqlsessionutil.close(sqlSession);
    }
    @Test//增
    public void testInsertByStudent(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student stu1 = new Student(6, "刘嘉琪", 2103);
        int i = studentMapper.insertByStudent(stu1);
        System.out.println(i==1?"插入成功":"插入失败");
        sqlSession.commit();
        sqlsessionutil.close(sqlSession);
    }
    @Test//删
    public void testDeleteBysid(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        int i = studentMapper.deleteBysid(5);
        System.out.println(i==1?"删除成功":"删除失败");
        sqlSession.commit();
        sqlsessionutil.close(sqlSession);
    }
    @Test//改
    public void testUpdateByStudent(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student stu2 = new Student(4, "丁海斌", 2103);
        int i = studentMapper.updateByStudent(stu2);
        System.out.println(i==1?"修改成功":"修改失败");
        sqlSession.commit();
        sqlsessionutil.close(sqlSession);
    }
}
