package com.cn.service;

import com.cn.eneity.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    List<Student> queryStudents();
}
