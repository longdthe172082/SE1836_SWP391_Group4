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
    private String Pass;
    private String accName;
    private String fullName;
    private String dob;
    private String sex;
    private String address;
    private String phoneNumber;
    private String email;
    private Role RoleId;

    public Account() {
    }

    public Account(String UserName, String Pass, String accName, String fullName, String dob, String sex, String address, String phoneNumber, String email, Role RoleId) {
        this.UserName = UserName;
        this.Pass = Pass;
        this.accName = accName;
        this.fullName = fullName;
        this.dob = dob;
        this.sex = sex;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.RoleId = RoleId;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Account(int UserId, String UserName, String Pass, Role RoleId) {
        this.UserId = UserId;
        this.UserName = UserName;
        this.Pass = Pass;
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

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public Role getRoleId() {
        return RoleId;
    }

    public void setRoleId(Role RoleId) {
        this.RoleId = RoleId;
    }

    @Override
    public String toString() {
        return "Account{" + "UserId=" + UserId + ", UserName=" + UserName + ", Pass=" + Pass + ", RoleId=" + RoleId + '}';
    }
    
    
}
