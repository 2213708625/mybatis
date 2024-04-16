package fuxi.mapper;

import fuxi.bean.Clazz;

import java.util.List;

/**
 * @projectName: mybatis
 * @package: fuxi.mapper
 * @className: clazzMapper
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/8/16 19:31
 * @version: 1.0
 */
public interface clazzMapper {
    Clazz selectone(Integer cid);
    List<Clazz> selectMany(Integer cid);
}
