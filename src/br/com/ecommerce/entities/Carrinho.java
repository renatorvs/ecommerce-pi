package br.com.ecommerce.entities;

public class Carrinho {
	private int carr_id;
	private String carr_descri;
	private Usuario user_id; 
	private Endereco ender_id; 
	private double carr_subtotal;  
	
	public int getCarr_id() {
		return carr_id;
	}
	public void setCarr_id(int carr_id) {
		this.carr_id = carr_id;
	}
	public String getCarr_descri() {
		return carr_descri;
	}
	public void setCarr_descri(String carr_descri) {
		this.carr_descri = carr_descri;
	}
	public Usuario getUser_id() {
		return user_id;
	}
	public void setUser_id(Usuario user_id) {
		this.user_id = user_id;
	}
	public Endereco getEnder_id() {
		return ender_id;
	}
	public void setEnder_id(Endereco ender_id) {
		this.ender_id = ender_id;
	}
	public double getCarr_subtotal() {
		return carr_subtotal;
	}
	public void setCarr_subtotal(double carr_subtotal) {
		this.carr_subtotal = carr_subtotal;
	}

	
	
}
