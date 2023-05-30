package org.example.pojo;

import java.util.List;

/**
 * @project:
 * @author: mikudd3
 * @version: 1.0
 */
public class Course {
    private int courseNo;
    private String courseName;


    //在课程类Course类中保留学生信息
    private List<Student> students;

    public int getCourseNo() {
        return this.courseNo;
    }

    public void setCourseNo(int courseNo) {
        this.courseNo = courseNo;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "课程编号:" + this.courseNo + "\t课程名称:" + this.courseName;
    }

}