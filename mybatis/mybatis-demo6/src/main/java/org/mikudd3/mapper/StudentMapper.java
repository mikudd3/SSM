package org.mikudd3.mapper;

import org.mikudd3.pojo.Student;

public interface StudentMapper {
    Student queryStudentAndCourseBySNo(Integer sId);
}