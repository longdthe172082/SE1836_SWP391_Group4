/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Phong
 */
public class Mentee {
    private int MenteeId;
    private String FullName;
    private String AccName;
    
    private String PhoneNumber;
    private String Email;
    private String Avatar;
    private Account AccId;
    private String Total;

    public Mentee() {
    }

    public Mentee(int MenteeId, String FullName, String AccName, String PhoneNumber, String Email, String Avatar, Account AccId, String Total) {
        this.MenteeId = MenteeId;
        this.FullName = FullName;
        this.AccName = AccName;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
        this.Avatar = Avatar;
        this.AccId = AccId;
        this.Total = Total;
    }

    @Override
    public String toString() {
        return "Mentee{" + "MenteeId=" + MenteeId + ", FullName=" + FullName + ", AccName=" + AccName + ", PhoneNumber=" + PhoneNumber + ", Email=" + Email + ", Avatar=" + Avatar + ", AccId=" + AccId + ", Total=" + Total + '}';
    }

    public int getMenteeId() {
        return MenteeId;
    }

    public void setMenteeId(int MenteeId) {
        this.MenteeId = MenteeId;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getAccName() {
        return AccName;
    }

    public void setAccName(String AccName) {
        this.AccName = AccName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAvatar() {
        return Avatar;
    }

    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    public Account getAccId() {
        return AccId;
    }

    public void setAccId(Account AccId) {
        this.AccId = AccId;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

    
}
