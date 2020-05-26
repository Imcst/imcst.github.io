package com.imcst.test;

import com.imcst.dao.IAccountDao;
import com.imcst.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    @Test
    public void run1() throws IOException {
        //加载配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        IAccountDao dao = session.getMapper(IAccountDao.class);
        List<Account> list = dao.finAll();
        for(Account account : list){
            System.out.println(account);
        }
        session.close();
        is.close();

    }
    @Test
    public void run2() throws IOException {
        Account account =new Account();
        account.setMoney((double) 1000);
        account.setName("春花");
        //加载配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        IAccountDao dao = session.getMapper(IAccountDao.class);
        dao.saveAccount(account);
        session.commit();
        session.close();
        is.close();

    }
}
