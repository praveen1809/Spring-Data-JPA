package com.springjourney.spring.data.jpa.begin.repository;

import com.springjourney.spring.data.jpa.begin.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
