package org.example.pojo;

/**
 * 定义一个 Score 类
 * @author lanqiao
 */
public class Score {
  // 学生编号
  private long sId;
  // 课程编号
  private long cId;
  // 成绩
  private double score;


  public long getSId() {
    return sId;
  }

  public void setSId(long sId) {
    this.sId = sId;
  }


  public long getCId() {
    return cId;
  }

  public void setCId(long cId) {
    this.cId = cId;
  }


  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }

  @Override
  public String toString() {
    return "Score{" +
        "sId=" + sId +
        ", cId=" + cId +
        ", score=" + score +
        '}';
  }

}
