/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

import com.databaseCon.DB;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author David Pude
 */
public class MemberRepository {
    public void insertMemberInfo(MemberEntity memberEntity) {
        try {
            // create query
            String query = "insert into member (userId, firstname, lastname, "
                    + "birthdate, mobileNumber, gender, address) "
                    + "values(?,?,?,?,?,?,?)";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1, String.valueOf(memberEntity.getUserId()));
            ps.setString(2, memberEntity.getFistname());
            ps.setString(3, memberEntity.getLastname());
            ps.setString(4, memberEntity.getBirthdate());
            ps.setString(5, memberEntity.getMobileNumber());
            ps.setString(6, memberEntity.getGender());
            ps.setString(7, memberEntity.getAddress());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registration successful!");
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public String getMemberInfo(String userId) {
        String fullname = "";
        try {
            String query = "select * from member where userId = '"+userId+"'";
            Statement st = DB.con.prepareStatement(query);

            ResultSet rs = st.executeQuery(query);
            
            if (rs.next()) {
                String firstname = rs.getString(3);
                String lastname = rs.getString(4);
                
                fullname = firstname + " " + lastname;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return fullname;
    }
}
