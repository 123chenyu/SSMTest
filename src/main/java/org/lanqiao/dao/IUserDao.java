package org.lanqiao.dao;



import org.lanqiao.bean.Student;
import org.lanqiao.bean.User;

import java.util.List;

/**
 * Created by Reus_cy on 2017/8/30.
 */
public interface IUserDao {
    /**
     * 查询所有用户
     * @return 返回list集合
     */
    List<User> getAllUser();

    List<User> getUserByCondition(User user);

    int  updateUserByCondition(User user);

    List<User> getUserIn(List<Integer> list);



}
