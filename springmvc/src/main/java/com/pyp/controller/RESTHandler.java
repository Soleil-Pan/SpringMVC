package com.pyp.controller;

import com.pyp.entity.Student;
import com.pyp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Collection;

@RestController
@RequestMapping("/rest")
public class RESTHandler {

    @Autowired
    private StudentRepository studentRepository;

    //同步请求，手动设置乱码问题,查询只能接受get请求
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    @GetMapping("/findAll")
    public Collection<Student> findAll(HttpServletResponse response){
        response.setContentType("text/json;charset=UTF-8");
        return studentRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }

    @PostMapping("/deleteByID/{id}")
    public void deleteByID(@PathVariable("id") long id){
        studentRepository.deleteById(id);
    }
}
