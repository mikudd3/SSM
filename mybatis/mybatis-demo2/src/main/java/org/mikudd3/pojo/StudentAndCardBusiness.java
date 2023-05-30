package org.mikudd3.pojo;

/**
 * @project:
 * @author: mikudd3
 * @version: 1.0
 */
public class StudentAndCardBusiness extends Student{
    //学生证号
    private int cardId;
    //学生证的相关信息
    private String cardInfo;
    //setter、getter
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

    @Override
    public String toString()   {
        return   "学号:"+this.getStuNo()+"\t姓名:"+this.getStuName()
                +"\t年龄:"+this.getStuAge()+"\t年级:"+this.getGraName()
                +"\t卡号:"+this.cardId+"\t卡信息:"+this.cardInfo;
    }
}
