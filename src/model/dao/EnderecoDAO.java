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
                   
                      
                      
                      
                      stmt =  con.prepareStatement(" INSERT INTO endereco(ender_comple, ender_numero, ender_logradouro, ender_bairro, ender_cidade, ender_estado) VALUES (?, ?, ?, ?, ?, ?)");
                       stmt.setString(1, ender.getEnder_compl());
                       stmt.setString(2, ender.getEnder_numero());
                       stmt.setString(3, ender.getEnder_logra());
                       stmt.setString(4, ender.getEnder_bairro());
                       stmt.setString(5,ender.getEnder_cidade());
                      stmt.setString(6, ender.getEnder_estado());
                       
                        
                      stmt.executeUpdate();
                      
                      JOptionPane.showMessageDialog(null, "Endereço adicionado com sucesso ");
        } catch (SQLException ex) {

            java.util.logging.Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null,  ex);
        }
    
    }

    public List<Endereco> read() throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt =  null;
        ResultSet rs = null;
               List<Endereco> enderecos = new ArrayList<>();

         try {
            
        stmt =  con.prepareStatement("SELECT ender_id, ender_comple, ender_numero, ender_logradouro, ender_bairro, ender_cidade, ender_estado FROM endereco ORDER BY ender_id DESC LIMIT 1");
        
        rs = stmt.executeQuery();
 
        while (rs.next()) {
              Endereco  ender  = new Endereco();
                
                ender.setEnder_estado(rs.getString("ender_estado"));
                ender.setEnder_cidade(rs.getString("ender_cidade"));
                ender.setEnder_bairro(rs.getString("ender_bairro"));
                ender.setEnder_logra(rs.getString("ender_logradouro"));
                ender.setEnder_numero(rs.getString("ender_numero"));
                ender.setEnder_compl(rs.getString("ender_comple"));
                 ender.setEnder_id(rs.getInt("ender_id"));
                enderecos.add(ender);
                
             }
               
                     
        } catch (SQLException ex) {

            java.util.logging.Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null,  ex);
        }
        return enderecos;
        
       
        
    }
    
    
    
    
    public void delete(Endereco ender) throws SQLException{
        
        try {
            
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt =  null;
        ResultSet rs = null;
            
        stmt =  con.prepareStatement("DELETE FROM endereco WHERE ender_id = ? ");
        stmt.setInt(1, ender.getEnder_id());
         stmt.executeUpdate();
         JOptionPane.showMessageDialog(null ,"Endereço excluido com sucesso");
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null ,"Endereço excluido com sucesso" + e);

        }
       
    }
}
