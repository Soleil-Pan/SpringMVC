package com.pyp.repository;

import com.pyp.entity.Student;

import java.util.Collection;

public interface StudentRepository {
    //返回全部的数组
    public Collection<Student> findAll();
    //通过ID返回
    public Student findById(long id);
    //添加和修改
    public void saveOrUpdate(Student student);
    //删除
    public void deleteById(long id);
}
