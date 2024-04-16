package crudtest.mapper;

import crudtest.bean.Car;

import java.util.List;

/**
 * @projectName: mybatis
 * @package: crudtest.mapper
 * @className: Carmapper
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/7 11:36
 * @version: 1.0
 */
public interface Carmapper {
    /*
     * @Description:插入车辆
     * @param car
     * @return: int
     */
    int insertCar(Car car);
    /*
     * @Description: 修改车辆信息
     * @param car
     * @return: int
     */
    int updateCar(Car car);
    /*
     * @Description: 根据id删除车辆信息
     * @param id
     * @return: int
     */
    int deleteCarByid(Long id);
    /*
     * @Description: 根据id查询单个车辆的信息
     * @param id
     * @return: crudtest.bean.Car
     */
    Car selectByid(Long id);
    /*
     * @Description: 获取所有的车辆信息
     * @param
     * @return: java.util.List<crudtest.bean.Car>
     */
    List<Car> selectall();

}
