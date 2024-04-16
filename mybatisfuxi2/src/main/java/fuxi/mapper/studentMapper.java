package fuxi.mapper;

import fuxi.bean.Student;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

/**
 * @projectName: mybatis
 * @package: fuxi.mapper
 * @className: studentMapper
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/8/16 18:31
 * @version: 1.0
 */
public interface studentMapper {
    //增
    int insertStudent(Student student);
    //删
    int deleteStudent(Integer sid);
    //改
    int updateStudent(Student student);
    //查
    List<Student> select(Integer sid);
    List<Map<Student,Object>> selectReturnMap(Integer sid);
    @MapKey("sid")
    Map<Integer,Map<Student,Object>> selectBigMap(Integer sid);
    List<Student> selectMany(Integer sid);
    Student selectBycid(Integer cid);
}
