/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class Account {
    private int UserId;
    private String UserName;
    private String Password;
    private String AccName;
    private String Fullname;
    private String Dob;
    private String Sex;
    private String Address;
    private String PhoneNumber;
    private String Email;
    private Role RoleId;

    public Account() {
    }

    public Account(int UserId, String UserName, String Password, String AccName, String Fullname, String Dob, String Sex, String Address, String PhoneNumber, String Email, Role RoleId) {
        this.UserId = UserId;
        this.UserName = UserName;
        this.Password = Password;
        this.AccName = AccName;
        this.Fullname = Fullname;
        this.Dob = Dob;
        this.Sex = Sex;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
        this.RoleId = RoleId;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getAccName() {
        return AccName;
    }

    public void setAccName(String AccName) {
        this.AccName = AccName;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
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

    public Role getRoleId() {
        return RoleId;
    }

    public void setRoleId(Role RoleId) {
        this.RoleId = RoleId;
    }

    @Override
    public String toString() {
        return "Account{" + "UserId=" + UserId + ", UserName=" + UserName + ", Password=" + Password + ", AccName=" + AccName + ", Fullname=" + Fullname + ", Dob=" + Dob + ", Sex=" + Sex + ", Address=" + Address + ", PhoneNumber=" + PhoneNumber + ", Email=" + Email + ", RoleId=" + RoleId + '}';
    }

    
    
}
