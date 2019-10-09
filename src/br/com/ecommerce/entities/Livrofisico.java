package br.com.ecommerce.entities;

public class Livrofisico extends Livro {
	private int  lifisico_id; 
	private int lifisico_isbn;
	private int lifisico_estoque;
	
	
	public Livrofisico(int lifisico_id, int lifisico_isbn, int lifisico_estoque, Livro liv_id) {
		this.lifisico_id = lifisico_id;
		this.lifisico_isbn = lifisico_isbn;
		this.lifisico_estoque = lifisico_estoque;
	}
	public int getLifisico_id() {
		return lifisico_id;
	}
	public void setLifisico_id(int lifisico_id) {
		this.lifisico_id = lifisico_id;
	}
	public int getLifisico_isbn() {
		return lifisico_isbn;
	}
	public void setLifisico_isbn(int lifisico_isbn) {
		this.lifisico_isbn = lifisico_isbn;
	}
	public int getLifisico_estoque() {
		return lifisico_estoque;
	}
	public void setLifisico_estoque(int lifisico_estoque) {
		this.lifisico_estoque = lifisico_estoque;
	}
	

}
