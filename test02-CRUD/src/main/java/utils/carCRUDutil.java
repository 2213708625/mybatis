package utils;

import bean.Car;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @projectName: mybatis
 * @package: utils
 * @className: mybatisCRUDutil
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/5 14:02
 * @version: 1.0
 */
//对数据库dinghaibin中的t_car表进行CRUD的工具类
public class carCRUDutil {
    private static SqlSession sqlsession = null;
    static {
        sqlsession = sqlsessionutil.opensession();
    }
    //增加t_car表中数据
    public static void insertCar(Car car){
        sqlsession.insert("insertCar",car);
        sqlsession.commit();
        sqlsession.close();
    }
    //根据id删除t_car表中数据
    public static void deleteCar(Long id){
       sqlsession.delete("deleteCar",id);
       sqlsession.commit();
       sqlsession.close();
    }
    //根据id修改t_car表中数据
    public static void update(Car car,Long id){
        sqlsession.update("updateCar",car);
        sqlsession.commit();
        sqlsession.close();
    }
    //根据id查询单个数据
    public static void selectone(Long id){
        Object car = sqlsession.selectOne("selectCarone", id);
        System.out.println(car);
        sqlsession.commit();
        sqlsession.close();
    }
    public static void selectall(){
        List<Car> cars = sqlsession.selectList("selectCarall");
        for (Car car : cars){
            System.out.println(car);
        }
        sqlsession.commit();
        sqlsession.close();
    }

}
