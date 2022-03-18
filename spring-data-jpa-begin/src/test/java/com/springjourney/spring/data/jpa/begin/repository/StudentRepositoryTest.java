package com.springjourney.spring.data.jpa.begin.repository;

import com.springjourney.spring.data.jpa.begin.entity.Guardian;
import com.springjourney.spring.data.jpa.begin.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("praveenbyreddi@gmail.com")
                .firstName("Praveen")
                .lastName("Kumar")
                //.guardianName("Srinivasa Rao")
                //.guardianEmail("srinu@gmail.com")
                //.guardianMobile("9999999999")
                .build();

        studentRepository.save(student);
        System.out.println(student);
    }

    @Test
    public void saveStudentWithGuardianDetails(){
        Guardian guardian = Guardian.builder()
                .email("nikhil@gmail.com")
                .name("nikhil")
                .mobile("9999999989")
                .build();
        Student student = Student.builder()
                .firstName("Pavan")
                .lastName("kumar")
                .emailId("pavan@gmail.com")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }
    @Test
    public void printAllStudent(){
        List<Student> studentList = studentRepository.findAll();

        System.out.println("studentList "+ studentList);
    }

    @Test
    public void printStudentByFirstName(){
        List<Student> students =
                studentRepository.findByFirstName("Praveen");
        System.out.println(students);
    }

    @Test
    public void printStudentByFirstNameContaining(){
        List<Student> students =
                studentRepository.findByFirstNameContaining("ee");
        System.out.println(students);
    }
    @Test
    public void printStudentBasedOnGuardianName(){
        List<Student> students =
                studentRepository.findByGuardianName("nikhil");
        System.out.println(students);
    }
}