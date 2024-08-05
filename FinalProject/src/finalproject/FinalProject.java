/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalproject;
import java.io.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class FinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dburl = "jdbc:sqlserver://ZEYADELBANNA:1433;DatabaseName=Airlines Booking App;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";
            Connection connection = DriverManager.getConnection(dburl);
            Statement stat = connection.createStatement();
            String query ="select * from Accounts";
            ResultSet rs = stat.executeQuery(query);
            while(rs.next())
            {
             System.out.println(rs.getString(1) + " "+ rs.getString(2));   
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FinalProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        }
    }
    


