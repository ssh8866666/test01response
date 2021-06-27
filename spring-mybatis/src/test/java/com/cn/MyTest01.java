package com.cn;

import com.cn.dao.StudentDao;
import com.cn.eneity.Student;
import com.cn.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest01 {
    @Test
    public void Test(){
        String config="applicationContext.xml";
        ApplicationContext sc=new ClassPathXmlApplicationContext(config);
        String names[] = sc.getBeanDefinitionNames();
        for (String name:names){
            System.out.println(name);
        }
    }
    @Test
    public void test02(){
        String config="applicationContext.xml";
        ApplicationContext sc=new ClassPathXmlApplicationContext(config);
        StudentService service =(StudentService) sc.getBean("studentService");
        Student student=new Student();
        student.setId(1015);
        student.setName("周2");
        student.setEmail("zhoufe2g@qq.com");
        student.setAge(22);
        int nums = service.addStudent(student);
        System.out.println(nums);
    }
    @Test
    public void test03(){
        String config="applicationContext.xml";
        ApplicationContext sc=new ClassPathXmlApplicationContext(config);
        StudentService service =(StudentService) sc.getBean("studentService");
        List<Student> students = service.queryStudents();
        for (Student student:students){
            System.out.println(student);
        }
    }
}
