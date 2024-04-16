package bank.service;

import bank.exception.moneynotenoughexception;
import bank.exception.transferexception;

/**
 * @projectName: mybatis
 * @package: bank.service
 * @className: accountService
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/6 13:29
 * @version: 1.0
 */
//负责业务
public interface accountService {
    void transfer(String fromActno,String toActno,double money) throws moneynotenoughexception, transferexception;
}
