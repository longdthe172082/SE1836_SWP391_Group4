/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Phong
 */
public class Payment {
    private int PayId;
    private String Method;
    private String Date;
    private String Price;
    private Mentee MenteeId;

    public Payment() {
    }

    public Payment(int PayId, String Method, String Date, String Price, Mentee MenteeId) {
        this.PayId = PayId;
        this.Method = Method;
        this.Date = Date;
        this.Price = Price;
        this.MenteeId = MenteeId;
    }

    public int getPayId() {
        return PayId;
    }

    public void setPayId(int PayId) {
        this.PayId = PayId;
    }

    public String getMethod() {
        return Method;
    }

    public void setMethod(String Method) {
        this.Method = Method;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public Mentee getMenteeId() {
        return MenteeId;
    }

    public void setMenteeId(Mentee MenteeId) {
        this.MenteeId = MenteeId;
    }

    @Override
    public String toString() {
        return "Payment{" + "PayId=" + PayId + ", Method=" + Method + ", Date=" + Date + ", Price=" + Price + ", MenteeId=" + MenteeId + '}';
    }
    
    
}
