package br.com.ecommerce.entities;

public class Endereco {
	private int ender_id;
	private  Usuario id_user;
	private String ender_nome;
	private String ender_logra; 
	private String ender_compl; ;
	private String ender_cidade; 
	private String ender_estado;
	
	
	
	public Endereco(int ender_id, Usuario id_user, String ender_nome, String ender_logra, String ender_compl,
			String ender_cidade, String ender_estado) {
		this.ender_id = ender_id;
		this.id_user = id_user;
		this.ender_nome = ender_nome;
		this.ender_logra = ender_logra;
		this.ender_compl = ender_compl;
		this.ender_cidade = ender_cidade;
		this.ender_estado = ender_estado;
	}
	public int getEnder_id() {
		return ender_id;
	}
	public void setEnder_id(int ender_id) {
		this.ender_id = ender_id;
	}
	public Usuario getId_user() {
		return id_user;
	}
	public void setId_user(Usuario id_user) {
		this.id_user = id_user;
	}
	public String getEnder_nome() {
		return ender_nome;
	}
	public void setEnder_nome(String ender_nome) {
		this.ender_nome = ender_nome;
	}
	public String getEnder_logra() {
		return ender_logra;
	}
	public void setEnder_logra(String ender_logra) {
		this.ender_logra = ender_logra;
	}
	public String getEnder_compl() {
		return ender_compl;
	}
	public void setEnder_compl(String ender_compl) {
		this.ender_compl = ender_compl;
	}
	public String getEnder_cidade() {
		return ender_cidade;
	}
	public void setEnder_cidade(String ender_cidade) {
		this.ender_cidade = ender_cidade;
	}
	public String getEnder_estado() {
		return ender_estado;
	}
	public void setEnder_estado(String ender_estado) {
		this.ender_estado = ender_estado;
	} 

	
	
}
