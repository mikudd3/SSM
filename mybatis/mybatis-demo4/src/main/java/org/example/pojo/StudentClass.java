package org.example.pojo;

import java.util.List;

/**
 * @project:
 * @author: mikudd3
 * @version: 1.0
 */
public class StudentClass {
    private int classId;
    private String className;
    // 班级中的学生信息
    private List<Student> students;

    //setter、getter
    public int getClassId() {
        return this.classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


    @Override
    public String toString() {
        return "StudentClass{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", students=" + students +
                '}';
    }
}
