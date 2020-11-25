package com.bjpowernode;

import com.bjpowernode.crm.settings.dao.UserDao;
import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.utils.SqlSessionUtil;
import org.junit.Test;

import java.util.List;

public class test {
    @Test
    public void test1(){
        UserDao userDao = SqlSessionUtil.getSqlSession().getMapper(UserDao.class);
        List<User> list = userDao.selectAll();
        list.forEach(user -> {
            System.out.println(user);
        });
    }
}
