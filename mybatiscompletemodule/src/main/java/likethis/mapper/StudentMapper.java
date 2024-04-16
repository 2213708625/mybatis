package likethis.mapper;

import likethis.bean.Clazz;
import likethis.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @projectName: mybatis
 * @package: likethis.mapper
 * @className: StudentMapper
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/13 20:01
 * @version: 1.0
 */
public interface StudentMapper {
    int insertByStudent(Student student);
    int deleteBysid(Integer sid);
    int updateByStudent(Student student);
    List<Student> selectBYallstudent();
    Student selectBYcid(Integer cid);

}
