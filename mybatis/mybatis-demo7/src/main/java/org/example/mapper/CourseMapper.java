package org.example.mapper;

import org.example.pojo.Course;

import java.util.List;

public interface CourseMapper {
    //列出每门课程的多项成绩信息
    List<Course> queryCourseAndScore();
}