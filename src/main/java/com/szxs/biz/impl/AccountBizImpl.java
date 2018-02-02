package com.szxs.biz.impl;

import com.szxs.biz.AccountBiz;
import com.szxs.dao.AccountDao;
import com.szxs.entity.Account;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountBizImpl implements AccountBiz {
    @Resource
    private AccountDao accountDao;
    public Account login(Account account) {
        Account login = accountDao.login(account);
        return login;
    }
}
