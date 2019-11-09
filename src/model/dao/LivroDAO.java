/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import br.com.ecommerce.entities.Livro;
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
public class LivroDAO {
    
    
    public void create(Livro liv) throws SQLException{
    Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt =  null;
        
        try {
                    stmt =  con.prepareStatement("insert into livro (liv_titulo, liv_preco) VALUES (?, ?)");
                       stmt.setString(1, liv.getLiv_titulo());
                       stmt.setDouble(2, liv.getLiv_preco());
                      
                       
                
                       
                        
                      stmt.executeUpdate();
                      
                      JOptionPane.showMessageDialog(null, "Livro adicionado ao carrinho com sucesso");
        } catch (SQLException ex) {
                                  JOptionPane.showMessageDialog(null, "Salvo com sucesso");

            java.util.logging.Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null,  ex);
        }finally {
        
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt);
            
        }
    
    }
}
