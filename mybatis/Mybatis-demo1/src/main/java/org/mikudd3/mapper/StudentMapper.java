package org.mikudd3.mapper;

import org.mikudd3.pojo.Student;

import java.util.List;
import java.util.Map;

/**
 * @project:
 * @author: mikudd3
 * @version: 1.0
 */
public interface StudentMapper {

    //增加一个学生
    //void addStudentWithConverter(Student student);
    void addStudent(Student student);

    //根据学号，删除一个学生
    void deleteStudentByNo(Integer no);

    //根据学号，修改学生信息
    void updateStudentByNo(Student student);

    //查询全部学生
    List<Student> queryAllStudent();

    //根据学号，查询一个学生
    Student queryStudentByStuNo(int stuNo);
    //Student queryStudentByStuNoWithConverter(int stuNo);

    //调用存储过程，查询指定年级的学生人数
    void queryCountByGradeWithProcedure(Map<String, Object> param);
    //调用存储过程删除

    //调用存储过程，删除指定学号的学生
    int deleteByStuNoWithProcedure(Map<String, Object> param);


}
