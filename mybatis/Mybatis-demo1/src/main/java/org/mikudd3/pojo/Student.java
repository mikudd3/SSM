package org.mikudd3.pojo;

/**
 * @project: 创建实体类对象
 * @author: mikudd3
 * @version: 1.0
 */
public class Student {
    //学号
    private int stuNo;
    //姓名
    private String stuName;
    //年龄
    private int stuAge;
    //年级
    private String graName;
//    //性别 true 表示男，false 表示女
//    private boolean stuSex;

    public Student() {

    }

    public Student(int stuNo, String stuName, int stuAge, String graName) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.graName = graName;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getGraName() {
        return graName;
    }

    public void setGraName(String graName) {
        this.graName = graName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo=" + stuNo +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", graName='" + graName + '\'' +
                '}';
    }
    // 性别的 getter 、setter 方法
//    public Boolean getStuSex() {
//        return stuSex;
//    }
//
//    public void setStuSex(Boolean stuSex) {
//        this.stuSex = stuSex;
//    }

    //为了方便地输出对象中的内容，重写toString()方法
//    @Override
//    public String toString()    {
//        return   "学号:"+this.stuNo+"\t姓名:"+this.stuName
//                +"\t年龄:"+this.stuAge+"\t年级:"+this.graName+"\t性别："+this.stuSex;
//    }
}
