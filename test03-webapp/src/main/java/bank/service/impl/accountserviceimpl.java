package bank.service.impl;

import bank.bean.Account;
import bank.dao.accountDao;
import bank.exception.moneynotenoughexception;
import bank.exception.transferexception;
import bank.service.accountService;
import bank.dao.impl.accountDaoimpl;
import bank.utils.sqlsessionutil;
import org.apache.ibatis.session.SqlSession;

import java.util.Locale;

/**
 * @projectName: mybatis
 * @package: bank.service.impl
 * @className: accountserviceimpl
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/6 13:32
 * @version: 1.0
 */
public class accountserviceimpl implements accountService {
//    private accountDao accountDao = new accountDaoimpl();
    private accountDao accountDao = sqlsessionutil.opensession().getMapper(bank.dao.accountDao.class);
    @Override
    public void transfer(String fromActno, String toActno, double money) throws moneynotenoughexception, transferexception {
        //1,判断转出账户余额是否充足（select）

        Account fromaccount = accountDao.selectByActno(fromActno);
        if(fromaccount.getBalance()<money){
            //2，如果转出账户余额不充足，提示用户
            throw new moneynotenoughexception("您的余额不足，无法转账");
        }
        SqlSession sqlsession = sqlsessionutil.opensession();
        //3，如果转出账户余额充足，更新转出账户余额（update）
        fromaccount.setBalance(fromaccount.getBalance() - money);
         int count =  accountDao.updateByActno(fromaccount);
         /*String s = null;
         s.toString();*/
        //4，更新转入账户余额（update）
        Account toaccount = accountDao.selectByActno(toActno);
        toaccount.setBalance(toaccount.getBalance()+money);
        count+=accountDao.updateByActno(toaccount);
        if(count!=2){
            throw new transferexception("转账失败");
        }
        sqlsession.commit();
        sqlsessionutil.close(sqlsession);
    }
}
