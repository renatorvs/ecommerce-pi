package br.com.ecommerce.entities;

/**
 *
 * @author nator
 */
public class Endereco {
	private int ender_id;
	private String ender_numero;
	private String ender_logra; 
	private int ender_cep; 
	private double ender_valorfrete; 
	private String ender_compl; 
	private String ender_bairro; 
	private String ender_cidade; 
	private String ender_estado;
	
    /**
     *
     * @return
     */
    public int getEnder_id() {
		return ender_id;
	}

    /**
     *
     * @param ender_id
     */
    public void setEnder_id(int ender_id) {
		this.ender_id = ender_id;
	}
	
    /**
     *
     * @return
     */
    public String getEnder_logra() {
		return ender_logra;
	}

    /**
     *
     * @param ender_logra
     */
    public void setEnder_logra(String ender_logra) {
		this.ender_logra = ender_logra;
	}

    /**
     *
     * @return
     */
    public String getEnder_compl() {
		return ender_compl;
	}

    /**
     *
     * @param ender_compl
     */
    public void setEnder_compl(String ender_compl) {
		this.ender_compl = ender_compl;
	}

    /**
     *
     * @return
     */
    public String getEnder_cidade() {
		return ender_cidade;
	}

    /**
     *
     * @param ender_cidade
     */
    public void setEnder_cidade(String ender_cidade) {
		this.ender_cidade = ender_cidade;
	}

    /**
     *
     * @return
     */
    public String getEnder_estado() {
		return ender_estado;
	}

    /**
     *
     * @param ender_estado
     */
    public void setEnder_estado(String ender_estado) {
		this.ender_estado = ender_estado;
	}

    /**
     *
     * @return
     */
    public String getEnder_bairro() {
		return ender_bairro;
	}

    /**
     *
     * @param ender_bairro
     */
    public void setEnder_bairro(String ender_bairro) {
		this.ender_bairro = ender_bairro;
	}

    /**
     *
     * @return
     */
    public String getEnder_numero() {
		return ender_numero;
	}

    /**
     *
     * @param ender_numero
     */
    public void setEnder_numero(String ender_numero) {
		this.ender_numero = ender_numero;
	}

    /**
     *
     * @return
     */
    public int getEnder_cep() {
		return ender_cep;
	}

    /**
     *
     * @param ender_cep
     */
    public void setEnder_cep(int ender_cep) {
		this.ender_cep = ender_cep;
	}

    /**
     *
     * @return
     */
    public double getEnder_valorfrete() {
		return ender_valorfrete;
	}

    /**
     *
     * @param ender_valorfrete
     */
    public void setEnder_valorfrete(double ender_valorfrete) {
		this.ender_valorfrete = ender_valorfrete;
	} 

	
	
}
