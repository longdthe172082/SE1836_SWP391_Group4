/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Phong
 */
public class Staff {
    private int StaffId;
    private String StaffName;
    private String Pass;
    private Role RoleId;
    private Account AccId;

    public Staff() {
    }

    public Staff(int StaffId, String StaffName, String Pass, Role RoleId, Account AccId) {
        this.StaffId = StaffId;
        this.StaffName = StaffName;
        this.Pass = Pass;
        this.RoleId = RoleId;
        this.AccId = AccId;
    }

    public int getStaffId() {
        return StaffId;
    }

    public void setStaffId(int StaffId) {
        this.StaffId = StaffId;
    }

    public String getStaffName() {
        return StaffName;
    }

    public void setStaffName(String StaffName) {
        this.StaffName = StaffName;
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

    public Account getAccId() {
        return AccId;
    }

    public void setAccId(Account AccId) {
        this.AccId = AccId;
    }

    @Override
    public String toString() {
        return "Staff{" + "StaffId=" + StaffId + ", StaffName=" + StaffName + ", Pass=" + Pass + ", RoleId=" + RoleId + ", AccId=" + AccId + '}';
    }

    
    
    
    
}
