/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.home;

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
public class ReservationRepository {
    public int saveReservation(ReservationEntity reservationEntity) {
        int id = 0;
        
        try {
            // create query
            String query = "insert into reservation (reserverId, reservationDate, "
                    + "area, participants) values(?,?,?,?)";
            PreparedStatement ps = DB.con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, String.valueOf(reservationEntity.getReserverId()));
            ps.setString(2, reservationEntity.getReservationDate());
            ps.setString(3, reservationEntity.getArea());
            ps.setString(4, String.valueOf(reservationEntity.getParticipants()));
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch(HeadlessException | SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return id;
    }
}
