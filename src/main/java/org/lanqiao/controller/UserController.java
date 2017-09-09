package org.lanqiao.controller;
import org.lanqiao.service.IUserService;
import org.lanqiao.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Reus_cy on 2017/9/2.
 */
@Controller
@RequestMapping("/user")
public class UserController  {
    @Autowired
    IUserService iUserServeice;


    @RequestMapping("/reg.do")
    public String reg(User user) {
        System.out.println(user);
        return "hello";
    }
    @RequestMapping("/test.do")
    @ResponseBody
    public int pageTest(int id){
        return id;
    }

     @RequestMapping(value = "" ,method = RequestMethod.GET)
     @ResponseBody
     public  List<User>  getAllUser(){
         List<User> userList = iUserServeice.getAllUser();
        return userList;
     }
     @RequestMapping("/condition.do")
     public ModelAndView getUserByCondition(User user){
         ModelAndView modelAndView = new ModelAndView("show");
          List<User> userList = iUserServeice.getUserByCondition(user);
         modelAndView.addObject("userList",userList);
         return modelAndView;
     }
}
