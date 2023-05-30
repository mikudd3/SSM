package org.lanqiao.pojo;

/**
 * 定义一个部门类
 *
 * @author lanqiao
 */

import java.util.List;

/**
 * 定义一个部门类
 * @author lanqiao
 */
public class Department {
    // 部门编号
    private String dNo;
    // 部门名称
    private String dName;
    // 负责人编号
    private String mgrNo;

    // 部门下所有岗位的信息
    private List<Job> jobs;

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public String getDNo() {
        return dNo;
    }

    public void setDNo(String dNo) {
        this.dNo = dNo;
    }


    public String getDName() {
        return dName;
    }

    public void setDName(String dName) {
        this.dName = dName;
    }


    public String getMgrNo() {
        return mgrNo;
    }

    public void setMgrNo(String mgrNo) {
        this.mgrNo = mgrNo;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dNo='" + dNo + '\'' +
                ", dName='" + dName + '\'' +
                ", mgrNo='" + mgrNo + '\'' +
                ", jobs=" + jobs +
                '}';
    }
}
