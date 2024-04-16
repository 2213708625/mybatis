import crudtest.bean.Car;
import crudtest.mapper.Carmapper;
import crudtest.utils.sqlsessionutil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @projectName: mybatis
 * @package: PACKAGE_NAME
 * @className: crudtest
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/7 12:44
 * @version: 1.0
 */
public class crudtest {
    @Test
    public void testInsert(){
        SqlSession sqlsession = sqlsessionutil.opensession();
         Carmapper carmapper=sqlsession.getMapper(Carmapper.class);
         Car car = new Car(null,"8654","凯美瑞",3.0,"2000-10-11","双马尾");
         carmapper.insertCar(car);
         sqlsession.commit();
         sqlsessionutil.close(sqlsession);
    }
    @Test
    public void testdelete(){
        SqlSession sqlsession = sqlsessionutil.opensession();
        Carmapper mapper = sqlsession.getMapper(Carmapper.class);
        mapper.deleteCarByid(1l);
        sqlsession.commit();
        sqlsessionutil.close(sqlsession);
    }
    @Test
    public void testupdate(){
        SqlSession sqlsession = sqlsessionutil.opensession();
        Carmapper mapper = sqlsession.getMapper(Carmapper.class);
        Car car = new Car(2l,"8654","凯美瑞",3.0,"2000-10-11","双马尾");
        mapper.updateCar(car);
        sqlsession.commit();
        sqlsessionutil.close(sqlsession);
    }
    @Test
    public void testselectone(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        Carmapper mapper = sqlSession.getMapper(Carmapper.class);
        Car car = mapper.selectByid(2l);
        System.out.println(car);
        sqlSession.commit();
         sqlsessionutil.close(sqlSession);
    }
    @Test
    public void testselectall(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        Carmapper mapper = sqlSession.getMapper(Carmapper.class);
        List<Car> selectall = mapper.selectall();
        for (Car car : selectall) {
            System.out.println(car);
        }
        sqlSession.commit();
        sqlsessionutil.close(sqlSession);

    }

}
