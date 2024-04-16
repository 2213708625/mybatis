package testpeizhi;

import crudtest.bean.Car;
import crudtest.mapper.Carmapper;
import crudtest.utils.sqlsessionutil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @projectName: mybatis
 * @package: testpeizhi
 * @className: testpeizhi
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/8 12:35
 * @version: 1.0
 */
public class testpeizhi {
    @Test
    public void testpzone(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        Carmapper mapper = sqlSession.getMapper(Carmapper.class);
        List<Car> selectall = mapper.selectall();
        for (Car car : selectall) {
            System.out.println(car);
        }
        sqlSession.commit();
        sqlsessionutil.close(sqlSession);
    }
    @Test
    public void testpztwo(){
        SqlSession sqlsession = sqlsessionutil.opensession();
        Carmapper mapper = sqlsession.getMapper(Carmapper.class);
        Car car = mapper.selectByid(2l);
        System.out.println(car);
        sqlsession.commit();
        sqlsessionutil.close(sqlsession);
    }
    @Test
    public void testpzthree(){
        SqlSession sqlsession = sqlsessionutil.opensession();
        Carmapper mapper = sqlsession.getMapper(Carmapper.class);
        int i = mapper.deleteCarByid(4l);
        sqlsession.commit();
        sqlsessionutil.close(sqlsession);
    }
}
