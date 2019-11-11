package br.com.ecommerce.entities;

/**
 *
 * @author nator
 */
public class Pagamento {

	private int pag_id; 
	private String pag_nome_titular;
	private String pag_card_numero;
	private String pag_cod_seguranca;
	private String pag_data_venci;

    public String getPag_card_numero() {
        return pag_card_numero;
    }

    public String getPag_cod_seguranca() {
        return pag_cod_seguranca;
    }

    public String getPag_data_venci() {
        return pag_data_venci;
    }

    public String getPag_nome_titular() {
        return pag_nome_titular;
    }

    public void setPag_card_numero(String pag_card_numero) {
        this.pag_card_numero = pag_card_numero;
    }

    public void setPag_cod_seguranca(String pag_cod_seguranca) {
        this.pag_cod_seguranca = pag_cod_seguranca;
    }

    public void setPag_data_venci(String pag_data_venci) {
        this.pag_data_venci = pag_data_venci;
    }

    public void setPag_nome_titular(String pag_nome_titular) {
        this.pag_nome_titular = pag_nome_titular;
    }
	
    
        
        
   
    /**
     *
     * @return
     */
    public int getPag_id() {
		return pag_id;
	}
	
    /**
     *
     * @param pag_id
     * @param pag_metodo
     */
  
    /**
     *
     * @param pag_id
     */
    public void setPag_id(int pag_id) {
		this.pag_id = pag_id;
	}
    

}
