package br.com.ecommerce.entities;

public class Pessoafisica  extends Usuario{

	public Pessoafisica(String user_email, String user_senha) {
		super(user_email, user_senha);
		// TODO Auto-generated constructor stub
	}
	private String pf_nome;
	private String pf_sobrenome;
	private  int pf_cpf;
	
	public Pessoafisica(String user_email, String user_senha, String pf_nome, String pf_sobrenome, int pf_cpf) {
		super(user_email, user_senha);
		this.pf_nome = pf_nome;
		this.pf_sobrenome = pf_sobrenome;
		this.pf_cpf = pf_cpf;
	}
	public String getPf_nome() {
		
		return pf_nome;
	}
	public void setPf_nome(String pf_nome) {
		this.pf_nome = pf_nome;
	}
	public String getPf_sobrenome() {
		return pf_sobrenome;
	}
	public void setPf_sobrenome(String pf_sobrenome) {
		this.pf_sobrenome = pf_sobrenome;
	}
	public int getPf_cpf() {
		return pf_cpf;
	}
	public void setPf_cpf(int pf_cpf) {
		this.pf_cpf = pf_cpf;
	}

}
