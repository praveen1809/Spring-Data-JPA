package com.springjourney.spring.data.jpa.begin.repository;

import com.springjourney.spring.data.jpa.begin.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("praveenkumarbyreddi@gmail.com")
                .firstName("Praveen")
                .lastName("Kumar")
                .guardianName("Srinivasa Rao")
                .guardianEmail("srinu@gmail.com")
                .guardianMobile("9999999999")
                .build();

        studentRepository.save(student);
    }
}