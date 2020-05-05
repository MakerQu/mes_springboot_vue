package com.crud_demo.controller;
import com.crud_demo.component.Token;
import com.crud_demo.entities.User;
import com.crud_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    UserService userService;

    Token token = new Token();//实例化对象

    //login.html返回之后进行登录
    @PostMapping("/login")//value="..."//注解限定，若没有搜集到则报错
    public Map<String,Object> login(@RequestBody Map user){
        Map<String, Object> map = new HashMap<String, Object>();
        System.out.println("login已响应");
        User byUsername = userService.getByUsername(user.get("username").toString());
        System.out.println(byUsername);
        if(byUsername!=null){
            if(byUsername.getPassword().equals(user.get("password"))){
                //session.setAttribute("loginuser",username);
                String s_token = token.getToken(byUsername);
                map.put("token",s_token);
                map.put("flg","true");
                map.put("msg","登录成功！");
                System.out.println(map);
                return map;
            }else{
                map.put("flg","false");
                map.put("msg","密码错误！");
                System.out.println(map);
                return map;
            }
        }else{
            map.put("flg","false");
            map.put("msg","用户不存在！");
            System.out.println(map);
            return map;
        }

    }


}
