package seniormapper.mapper;

import org.apache.ibatis.annotations.Param;
import seniormapper.bean.Student;

/**
 * @projectName: mybatis
 * @package: seniormapper.mapper
 * @className: studentMapper
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/12 8:58
 * @version: 1.0
 */
public interface studentMapper {
    Student selectByid(Integer id);
    Student selectByidassociation(Integer id);
    Student selectBYstustep(Integer sid);
    Student selectBYcid(Integer cid);
}
