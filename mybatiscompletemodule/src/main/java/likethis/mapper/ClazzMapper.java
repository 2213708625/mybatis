package likethis.mapper;

import likethis.bean.Clazz;

import java.util.List;

/**
 * @projectName: mybatis
 * @package: likethis.mapper
 * @className: ClazzMapper
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/15 11:57
 * @version: 1.0
 */
public interface ClazzMapper {
    List<Clazz> selectBYstepclazz(Integer cid);
}
