import fuxi.bean.Act;
import fuxi.bean.Clazz;
import fuxi.bean.Student;
import fuxi.mapper.ActMapper;
import fuxi.mapper.ClazzMapper;
import fuxi.mapper.StudentMapper;
import fuxi.util.sqlsessionutil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @projectName: mybatis
 * @package: PACKAGE_NAME
 * @className: teststep
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/16 20:42
 * @version: 1.0
 */
public class teststep {
    @Test//多对一
    public void teststep(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = studentMapper.selectBysid(2);
        System.out.println(student);
    }
    @Test//一对多
    public void teststep2(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        ClazzMapper clazzMapper = sqlSession.getMapper(ClazzMapper.class);
        Clazz clazz = clazzMapper.selectBycid2(1000);
        System.out.println(clazz);
    }
    @Test
    public void testact(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        ActMapper mapper = sqlSession.getMapper(ActMapper.class);
        List<Act> selectallact = mapper.selectallact();
        for (Act act : selectallact) {
            System.out.println(act);
        }
    }
    @Test
    public void testwhereif(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        ActMapper mapper = sqlSession.getMapper(ActMapper.class);
        Act act = mapper.selectByid(1l);
        System.out.println(act);
    }
}
