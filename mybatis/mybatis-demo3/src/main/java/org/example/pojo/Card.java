package org.example.pojo;

/**
 * 定义一个 Card 类
 * @author lanqiao
 */
public class Card {
  // 学生证编号
  private String cardId;
  // 学生姓名
  private String sName;
  // 学生证描述信息
  private String cardInfo;


  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }


  public String getSName() {
    return sName;
  }

  public void setSName(String sName) {
    this.sName = sName;
  }


  public String getCardInfo() {
    return cardInfo;
  }

  public void setCardInfo(String cardInfo) {
    this.cardInfo = cardInfo;
  }

  @Override
  public String toString() {
    return "Card{" +
        "cardId='" + cardId + '\'' +
        ", sName='" + sName + '\'' +
        ", cardInfo='" + cardInfo + '\'' +
        '}';
  }

}
