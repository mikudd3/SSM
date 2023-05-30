package org.example.pojo;

import java.util.List;

/**
 * 定义一个 Coures 类
 *
 * @author lanqiao
 */
public class Course {
    // 课程编号
    private long cId;
    // 教师编号
    private long tId;
    // 课程名称
    private String cName;
    // 学分
    private long creditPoint;

    private List<Score> scores;


    public long getCId() {
        return cId;
    }

    public void setCId(long cId) {
        this.cId = cId;
    }


    public long getTId() {
        return tId;
    }

    public void setTId(long tId) {
        this.tId = tId;
    }


    public String getCName() {
        return cName;
    }

    public void setCName(String cName) {
        this.cName = cName;
    }


    public long getCreditPoint() {
        return creditPoint;
    }

    public void setCreditPoint(long creditPoint) {
        this.creditPoint = creditPoint;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cId=" + cId +
                ", tId=" + tId +
                ", cName='" + cName + '\'' +
                ", creditPoint=" + creditPoint +
                ", scores" + scores +
                '}';
    }

    /*@Override
    public String toString() {
        return "Course{" +
                "cId=" + cId +
                ", tId=" + tId +
                ", cName='" + cName + '\'' +
                ", creditPoint=" + creditPoint +
                '}';
    }*/
}