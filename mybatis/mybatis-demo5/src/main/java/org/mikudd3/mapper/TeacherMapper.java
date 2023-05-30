package org.mikudd3.mapper;

import org.mikudd3.pojo.Teacher;

public interface TeacherMapper {
    Teacher queryTeacherAndAllCourseById(Long l);
}