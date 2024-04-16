package WebSystem.mapper;

import WebSystem.bean.Car;

import java.util.List;

/**
 * @projectName: mybatis
 * @package: WebSystem.mapper
 * @className: CarMapper
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/9 19:14
 * @version: 1.0
 */
public interface CarMapper {
    List<Car> selectall();
}
