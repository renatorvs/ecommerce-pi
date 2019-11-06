package br.com.ecommerce.entities;

/**
 *
 * @author nator
 */
public class Pagamento {

	private int pag_id; 
	private String pag_metodo;
	
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
    public Pagamento(int pag_id, String pag_metodo) {
		super();
		this.pag_id = pag_id;
		this.pag_metodo = pag_metodo;
	}

    /**
     *
     * @param pag_id
     */
    public void setPag_id(int pag_id) {
		this.pag_id = pag_id;
	}
	
    /**
     *
     * @return
     */
    public String getPag_metodo() {
		return pag_metodo;
	}
	
    /**
     *
     * @param pag_metodo
     */
    public void setPag_metodo(String pag_metodo) {
		this.pag_metodo = pag_metodo;
	}
}
