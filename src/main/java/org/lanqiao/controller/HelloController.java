package org.lanqiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Reus_cy on 2017/9/1.
 */
@Controller
@RequestMapping("/test")
public class HelloController  {

    @RequestMapping("/hello.do")
   public  String hello(){
       return "hello";
   }

   @RequestMapping("/test01.do")
   public String test01(){
       return "redirect:/index.jsp";
   }
   @RequestMapping("/test02.do")
   public String test02(){
       return "forward:/test/test03.do";
   }
@RequestMapping("/test03.do")
   public  ModelAndView test03(){

       ModelAndView modelAndView = new ModelAndView("forward:/index.jsp");
       modelAndView.addObject("t","sd");
       return  modelAndView;
   }
}
