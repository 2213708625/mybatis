import dynamicsql.bean.Car;
import dynamicsql.mapper.CarMapper;
import dynamicsql.utils.sqlsessionutil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: mybatis
 * @package: PACKAGE_NAME
 * @className: testdynamic
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/10 14:37
 * @version: 1.0
 */
public class testdynamic {
    @Test
    public void testSelectdynamic(){
        SqlSession sqlsession = sqlsessionutil.opensession();
        CarMapper mapper = sqlsession.getMapper(CarMapper.class);
        List<Car> selectdynamic = mapper.selectdynamic("丁海","真");
        for (Car car : selectdynamic) {
            System.out.println(car);
        }
        sqlsession.close();
    }
    @Test
    public void testSelectdynamicBywhere() {
        SqlSession sqlsession = sqlsessionutil.opensession();
        CarMapper mapper = sqlsession.getMapper(CarMapper.class);
        List<Car> selectdynamic = mapper.selectdynamicBywhere("丁海", null);
        for (Car car : selectdynamic) {
            System.out.println(car);
        }
        sqlsession.close();
    }
        @Test
        public void testSelectdynamicBytrim () {
            SqlSession sqlsession = sqlsessionutil.opensession();
            CarMapper mapper = sqlsession.getMapper(CarMapper.class);
            List<Car> selectdynamic = mapper.selectdynamicBytrim("丁海", null);
            for (Car car : selectdynamic) {
                System.out.println(car);
            }
            sqlsession.close();
        }
    @Test
    public void testupdateByset () {
        SqlSession sqlsession = sqlsessionutil.opensession();
        CarMapper mapper = sqlsession.getMapper(CarMapper.class);
        Car car = new Car(5l,null,"丁有",null,null,null);
        int count = mapper.updateByset(car);
        System.out.println(count);
        sqlsession.commit();
        sqlsession.close();
    }
    @Test
    public void testselectBYchoose(){
        SqlSession sqlsession = sqlsessionutil.opensession();
        CarMapper mapper = sqlsession.getMapper(CarMapper.class);
        List<Car> cars = mapper.selectBYchoose("丁海斌", "双马尾");
        for (Car car : cars) {
            System.out.println(car);
        }
        sqlsession.close();

    }
    @Test
    public void testdeleteBYforeach(){
        SqlSession sqlsession = sqlsessionutil.opensession();
        CarMapper mapper = sqlsession.getMapper(CarMapper.class);
        Long[] longs ={2l,5l};
        int i = mapper.deleteBYforeach(longs);
        System.out.println(i);
        sqlsession.commit();
        sqlsession.close();
    }
    @Test
    public void testinsertBatch(){
        SqlSession sqlsession = sqlsessionutil.opensession();
        CarMapper mapper = sqlsession.getMapper(CarMapper.class);
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car(null,"1012","刘嘉琪",8800.00,"2003-05-09","我爱你");
        Car car2 = new Car(null,"1012","刘嘉琪",8800.00,"2003-05-09","我爱你");
        cars.add(car1);
        cars.add(car2);
        int i = mapper.insertBatch(cars);
        System.out.println(i);
        sqlsession.commit();
        sqlsession.close();
    }
    @Test
    public void testdeleteBYids(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        Long[] ids ={47l};
        int i = mapper.deleteBYids(ids);
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();
    }
}

