package org.mikudd3.mapper;

import org.mikudd3.pojo.Student;
import org.mikudd3.pojo.StudentAndCardBusiness;

import java.util.List;
import java.util.Map;

/**
 * @project:
 * @author: mikudd3
 * @version: 1.0
 */
public interface StudentMapper {
    StudentAndCardBusiness queryStudentAndCardBusinessByStuNo(int stuNo);

}
