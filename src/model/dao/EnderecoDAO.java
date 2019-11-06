/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;
import br.com.ecommerce.entities.Endereco;
import br.com.ecommerce.entities.Pessoafisica;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author nator
 */
public class EnderecoDAO {
   
    /**
     *
     * @param ender
     * @throws SQLException
     */
    public void create(Endereco ender) throws SQLException{
    Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt =  null;
        
        try {
                    stmt =  con.prepareStatement("insert into usuario (user_email, user_senha) VALUES (?, ?, ?)");
                       stmt.setString(1, ender.getEnder_bairro());
                       stmt.setString(2, ender.getEnder_estado());
                       stmt.setString(2, ender.getEnder_logra());
                       stmt.setString(2, ender.getEnder_estado());
                       stmt.setString(2, ender.getEnder_estado());
                       
                        
                      stmt.executeUpdate();
                      
                      JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
                                  JOptionPane.showMessageDialog(null, "Salvo com sucesso");

            java.util.logging.Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null,  ex);
        }finally {
        
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt);
            
        }
    
    }
}
