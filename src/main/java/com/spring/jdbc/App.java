package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring JDBC Started" );
//        spring jdbc -> JdbcTemplate
        
//        ApplicationContext context = 
//        		new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        ApplicationContext context = 
        		new AnnotationConfigApplicationContext(JdbcConfig.class);
        
//        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
        // Insert
//        Student student = new Student();
//        student.setId(666);
//        student.setName("John");
//        student.setCity("Lucknow");
//        
//        int result = studentDao.insert(student);
//        System.out.println("student added : " + result);
        
        // Update
//        Student student = new Student();
//        student.setId(245);
//        student.setName("Raj kumar");
//        student.setCity("Lucknow");
//        
//        int result = studentDao.change(student);
//        System.out.println("Data changed : " + result);
        
        
        // Delete
//        int result = studentDao.delete(666);
//        System.out.println("Deleted : " + result);
        
        // select single data
//        Student student = studentDao.getStudent(456);
//        System.out.println("student details: " + student);
        
        // select multiple students
        List<Student> students = studentDao.getAllStudents();
        for(Student s: students) {
        	System.out.println(s);
        }

    }
}

//insert Query
//String query = "insert into student(id,name,city) values(?,?,?)";


//fire Query
//int count = template.update(query,245,"Manish kumar","Kanpur");
//System.out.println("Number of records Inserted : " + count);
