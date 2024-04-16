import org.junit.Assert;
import org.junit.Test;

/**
 * @projectName: tomcatmybatis
 * @package: PACKAGE_NAME
 * @className: mathTest
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/3 13:37
 * @version: 1.0
 */
public class mathTest {
    @Test//测试数学方法的测试方法
    public void testSum(){
        math m = new math();
        int actual = m.sum(1, 2);
        int expected = 3;
        Assert.assertEquals(expected,actual);
    }
}
