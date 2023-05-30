package org.mikudd3.pojo;

import java.util.Date;

/**
 * @project: 定义一个员工类
 * @author: mikudd3
 * @version: 1.0
 */
public class Employee {
    // 员工编号
    private int eNo;
    //员工姓名
    private String eName;
    //岗位
    private String job;
    //直接上级
    private int mgr;
    //入职日期
    private Date hireDate;
    //工资
    private double sal;
    //奖金
    private double comm;
    //部门编号
    private int dNo;

    public int getENo() {
        return this.eNo;
    }

    public void setENo(int eNo) {
        this.eNo = eNo;
    }

    public String getEName() {
        return this.eName;
    }

    public void setEName(String eName) {
        this.eName = eName;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return this.mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public Date getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getSal() {
        return this.sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getComm() {
        return this.comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public int getDNo() {
        return this.dNo;
    }

    public void setDNo(int dNo) {
        this.dNo = dNo;
    }

    @Override
    public String toString() {
        return "{" +
                " eNo='" + getENo() + "'" +
                ", eName='" + getEName() + "'" +
                ", job='" + getJob() + "'" +
                ", mgr='" + getMgr() + "'" +
                ", hireDate='" + getHireDate() + "'" +
                ", sal='" + getSal() + "'" +
                ", comm='" + getComm() + "'" +
                ", dNo='" + getDNo() + "'" +
                "}";
    }
}