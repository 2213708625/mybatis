package fuxi.mapper;

import fuxi.bean.Act;

import java.util.List;

/**
 * @projectName: mybatis
 * @package: fuxi.mapper
 * @className: ActMapper
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/18 20:49
 * @version: 1.0
 */
public interface ActMapper {
    List<Act> selectallact();
    Act selectByid(Long id);
}
