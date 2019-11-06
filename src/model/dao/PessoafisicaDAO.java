/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;
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
public class PessoafisicaDAO {

    public void create(Pessoafisica pf) throws SQLException{
    Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt =  null;
        
        
        
       
        try {
                   
                      
                      
                      
                      stmt =  con.prepareStatement(" INSERT INTO pessoafisica(pf_cpf, pf_email, pf_senha, pf_Nome, pf_Sobrenome) VALUES (?, ?, ?, ?, ?)");
                      stmt.setString(1, pf.getPf_cpf());
                       stmt.setString(2, pf.getPf_email());
                       stmt.setString(3, pf.getPf_senha());
                       stmt.setString(4, pf.getPf_nome());
                       stmt.setString(5, pf.getPf_sobrenome());
                       
                        
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
