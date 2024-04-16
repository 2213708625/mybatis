package bank.exception;

/**
 * @projectName: mybatis
 * @package: bank.exception
 * @className: moneynotenoughexception
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/6 13:55
 * @version: 1.0
 */
//余额不足异常
public class moneynotenoughexception extends Exception{
    public moneynotenoughexception() {
    }
    public moneynotenoughexception(String message) {
        super(message);
    }
}
