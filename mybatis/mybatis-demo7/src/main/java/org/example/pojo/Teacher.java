package org.example.pojo;

/**
 * 定义一个 Teacher 类
 * @author lanqiao
 */
public class Teacher {
  // 教师编号
  private long tId;
  // 教师姓名
  private String tName;
  // 学院
  private String tSchool;

  public long getTId() {
    return tId;
  }

  public void setTId(long tId) {
    this.tId = tId;
  }


  public String getTName() {
    return tName;
  }

  public void setTName(String tName) {
    this.tName = tName;
  }


  public String getTSchool() {
    return tSchool;
  }

  public void setTSchool(String tSchool) {
    this.tSchool = tSchool;
  }

  @Override
  public String toString() {
    return "Teacher{" +
        "tId=" + tId +
        ", tName='" + tName + '\'' +
        ", tSchool='" + tSchool + '\'' +
        '}';
  }

}
