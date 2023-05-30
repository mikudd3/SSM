package org.lanqiao.pojo;

/**
 * 定义一个员工类
 * @author lanqiao
 */
public class Salary {
    // 工资单编号
    private String bNo;
    // 员工编号
    private String eNo;
    // 基本工资
    private double basePay;
    // 五险一金
    private double insurancePay;
    // 绩效奖金
    private double meritPay;
    // 补贴
    private double subsidyPay;
    // 加班费
    private double overtimePay;


    public String getBNo() {
        return bNo;
    }

    public void setBNo(String bNo) {
        this.bNo = bNo;
    }


    public String getENo() {
        return eNo;
    }

    public void setENo(String eNo) {
        this.eNo = eNo;
    }


    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }


    public double getInsurancePay() {
        return insurancePay;
    }

    public void setInsurancePay(double insurancePay) {
        this.insurancePay = insurancePay;
    }


    public double getMeritPay() {
        return meritPay;
    }

    public void setMeritPay(double meritPay) {
        this.meritPay = meritPay;
    }


    public double getSubsidyPay() {
        return subsidyPay;
    }

    public void setSubsidyPay(double subsidyPay) {
        this.subsidyPay = subsidyPay;
    }


    public double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }

    @Override
    public String toString() {
      return "Salary{" +
          "bNo='" + bNo + '\'' +
          ", eNo='" + eNo + '\'' +
          ", basePay=" + basePay +
          ", insurancePay=" + insurancePay +
          ", meritPay=" + meritPay +
          ", subsidyPay=" + subsidyPay +
          ", overtimePay=" + overtimePay +
          '}';
    }
}
