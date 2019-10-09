package br.com.ecommerce.entities;

abstract class Usuario {
	private int user_id;
	private String user_email; 
	private String  user_senha;

	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Usuario( String user_email, String user_senha) {
		this.user_email = user_email;
		this.user_senha = user_senha;
	}
	
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_senha() {
		return user_senha;
	}
	public void setUser_senha(String user_senha) {
		this.user_senha = user_senha;
	}

}
