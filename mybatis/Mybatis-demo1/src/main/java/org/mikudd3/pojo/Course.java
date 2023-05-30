package org.mikudd3.pojo;

/**
 * @project:
 * @author: mikudd3
 * @version: 1.0
 */
public class Course {
    private Integer cNo;
    private String cName;
    private String teacher;
    //课程属性
    //true 表示必修课，false 表示选修课
    //private Boolean cProperties;

    public Course() {
    }

    /*public Course(Integer cNo, String cName, String teacher, Boolean cProperties) {
        this.cNo = cNo;
        this.cName = cName;
        this.teacher = teacher;
        this.cProperties = cProperties;
    }*/

    public Course(Integer cNo, String cName, String teacher) {
        this.cNo = cNo;
        this.cName = cName;
        this.teacher = teacher;
    }

    public Integer getcNo() {
        return cNo;
    }

    public void setcNo(Integer cNo) {
        this.cNo = cNo;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    /*public Boolean getcProperties() {
        return cProperties;
    }

    public void setcProperties(Boolean cProperties) {
        this.cProperties = cProperties;
    }*/

    @Override
    public String toString() {
        return "Course{" +
                "cNo=" + cNo +
                ", cName='" + cName + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }

    /*@Override
    public String toString() {
        return "Course{" +
                "cNo=" + cNo +
                ", cName='" + cName + '\'' +
                ", teacher='" + teacher + '\'' +
                ", cProperties=" + cProperties +
                '}';
    }*/
}
