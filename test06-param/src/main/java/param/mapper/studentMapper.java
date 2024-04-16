package param.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import param.bean.student;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @projectName: mybatis
 * @package: param.mapper
 * @className: studentMapper
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/9 9:48
 * @version: 1.0
 */
public interface studentMapper {
    /*
     * @Description:
     * 根据id，name,birth,sex来查询数据
     * @param null
     * @return:
     */
    List<student> selectByid(Long id);
    List<student> selectByname(String name);
    List<student> selectBybirth(Date date);
    List<student> selectBysex(Character sex);
    int insertBYMap(Map<String,Object> map);
    int insertBYBean(student stu);
    List<student> selectBYnameAndSex(@Param("name") String name,@Param("sex") Character sex);
    List<Map<String,Object>> selectuseMapper();
    @MapKey("id")
    Map<Long,Map<String,Object>> selectBYBigMap();
    List<student> selectBYresultMap();
}
