package com.pyp.controller;

import com.pyp.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller     /*和@Component相比多一个控制器的功能，将该类交给IoC容器来管理
(需要结合springmvc.xml的自动扫描配置)，同时使其成为一个控制器，可以接受客户端的请求*/
@RequestMapping(value = "/hello")
public class HelloHandler {
    /*将客户端的请求和业务方法关联*/          /*只能接受get请求*/           /*指定请求中必须包含某些参数，不然无法调用该方法*/
    @RequestMapping(value = "/index",method = RequestMethod.GET,params = {"name=pyp","id"})
    /*在形参列表中通过添加@RequestParam注解完成HTTP请求参数与业务方法形参的映射，HandlerAdapter自动完成数据类型转换*/
    public String index(@RequestParam("name") String aaa,@RequestParam("id") int bbb){
        System.out.println(aaa);
        System.out.println(bbb);
        System.out.println("执行了index......");
        return "index";
    }

    @RequestMapping("/rest/{name}/{id}")
    /*RESTful风格的URL,通过@Pathvariable注解完成请求参数与形参的映射*/
    public String rest(@PathVariable("name") String aaa,@PathVariable("id") int bbb){
        System.out.println(aaa);
        System.out.println(bbb);
        System.out.println("执行了index......");
        return "index";
    }

    /*通过映射可以直接在业务方法中获取Cookie的值*/
    @RequestMapping("/cookie")
    public  String cookie(@CookieValue(value = "JSESSIONID") String sessionId){
        System.out.println(sessionId);
        return "index";
    }

    /*绑定Javabean类型数据*/
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(User user){
        System.out.println(user);
        return "index";
    }

    @RequestMapping("/forward")
    private String forward(){
        return  "forward:/index.jsp";   //转发，地址栏不变
    }

    @RequestMapping("/redirect")
    public String redirect(){
        return "redirect:/index.jsp";   //重定向，地址栏改变
    }
}
