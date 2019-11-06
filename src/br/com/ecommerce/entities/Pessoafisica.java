package br.com.ecommerce.entities;

import java.sql.SQLException;

/**
 *
 * @author nator
 */
public class Pessoafisica {
        private int pf_id;
        private String pf_cpf;
	private String pf_email;
	private String pf_senha;
	private String pf_nome;
	private String pf_sobrenome;
	
        
    public Pessoafisica(String pf_cpf, String pf_email, String pf_senha, String pf_nome, String pf_sobrenome ) {
            this.pf_cpf = pf_cpf;
            this.pf_email = pf_email;
            this.pf_senha = pf_senha;
            this.pf_nome = pf_nome;
            this.pf_sobrenome = pf_sobrenome;
	}
public Pessoafisica() throws SQLException {
        throw new SQLException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

    public String getPf_nome() {
		
		return pf_nome;
	}

    /**
     *
     * @param pf_email
     */
    public void setPf_email(String pf_email) {
        this.pf_email = pf_email;
    }

    /**
     *
     * @return
     */
    public String getPf_email() {
        return pf_email;
    }

    /**
     *
     * @return
     */
    public String getPf_senha() {
        return pf_senha;
    }

    /**
     *
     * @param pf_senha
     */
    public void setPf_senha(String pf_senha) {
        this.pf_senha = pf_senha;
    }
        
    /**
     *
     * @param pf_nome
     */
    public void setPf_nome(String pf_nome) {
		this.pf_nome = pf_nome;
	}

    /**
     *
     * @return
     */
    public String getPf_sobrenome() {
		return pf_sobrenome;
	}

    /**
     *
     * @param pf_sobrenome
     */
    public void setPf_sobrenome(String pf_sobrenome) {
		this.pf_sobrenome = pf_sobrenome;
	}

    /**
     *
     * @return
     */
    public String getPf_cpf() {
		return pf_cpf;
	}

    /**
     *
     * @param pf_cpf
     */
    public void setPf_cpf(String pf_cpf) {
		this.pf_cpf = pf_cpf;
	}

}
