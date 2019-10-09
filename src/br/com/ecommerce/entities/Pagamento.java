package br.com.ecommerce.entities;

public class Pagamento {

	private int pag_id; 
	private String pag_metodo;
	
	public int getPag_id() {
		return pag_id;
	}
	
	public Pagamento(int pag_id, String pag_metodo) {
		super();
		this.pag_id = pag_id;
		this.pag_metodo = pag_metodo;
	}

	public void setPag_id(int pag_id) {
		this.pag_id = pag_id;
	}
	
	public String getPag_metodo() {
		return pag_metodo;
	}
	
	public void setPag_metodo(String pag_metodo) {
		this.pag_metodo = pag_metodo;
	}
}
