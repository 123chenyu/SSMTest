package org.lanqiao.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.bean.User;
import org.lanqiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Reus_cy on 2017/9/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class IUserDaoTest {


    @Autowired
    IUserDao userDao;



    @Test
    public void getUserIn() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(1);
        list.add(2);
        System.out.println(userDao.getUserIn(list));


    }
    @Test
    public void updateUserByCondition() throws Exception {
           User user = new User();
           user.setId(1);
           user.setName("lizqio");
           user.setPass("123");
          userDao.updateUserByCondition(user);


    }

}