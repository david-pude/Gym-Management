package com.databaseCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author David Pude
 */
public class DB {
    public static Connection con = null;
    
    public static void loadConnection() {
        String url = "jdbc:mysql://localhost:3306/egym";
        String root = "root";
        String pass = "tDp.8R9Z";
        
        try {
            con = DriverManager.getConnection(url, root, pass);
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "error in database loading "+e);
        }
    }
}
