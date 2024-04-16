import bean.Car;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.sqlsessionutil;

import java.util.List;

/**
 * @projectName: mybatis
 * @package: PACKAGE_NAME
 * @className: carmapperTest
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/4 13:50
 * @version: 1.0
 */
public class carmapperTest {
    @Test
    public void testcarmapper(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        Car car = new Car(null,"1004","丁海斌",20.00,"2020-11-02","真英雄");
        sqlSession.insert("insertCar",car);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testcarmapperdelete(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        sqlSession.delete("deletebyid",6);
        sqlSession.commit();
        sqlSession.close();
    }
     @Test
    public void testcarmapperupdate(){
         SqlSession sqlsession = sqlsessionutil.opensession();
         Car car = new Car(4L,"4004","丁海斌",20.00,"2020-11-02","真英雄");
         sqlsession.update("updatebyid",car);
         sqlsession.commit();
         sqlsession.close();
     }
     @Test
    public void selectbyidone(){
         SqlSession sqlSession = sqlsessionutil.opensession();
         Object car = sqlSession.selectOne("selectone", 5);
         System.out.println(car);//输出查询结果集
    }
    @Test
    public void selectbyall(){
        SqlSession sqlsession = sqlsessionutil.opensession();
        List<Car> selectall = sqlsession.selectList("");
        for (Car car: selectall) {
            System.out.println(car);
        }
    }
}
