/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;
import br.com.ecommerce.entities.Livro;
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
        }
    
    }

    public List<Pessoafisica> read() throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt =  null;
        ResultSet rs = null;
               List<Pessoafisica> pessoasfisicas = new ArrayList<>();

         try {
            
        stmt =  con.prepareStatement("SELECT pf_cpf, pf_email, pf_Nome, pf_Sobrenome FROM pessoafisica ORDER BY pf_id DESC LIMIT 1");
        
        rs = stmt.executeQuery();
 
        while (rs.next()) {
              Pessoafisica  pf  = new Pessoafisica();
                
                pf.setPf_cpf(rs.getString("pf_cpf"));
                pf.setPf_email(rs.getString("pf_email"));
                pf.setPf_nome(rs.getString("pf_"));
                pf.setPf_sobrenome(rs.getString("pf_sobrenome"));
                 
                pessoasfisicas.add(pf);
                
             }
               
                     
        } catch (SQLException ex) {
                                  JOptionPane.showMessageDialog(null, "Salvo com sucesso");

            java.util.logging.Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null,  ex);
        }
        return pessoasfisicas;
        
       
        
    }
}
