/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import br.com.ecommerce.entities.Pagamento;
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
public class CartaoDao {
    public void create(Pagamento pag) throws SQLException{
    Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt =  null;
        
        
        
       
        try {
                   
                      
                      
                      
                      stmt =  con.prepareStatement(" INSERT INTO pagamento(pag_nome_titular, pag_card_numero, pag_cod_seguranca, pag_data_venci) VALUES (?, ?, ?, ?)");
                      stmt.setString(1, pag.getPag_nome_titular());
                       stmt.setString(2, pag.getPag_card_numero());
                       stmt.setString(3, pag.getPag_cod_seguranca());
                       stmt.setString(4, pag.getPag_data_venci());
                       
                       
                        
                      stmt.executeUpdate();
                      
                      JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
                                  JOptionPane.showMessageDialog(null, "Salvo com sucesso");

            java.util.logging.Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null,  ex);
        }
    
    }

    public List<Pagamento> read() throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt =  null;
        ResultSet rs = null;
               List<Pagamento> pag = new ArrayList<>();

         try {
            
        stmt =  con.prepareStatement("SELECT pag_nome_titular, pag_card_numero, pag_cod_seguranca, pag_data_venci FROM pagamento ORDER BY pag_id DESC LIMIT 1");
        
        rs = stmt.executeQuery();
 
        while (rs.next()) {
              Pagamento  pagamento  = new Pagamento();
                
                pagamento.setPag_nome_titular(rs.getString("pag_nome_titular"));
                pagamento.setPag_card_numero(rs.getString("pag_card_numero"));
                pagamento.setPag_cod_seguranca(rs.getString("pag_cod_seguranca"));
                pagamento.setPag_data_venci(rs.getString("pag_data_venci"));
                 
                pag.add(pagamento);
                
             }
               
                     
        } catch (SQLException ex) {
                                  

            java.util.logging.Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null,  ex);
        }
        return pag;
        
       
        
    }
}
