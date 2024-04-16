package dynamicsql.mapper;

import dynamicsql.bean.Car;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @projectName: mybatis
 * @package: dynamicsql.mapper
 * @className: CarMapper
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/10 14:33
 * @version: 1.0
 */
public interface CarMapper {
    List<Car> selectdynamic(@Param("brand") String brand,@Param("carType") String carType);
    List<Car> selectdynamicBywhere(@Param("brand") String brand,@Param("carType") String carType);
    List<Car> selectdynamicBytrim(@Param("brand") String brand,@Param("carType") String carType);
    int updateByset(Car car);
    List<Car> selectBYchoose(@Param("brand") String brand,@Param("carType") String carType);
    int deleteBYforeach(@Param("ids") Long[] ids);
    int insertBatch(@Param("cars") List<Car> cars);
    int deleteBYids(@Param("ids") Long[] ids);
}
