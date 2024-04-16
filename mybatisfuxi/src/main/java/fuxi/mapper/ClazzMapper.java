package fuxi.mapper;

import fuxi.bean.Clazz;

/**
 * @projectName: mybatis
 * @package: fuxi.mapper
 * @className: ClazzMapper
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/16 20:36
 * @version: 1.0
 */
public interface ClazzMapper {
    Clazz selectBycid(Integer cid);
    Clazz selectBycid2(Integer cid);
}
