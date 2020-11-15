package com.example.spring.clothes.controller;

import com.example.spring.clothes.entity.UserEntity;
import com.example.spring.clothes.service.UserService;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/usercontroller")
public class UserController {

    @Autowired
    private UserService userService;

    UserEntity userEntity = new UserEntity();

    //直接进入到主界面
    @RequestMapping(value = {"/toMain"})
    public String toMain(){
        return "main";
        //return "personalpage";
    }

    //进入到登陆界面
    @RequestMapping(value = {"/toLogin"})
    public String toLogin(){
        System.out.println("1111111111");
        return "login";
    }


    /*
     *登陆页面中点击登陆按钮，跳转主界面的方法
     * ResponseBody表示当前方法返回数值的内容
     * 不加上的话就返回页面的东西
     */
    @RequestMapping(value = "/jsLogin")
    @ResponseBody
    public Map<String,Object> jsLogin(HttpServletRequest request) throws Exception{
        ModelMap modelMap = new ModelMap();
        HttpSession session = request.getSession();
        System.out.println("查看获取用户名="+request.getParameter("username"));
        System.out.println("密码="+request.getParameter("password"));

        if (request.getParameter("username")==null||request.getParameter("password")==null){
            modelMap.addAttribute("loginmsg","wrong");
        }else {
            userEntity=userService.getUserInfo(request.getParameter("username"),request.getParameter("password"));
            if(userEntity==null){
                modelMap.addAttribute("loginmsg","faile");
            }else {
                modelMap.addAttribute("loginmsg","success");
                session.setAttribute("model",modelMap);
            }
        }
        return modelMap;

    }


    /*
    * 衣服行业主界面
    *
    */
    public String toMainPage(Model model,HttpSession httpSession){
        return "main";
    }

    //用来测试各种数据如何在前台页面显示的方法
    @RequestMapping(value = {"/hello"})
    public String hello(Model model,HttpSession httpSession){
        //System.out.println("测试是否跳转到hello方法里边");
        //System.out.println("测试用户内容="+user.getUsername());
        List<UserEntity> userList =userService.getAllUser();
        /* 这个是用来判断登陆者是否为空，防止用户直接通过url进行登陆到主界面 */
        if (userEntity==null){
            //这里就表示登陆用户为空，需要从登陆界面重新登陆
            return "login";
        }else {
            model.addAttribute("person",userEntity);
            model.addAttribute("userList",userList);
            httpSession.setAttribute("username",userEntity.getUsername());
            System.out.println("--------------------2");
            return "hello";
        }

    }

    //主界面，点击-个人中心-个人主页-个人主页页面
    @RequestMapping(value = "toPersonalPage")
    public String toPersonalPage(Model model,HttpSession httpSession){

        System.out.println("--进入到个人中心");
        return "personalpage";
    }


}
