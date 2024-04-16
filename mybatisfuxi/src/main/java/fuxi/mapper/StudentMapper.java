package fuxi.mapper;

import fuxi.bean.Student;

/**
 * @projectName: mybatis
 * @package: fuxi.mapper
 * @className: StudentMapper
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/16 20:36
 * @version: 1.0
 */
public interface StudentMapper {
    Student selectBysid(Integer sid);
    Student selectBycid(Integer cid);
}
