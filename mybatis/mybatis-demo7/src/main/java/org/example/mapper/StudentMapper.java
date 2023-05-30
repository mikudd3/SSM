package org.example.mapper;

import org.example.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //列出与每门课成绩都大于等于 80 分的所有学生信息以及对应的课程信息
    List<Student> queryStudentAndCourse();
}