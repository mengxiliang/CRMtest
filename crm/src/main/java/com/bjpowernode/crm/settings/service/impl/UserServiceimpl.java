package com.bjpowernode.crm.settings.service.impl;

import com.bjpowernode.crm.settings.dao.UserDao;
import com.bjpowernode.crm.utils.SqlSessionUtil;

public class UserServiceimpl {
    private UserDao userDao = SqlSessionUtil.getSqlSession().getMapper(UserDao.class);
}
