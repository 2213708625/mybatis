package seniormapper.mapper;

import seniormapper.bean.Clazz;

/**
 * @projectName: mybatis
 * @package: seniormapper.mapper
 * @className: clazzMapper
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/12 8:59
 * @version: 1.0
 */
public interface clazzMapper {

    Clazz selectBYcollection(Integer cid);
    Clazz selectBYid(Integer cid);
}
