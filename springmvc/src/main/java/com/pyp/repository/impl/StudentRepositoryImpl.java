package com.pyp.repository.impl;

import com.pyp.entity.Student;
import com.pyp.repository.StudentRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    //静态集合模拟数据库
    private static Map<Long,Student> studentMap;

    static {
       studentMap = new HashMap<>();
       studentMap.put(1l,new Student(1l,"张三",20));
       studentMap.put(2l,new Student(2l,"李四",21));
       studentMap.put(3l,new Student(2l,"王五",22));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
