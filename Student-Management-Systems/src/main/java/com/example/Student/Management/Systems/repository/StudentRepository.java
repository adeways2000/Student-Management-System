package com.example.Student.Management.Systems.repository;

import com.example.Student.Management.Systems.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
