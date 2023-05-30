package org.example.mapper;

import org.example.pojo.Student;

import java.util.List;

public interface IStudentMapper {
    List<Student> queryStudentsAndCourses();
}