package org.lanqiao.service.impl;

import org.lanqiao.bean.User;
import org.lanqiao.dao.IUserDao;

import org.lanqiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Reus_cy on 2017/8/30.
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;


    Logger logger = Logger.getLogger("UserServiceImpl.class");


    @Override
    public List<User> getAllUser() {
        logger.info("进入了get方法....");
        return userDao.getAllUser();
    }

    @Override
    public List<User> getUserByCondition(User user) {
        return userDao.getUserByCondition(user);
    }


}
