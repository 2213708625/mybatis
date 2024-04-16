import likethis.bean.Car;
import likethis.mapper.CarMapper;
import likethis.utils.sqlsessionutil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: mybatis
 * @package: PACKAGE_NAME
 * @className: testlikethisCar
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/15 11:15
 * @version: 1.0
 */
public class testlikethisCar {
 @Test
    public void testSpringCarinsert(){
     SqlSession sqlSession = sqlsessionutil.opensession();
     CarMapper carMapper = sqlSession.getMapper(CarMapper.class);
     ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
     Car car = applicationContext.getBean("CarBean", Car.class);
     int i = carMapper.insertCar(car);
     System.out.println(i==1?"使用spring插入成功":"插入失败");
     sqlSession.commit();
     sqlsessionutil.close(sqlSession);
 }
}
