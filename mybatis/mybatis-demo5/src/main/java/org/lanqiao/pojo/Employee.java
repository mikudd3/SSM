package org.lanqiao.pojo;

/**
 * 定义一个员工类
 * @author lanqiao
 */
public class Employee {
    // 员工编号
    private String eNo;
    // 部门编号
    private String dNo;
    // 岗位编号
    private String jNo;
    // 员工姓名
    private String eName;
    // 员工身份证号
    private String cardId;
    // 性别
    private String sex;
    // 手机号
    private String phone;
    // 邮箱
    private String email;


    public String getENo() {
        return eNo;
    }

    public void setENo(String eNo) {
        this.eNo = eNo;
    }


    public String getDNo() {
        return dNo;
    }

    public void setDNo(String dNo) {
        this.dNo = dNo;
    }


    public String getJNo() {
        return jNo;
    }

    public void setJNo(String jNo) {
        this.jNo = jNo;
    }


    public String getEName() {
        return eName;
    }

    public void setEName(String eName) {
        this.eName = eName;
    }


    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
            "eNo='" + eNo + '\'' +
            ", dNo='" + dNo + '\'' +
            ", jNo='" + jNo + '\'' +
            ", eName='" + eName + '\'' +
            ", cardId='" + cardId + '\'' +
            ", sex='" + sex + '\'' +
            ", phone='" + phone + '\'' +
            ", email='" + email + '\'' +
            '}';
    }
}
