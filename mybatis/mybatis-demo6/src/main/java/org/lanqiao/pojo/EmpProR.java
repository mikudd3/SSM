package org.lanqiao.pojo;

/**
 * 定义一个 EmpProR 类
 * @author lanqiao
 */
public class EmpProR {
    // 关联表的主键
    private String epNo;
    // 员工编号
    private String eNo;
    // 项目编号
    private String pNo;

    public String getEpNo() {
        return epNo;
    }

    public void setEpNo(String epNo) {
        this.epNo = epNo;
    }


    public String getENo() {
        return eNo;
    }

    public void setENo(String eNo) {
        this.eNo = eNo;
    }


    public String getPNo() {
        return pNo;
    }

    public void setPNo(String pNo) {
        this.pNo = pNo;
    }
    
    @Override
    public String toString() {
      return "EmpProR{" +
          "epNo='" + epNo + '\'' +
          ", eNo='" + eNo + '\'' +
          ", pNo='" + pNo + '\'' +
          '}';
    }
}
