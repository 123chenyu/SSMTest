package org.lanqiao.test;

import org.lanqiao.bean.User;

import org.lanqiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

        import java.util.List;

/**
 * Created by Reus_cy on 2017/8/30.
 */
public class Test {
    @Autowired
    public static IUserService userService;

    public static void main(String[] args) {
        List<User> userList=userService.getAllUser();
    }
}
