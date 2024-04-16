import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import page.bean.Car;
import page.mapper.Carmapper;
import page.utils.sqlsessionutil;
import java.util.List;

/**
 * @projectName: mybatis
 * @package: PACKAGE_NAME
 * @className: testpage
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/13 15:55
 * @version: 1.0
 */
public class testpage {
    @Test
    public void testPagehelper(){
        SqlSession sqlSession = sqlsessionutil.opensession();
        Carmapper mapper = sqlSession.getMapper(Carmapper.class);
        int pageNum =2;
        int pageSize =3;
        PageHelper.startPage(pageNum,pageSize);
        List<Car> cars = mapper.selectall();
        for (Car car : cars) {
            System.out.println(car);
        }
        PageInfo pageInfo= new PageInfo(cars,5);
        System.out.println(pageInfo);
    }
}
