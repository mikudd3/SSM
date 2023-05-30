package org.mikudd3.pojo;

/**
 * @project:
 * @author: mikudd3
 * @version: 1.0
 */
public class StudentCard {
    //学生证号
    private int cardId;
    //学生证的相关信息
    private String cardInfo;

    //getter、setter
    public int getCardId() {
        return this.cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getCardInfo() {
        return this.cardInfo;
    }

    public void setCardInfo(String cardInfo) {
        this.cardInfo = cardInfo;
    }
}