package com.imcst.service.Impl;

import com.imcst.dao.IAccountDao;
import com.imcst.domain.Account;
import com.imcst.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired

    private IAccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户！！");
        return accountDao.finAll() ;
    }

    @Override
    public void saveAccount(Account account) {

        System.out.println("业务层：保存账户！！");
        accountDao.saveAccount(account);
    }
}
