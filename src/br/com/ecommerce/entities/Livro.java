package br.com.ecommerce.entities;

public class Livro {
	private int liv_id;
	private String liv_titulo; 
	private double liv_preco;
	private String liv_autor; 
	private String liv_editora;
	private String liv_descricao; 
	private int  liv_imagem1; 
        private int  livimagem2;
	private String  liv_ano; 
	private Categoria cat_id;
	private Pessoajuridica pj_id;

	
	
	public int getLiv_id() {
		return liv_id;
	}
	public void setLiv_id(int liv_id) {
		this.liv_id = liv_id;
	}
	public String getLiv_titulo() {
		return liv_titulo;
	}
	public void setLiv_titulo(String liv_titulo) {
		this.liv_titulo = liv_titulo;
	}
	public double getLiv_preco() {
		return liv_preco;
	}
	public void setLiv_preco(double liv_preco) {
		this.liv_preco = liv_preco;
	}
	public String getLiv_autor() {
		return liv_autor;
	}
	public void setLiv_autor(String liv_autor) {
		this.liv_autor = liv_autor;
	}
	public String getLiv_editora() {
		return liv_editora;
	}
	public void setLiv_editora(String liv_editora) {
		this.liv_editora = liv_editora;
	}
	public String getLiv_descricao() {
		return liv_descricao;
	}
	public void setLiv_descricao(String liv_descricao) {
		this.liv_descricao = liv_descricao;
	}
	public String getLiv_ano() {
		return liv_ano;
	}
	public void setLiv_ano(String liv_ano) {
		this.liv_ano = liv_ano;
	}
	public Categoria getCat_id() {
		return cat_id;
	}
	public void setCat_id(Categoria cat_id) {
		this.cat_id = cat_id;
	}
	public Pessoajuridica getPj_id() {
		return pj_id;
	}
	public void setPj_id(Pessoajuridica pj_id) {
		this.pj_id = pj_id;
	}

}
