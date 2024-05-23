/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Model.CV;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Phong
 */
public class CV_DAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public CV viewCVByMentorId(String MentorId){
        
        String query = "";
        
        try{
            //mo ket noi voi sql
            conn = new DBContext().connection;
            //nem cau lenh query len sql server
            ps = conn.prepareStatement(query);
            //truyen cau lenh query vao ?
            ps.setString(1, MentorId);
            //execute query va nhan ket qua
            rs = ps.executeQuery();
            
            while(rs.next()){
                
            }
            
        } catch(Exception e){
            
        }
        
        return null;
    }
    
    public void createCV(){
        
        String query = "";
        
        try{
            
        } catch(Exception e){
            
        }
        
    }
    
}
