package org.mikudd3.pojo;

/**
 * @project: 定义一个部门类 Department
 * @author: mikudd3
 * @version: 1.0
 */
public class Department {
    //部门编号
    private int dNo;
    //部门名称
    private String dName;
    //部门地址
    private String address;

    public int getDNo() {
        return this.dNo;
    }

    public void setDNo(int dNo) {
        this.dNo = dNo;
    }

    public String getDName() {
        return this.dName;
    }

    public void setDName(String dName) {
        this.dName = dName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{" +
                " deptNo='" + getDNo() + "'" +
                ", dName='" + getDName() + "'" +
                ", address='" + getAddress() + "'" +
                "}";
    }
}
