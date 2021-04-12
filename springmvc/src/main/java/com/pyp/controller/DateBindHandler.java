package com.pyp.controller;

import com.pyp.entity.User;
import com.pyp.entity.UserList;
import com.pyp.entity.UserMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/*@Controller 表示该控制器的每一个业务方法的返回值都会交给视图解析器进行解析，
如果只需要将数据响应给客户端，而不需要进行视图解析，则需要在对应的业务方法定义处添加 @ResponseBody*/
/*@RestController 表示该控制器会直接将业务方法的返回值响应给客户端，不进行视图解析。*/

@RestController     //Controller中的所有值都是以 rest形式返回，不会解析,省略方法注解的@ResponseBody
@RequestMapping("/data")
public class DateBindHandler {

    /*@ResponseBody 表示 Spring MVC 会直接将业务方法的返回值响应给客户端，
    如果不加 @ResponseBody 注解，Spring MVC 会将业务方法的放回值传递给 DispatcherServlet，
    再由 DisptacherServlet 调用 ViewResolver 对返回值进行解析，映射到一个 JSP 资源。*/
    @RequestMapping("/baseType")
    //@ResponseBody   //不会把当前业务方法的返回值通过视图解析器解析，不会映射成jsp，直接返回客户端
    public String baseType(int id){ return id+""; }

    //包装类可以接收null,当HTTP请求没有参数时，使用包装类定义形参的数据类型
    @RequestMapping("/packageType")
    //@ResponseBody
    //required表示必须填写参数，默认值为ture，当required=false时，默认值为defaultValue的值
    public String packageType(@RequestParam(value = "num",required = false,defaultValue = "0") Integer id){
        return id+"";
    }

    //用数组接收
    @RequestMapping("/array")
    //@ResponseBody
    public String array(String[] name){
        String str = Arrays.toString(name);
        return str;
    }

    @RequestMapping("/list")
    public String list(UserList userList) {
        StringBuffer str = new StringBuffer();
        for (User user : userList.getUsers()){
            str.append(user);
        }
        return str.toString();
    }

    @RequestMapping("/map")
    public String map(UserMap userMap){
        StringBuffer str = new StringBuffer();
        for (String key : userMap.getUsers().keySet()) {
            User user = userMap.getUsers().get(key);
            str.append(user);
        }
        return str.toString();
    }

    @RequestMapping("/json")
    //接收客户端的json数据,加@RequestBody
    public User json(@RequestBody User user){
        System.out.println(user);
        user.setId(6);
        user.setName("张六");
        return user;
    }
}
