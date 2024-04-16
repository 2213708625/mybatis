package paramtest;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import param.bean.student;
import param.mapper.studentMapper;
import param.utils.sqlsessionutil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @projectName: mybatis
 * @package: paramtest
 * @className: studentMappertest
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/9 9:54
 * @version: 1.0
 */
public class studentMappertest {
    /*
     * @Description: 通过id来进行查询表中数据
     * @param
     * @return: void
     */
    @Test
    public void TeststudentMapperBYid(){
        SqlSession sqlsession = sqlsessionutil.opensession();
        studentMapper mapper = sqlsession.getMapper(studentMapper.class);
        List<student> students = mapper.selectByid(1l);
        for (student student : students) {
            System.out.println(student);
        }
        sqlsession.commit();
        sqlsessionutil.close(sqlsession);
    }
    /*
     * @Description: 通过name来进行查询表中数据
     * @param
     * @return: void
     */
    @Test
    public void TeststudentMapperBYname(){
        SqlSession sqlsession = sqlsessionutil.opensession();
        studentMapper mapper = sqlsession.getMapper(studentMapper.class);
        List<student> students = mapper.selectByname("张三");
        for (student student : students) {
            System.out.println(student);
        }
        sqlsession.commit();
        sqlsessionutil.close(sqlsession);
    }
    /*
     * @Description: 通过birth来进行查询表中数据
     * @param
     * @return: void
     */
     @Test
    public void TeststudentMapperBYbirth(){
        SqlSession sqlsession = sqlsessionutil.opensession();
        studentMapper mapper = sqlsession.getMapper(studentMapper.class);
         SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
         Date date = null;
         try {
             date = simpleDateFormat.parse("1980-10-11");
         } catch (ParseException e) {
             e.printStackTrace();
         }
         List<student> students = mapper.selectBybirth(date);
        for (student student : students) {
            System.out.println(student);
        }
        sqlsession.commit();
        sqlsessionutil.close(sqlsession);

    }
    /*
     * @Description: 通过sex来进行查询表中数据
     * @param
     * @return: void
     */
    @Test
    public void TeststudentMapperBYsex(){
        SqlSession sqlsession = sqlsessionutil.opensession();
        studentMapper mapper = sqlsession.getMapper(studentMapper.class);
        List<student> students = mapper.selectBysex('男');
        for (student student : students) {
            System.out.println(student);
        }
        sqlsession.commit();
        sqlsessionutil.close(sqlsession);
    }
    @Test
    public void insertBYMap(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("name","王五");
        map.put("age",11);
        map.put("height",1.71);
        map.put("birth",new Date());
        map.put("sex",'男');
        int i = mapper.insertBYMap(map);
        System.out.println(i);
        sqlSession.commit();
        sqlsessionutil.close(sqlSession);
    }
   @Test
    public void insertBYBean(){
       SqlSession sqlsession = sqlsessionutil.opensession();
       studentMapper mapper = sqlsession.getMapper(studentMapper.class);
       student stu = new student(null,"丁四",20,1.80,new Date(),'男');
       int i = mapper.insertBYBean(stu);
       if (i==1) {
           System.out.println("执行成功");
       }
       sqlsession.commit();
       sqlsessionutil.close(sqlsession);
   }
   @Test
    public void selectBYnameAndSex(){
       SqlSession sqlsession = sqlsessionutil.opensession();
       studentMapper mapper = sqlsession.getMapper(studentMapper.class);
       List<student> students = mapper.selectBYnameAndSex("李四", '女');
       for (student student : students) {
           System.out.println(student);
       }
       sqlsession.commit();
       sqlsessionutil.close(sqlsession);
   }
   @Test
    public void testListmap(){
       SqlSession sqlsession = sqlsessionutil.opensession();
       studentMapper mapper = sqlsession.getMapper(studentMapper.class);
       List<Map<String, Object>> maps = mapper.selectuseMapper();
       for (Map<String, Object> map : maps) {
           System.out.println(map);
       }
       sqlsession.close();
   }
   @Test
    public void testselectBYBigMap(){
       SqlSession sqlSession = sqlsessionutil.opensession();
       studentMapper mapper = sqlSession.getMapper(studentMapper.class);
       Map<Long, Map<String, Object>> longMapMap = mapper.selectBYBigMap();
       System.out.println(longMapMap);
       sqlSession.close();


   }

}
