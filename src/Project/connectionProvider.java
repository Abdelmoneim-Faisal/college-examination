/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author masa
 */
public class connectionProvider {
    public static Connection getCon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegedb","root","");
            return c;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(connectionProvider.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
   
