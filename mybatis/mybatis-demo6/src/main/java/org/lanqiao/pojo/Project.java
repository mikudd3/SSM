package org.lanqiao.pojo;

import java.sql.Timestamp;

/**
 * 定义一个 Project 类
 * @author lanqiao
 */
public class Project {
    // 项目编号
    private String pNo;
    // 项目名称
    private String pName;
    private Timestamp startTime;
    private Timestamp endTime;
  
  
    public String getPNo() {
      return pNo;
    }
  
    public void setPNo(String pNo) {
      this.pNo = pNo;
    }
  
  
    public String getPName() {
      return pName;
    }
  
    public void setPName(String pName) {
      this.pName = pName;
    }
  
  
    public Timestamp getStartTime() {
      return startTime;
    }
  
    public void setStartTime(Timestamp startTime) {
      this.startTime = startTime;
    }
  
  
    public Timestamp getEndTime() {
      return endTime;
    }
  
    public void setEndTime(Timestamp endTime) {
      this.endTime = endTime;
    }

    @Override
    public String toString() {
      return "Project{" +
          "pNo='" + pNo + '\'' +
          ", pName='" + pName + '\'' +
          ", startTime=" + startTime +
          ", endTime=" + endTime +
          '}';
    }
}