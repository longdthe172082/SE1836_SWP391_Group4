/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Model.Account;
import Model.Role;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author SHD
 */
public class UserDAO extends DBContext{
    public Account getAccountLogin(String username, String password) {
       try {
            String sql = "SELECT * FROM Account where username like ? and password like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {              
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3),new UserDAO().getRole(rs.getInt(11)));
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
}
