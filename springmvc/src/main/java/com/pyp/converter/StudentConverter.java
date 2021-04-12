package com.pyp.converter;

import com.pyp.entity.Student;
import org.springframework.core.convert.converter.Converter;

public class StudentConverter implements Converter<String, Student> {

    @Override
    public Student convert(String source) {
        //1-zhangsan-22
        //{"1","zhangsan","22"}
        String[] args = source.split("-");
        Student student = new Student();
        student.setId(Long.parseLong(args[0]));
        student.setName(args[1]);
        student.setAge(Integer.parseInt(args[2]));
        return student;
    }
}
