package org.example.mapper;


import org.example.pojo.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> selectStudentWithCard();
}