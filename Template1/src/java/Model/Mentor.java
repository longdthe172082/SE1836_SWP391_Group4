/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Phong
 */
public class Mentor {
    private int MentorId;
    private String FullName;
    private String AccName;
    
    private String PhoneNumber;
    private String Email;
    private String Avatar;
    private Account AccId;

    public Mentor() {
    }

    public Mentor(int MentorId, String FullName, String AccName, String PhoneNumber, String Email, String Avatar, Account AccId) {
        this.MentorId = MentorId;
        this.FullName = FullName;
        this.AccName = AccName;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
        this.Avatar = Avatar;
        this.AccId = AccId;
    }

    public int getMentorId() {
        return MentorId;
    }

    public void setMentorId(int MentorId) {
        this.MentorId = MentorId;
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

    @Override
    public String toString() {
        return "Mentor{" + "MentorId=" + MentorId + ", FullName=" + FullName + ", AccName=" + AccName + ", PhoneNumber=" + PhoneNumber + ", Email=" + Email + ", Avatar=" + Avatar + ", AccId=" + AccId + '}';
    }

    
    
}
