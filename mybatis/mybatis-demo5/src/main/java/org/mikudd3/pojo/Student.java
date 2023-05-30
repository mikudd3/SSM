package org.mikudd3.pojo;

/**
 * 定义一个 Student 类
 * @author lanqiao
 */
public class Student {
  // 学号
  private long sId;
  // 学生姓名
  private String sName;
  // 班级
  private long sClass;
  // 专业
  private String sMajor;
  // 出生日期
  private java.sql.Timestamp sBirthday;
  // 性别
  private String sSex;
  // 总学分
  private long creditPoint;


  public long getSId() {
    return sId;
  }

  public void setSId(long sId) {
    this.sId = sId;
  }


  public String getSName() {
    return sName;
  }

  public void setSName(String sName) {
    this.sName = sName;
  }


  public long getSClass() {
    return sClass;
  }

  public void setSClass(long sClass) {
    this.sClass = sClass;
  }


  public String getSMajor() {
    return sMajor;
  }

  public void setSMajor(String sMajor) {
    this.sMajor = sMajor;
  }


  public java.sql.Timestamp getSBirthday() {
    return sBirthday;
  }

  public void setSBirthday(java.sql.Timestamp sBirthday) {
    this.sBirthday = sBirthday;
  }


  public String getSSex() {
    return sSex;
  }

  public void setSSex(String sSex) {
    this.sSex = sSex;
  }


  public long getCreditPoint() {
    return creditPoint;
  }

  public void setCreditPoint(long creditPoint) {
    this.creditPoint = creditPoint;
  }
  
  @Override
  public String toString() {
    return "Student{" +
        "sId=" + sId +
        ", sName='" + sName + '\'' +
        ", sClass=" + sClass +
        ", sMajor='" + sMajor + '\'' +
        ", sBirthday=" + sBirthday +
        ", sSex='" + sSex + '\'' +
        ", creditPoint=" + creditPoint +
        '}';
  }
}
