/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

import com.databaseCon.DB;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author David Pude
 */
public class UserRepository {
    public void insertDataSignup(UserEntity userEntity, MemberEntity memberEntity) {
        try {
            // create query
            String query = "insert into user (username, password) values(?,?)";
            PreparedStatement ps = DB.con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, userEntity.getUsername());
            ps.setString(2, userEntity.getPassword());
            ps.executeUpdate();
            
            // Get last saved ID
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                
                // set userId with the last saved ID for foreign key value
                memberEntity.setUserId(id);
                
                MemberRepository memberRepo = new MemberRepository();
                memberRepo.insertMemberInfo(memberEntity);
            }
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public String login(String username, String password) {
        String id = null;
        try {
            // Query to get user
            String query = "select * from user "
                    + "where username = '"+username+"' "
                    + "AND password = '"+password+"'";
            
           Statement st = DB.con.createStatement();
           ResultSet rs = st.executeQuery(query);
           
           if (rs.next()) {
               id = rs.getString(1);
           } else {
               JOptionPane.showMessageDialog(null, "Username or password is incorrect.");
           }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return id;
    }
}
