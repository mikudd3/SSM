package org.lanqiao.pojo;

/**
 * @project:
 * @author: mikudd3
 * @version: 1.0
 */

/**
 * 定义一个 Job 类
 *
 * @author lanqiao
 */
public class Job {
    // 岗位编号
    private String jNo;
    // 部门编号
    private String dNo;
    // 岗位名称
    private String job;

    public String getJNo() {
        return jNo;
    }

    public void setJNo(String jNo) {
        this.jNo = jNo;
    }


    public String getDNo() {
        return dNo;
    }

    public void setDNo(String dNo) {
        this.dNo = dNo;
    }


    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jNo='" + jNo + '\'' +
                ", dNo='" + dNo + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
