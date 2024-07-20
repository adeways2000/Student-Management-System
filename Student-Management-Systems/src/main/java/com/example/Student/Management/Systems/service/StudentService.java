package com.example.Student.Management.Systems.service;

import com.example.Student.Management.Systems.entity.Student;

import java.util.List;

public interface StudentService {

   List<Student> getAllStudents();

   Student saveStudent(Student student);

   Student getStudentById(Long id);

   Student updateStudent(Student student);

   void deleteStudentById(Long id);
}
