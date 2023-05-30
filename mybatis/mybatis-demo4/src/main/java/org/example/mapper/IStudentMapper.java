package org.example.mapper;

import org.example.pojo.StudentClass;

public interface IStudentMapper {
    StudentClass queryClassAndStudentsByClassId(int classId);
}