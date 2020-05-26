package com.imcst.dao;

import com.imcst.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IAccountDao {
    //查询所有账户
    @Select("select * from account")
    public List<Account> finAll();
    //保存
    @Select("insert into account (name,money) values (#{name},#{money})")
    public void saveAccount(Account account);
}
