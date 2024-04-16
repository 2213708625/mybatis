package bank.dao.impl;
import bank.bean.Account;
import bank.dao.accountDao;
import bank.utils.sqlsessionutil;
import org.apache.ibatis.session.SqlSession;

/**
 * @projectName: mybatis
 * @package: bank.dao.impl
 * @className: accountDaoimpl
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/6 13:43
 * @version: 1.0
 */
public class accountDaoimpl implements accountDao{
    @Override
    public Account selectByActno(String actno) {
        SqlSession sqlsession = sqlsessionutil.opensession();
        Account account = (Account) sqlsession.selectOne("selectByActno", actno);
        return account;
    }

    @Override
    public int updateByActno(Account act) {
        SqlSession sqlsession = sqlsessionutil.opensession();
        int count = sqlsession.update("updateByActno", act);
        return count;
    }
}
