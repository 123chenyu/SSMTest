package org.lanqiao.service;

import org.lanqiao.bean.User;

import java.util.List;

/**
 * Created by Reus_cy on 2017/8/30.
 */
public interface IUserService {

    List<User> getAllUser();

    List<User> getUserByCondition(User user);

}
