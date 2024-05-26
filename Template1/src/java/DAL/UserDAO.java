/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Model.Account;
import Model.Role;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class UserDAO extends DBContext {

    public Account getAccountLogin(String username, String password) {
        try {
            String sql = "SELECT * FROM Account where UserName like ? and Password like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), new UserDAO().getRole(rs.getInt(11)));
            }
        } catch (Exception ex) {

        }
        return null;
    }

    public String getAccountUsername(String username) {
        try {
            String sql = "SELECT UserName FROM Account where UserName like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception ex) {

        }
        return null;
    }

    public String getAccountEmail(String email) {
        try {
            String sql = "SELECT Email FROM Account where Email like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, email);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception ex) {

        }
        return null;
    }

    public Role getRole(int roleId) {
        try {
            String sql = "SELECT * FROM Role where RoleId = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, roleId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return new Role(rs.getInt(1), rs.getString(2));
            }
        } catch (Exception ex) {

        }
        return null;
    }

    public List<Role> getRoleList() {
        List<Role> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Role";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new Role(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception ex) {

        }
        return list;
    }

    public void add(Account a) {
        try {
            String sql = "INSERT INTO [dbo].[Account]\n"
                    + "           ([UserName]\n"
                    + "           ,[Password]\n"
                    + "           ,[AccName]\n"
                    + "           ,[Fullname]\n"
                    + "           ,[DOB]\n"
                    + "           ,[Sex]\n"
                    + "           ,[Address]\n"
                    + "           ,[PhoneNumber]\n"
                    + "           ,[Email]\n"
                    + "           ,[RoleId])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, a.getUserName());
            stm.setString(2, a.getPass());
            stm.setString(3, a.getAccName());
            stm.setString(4, a.getFullName());
            stm.setString(5, a.getDob());
            stm.setString(6, a.getSex());
            stm.setString(7, a.getAddress());
            stm.setString(8, a.getPhoneNumber());
            stm.setString(9, a.getEmail());
            stm.setInt(10, a.getRoleId().getRoleId());
            stm.executeUpdate();

        } catch (Exception ex) {

        }
    }
}
