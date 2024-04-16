package bank.dao;

import bank.bean.Account;

/**
 * @projectName: mybatis
 * @package: bank.dao
 * @className: accountDao
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/6 13:39
 * @version: 1.0
 */
//t_act表中数据的crud
public interface accountDao {
    Account selectByActno(String actno);
    int updateByActno(Account act);
}
