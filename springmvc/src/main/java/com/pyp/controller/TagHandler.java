package com.pyp.controller;


import com.pyp.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tag")
public class TagHandler {

    @GetMapping("/get")
    public ModelAndView get(){
        ModelAndView modelAndView = new ModelAndView("Tag");
        Student student = new Student(1l, "张三", 20);
        modelAndView.addObject("student",student);
        return modelAndView;
    }
}
