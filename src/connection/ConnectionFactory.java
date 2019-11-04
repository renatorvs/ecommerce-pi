/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import com.mysql.jdbc.Connection;
import com.sun.istack.internal.logging.Logger;
import static java.lang.Class.forName;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 *
 * @author nator
 */
public class ConnectionFactory {
    
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/ecommerce";
    private static final String USER = "root";
    private static final String PASS = "";
    
    
    public static java.sql.Connection getConnection() throws SQLException {
        
        try {
           Class.forName("com.mysql.jdbc.Driver");
           Class.forName("com.mysql.jdbc.Driver");


           return DriverManager.getConnection(URL, USER, PASS);
           
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(" Erro na conexão");
        }
    }
    
    
    public static void closeConnection(Connection con){
        try {
            if (con != null) {
            con.close();
        }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null,  ex);
        }
        
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        
        closeConnection(con);
        try {
            if (stmt != null) {
           stmt.close();
        }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null,  ex);
        }
        
    }
    
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet result ){
        
        
        
        closeConnection(con, stmt);
        try {
            if (result != null) {
           result.close();
           
           
        }
            
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null,  ex);
        }
        
    }

} 
