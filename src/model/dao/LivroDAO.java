/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import br.com.ecommerce.entities.Endereco;
import br.com.ecommerce.entities.Livro;
import com.mysql.jdbc;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
        }
    
    }
    
    public List<Livro> read() throws SQLException{
     
           Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt =  null;
        ResultSet rs = null;
               List<Livro> livros = new ArrayList<>();

         try {
            
        stmt =  con.prepareStatement("SELECT * FROM livro");
        
        rs = stmt.executeQuery();
 
        while (rs.next()) {
                Livro liv = new Livro();
                
                liv.setLiv_id(rs.getInt("liv_id"));
                liv.setLiv_titulo(rs.getString("liv_titulo"));
                liv.setLiv_preco(rs.getInt("liv_preco"));
                 
                livros.add(liv);
                
             }
               
                     
        } catch (SQLException ex) {
                                  JOptionPane.showMessageDialog(null, "Salvo com sucesso");

            java.util.logging.Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null,  ex);
        }
        return livros;
        
    
    }
    
    public void delete(Livro liv) throws SQLException{
        
        try {
            
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt =  null;
        ResultSet rs = null;
            
        stmt =  con.prepareStatement("DELETE FROM livro WHERE liv_id = ?");
        stmt.setInt(1, liv.getLiv_id());
         stmt.executeUpdate();
         JOptionPane.showMessageDialog(null ,"livro excluido com sucesso");
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null ,"Livro não foi excluido" + e);

        }
       
    }
}
