package br.com.ecommerce.entities;

public class Pessoajuridica extends Usuario{

	public Pessoajuridica(String user_email, String user_senha) {
		super(user_email, user_senha);
		// TODO Auto-generated constructor stub
	}
	
	private int pj_cnpj;
	private String pj_razaosocial;
	private String pj_nmfantasia;  
	private String pj_nmresponsavel; 
	
	public int getPj_cnpj() {
		return pj_cnpj;
	}
	public Pessoajuridica(String user_email, String user_senha, int pj_cnpj, String pj_razaosocial,
			String pj_nmfantasia, String pj_nmresponsavel) {
		super(user_email, user_senha);
		this.pj_cnpj = pj_cnpj;
		this.pj_razaosocial = pj_razaosocial;
		this.pj_nmfantasia = pj_nmfantasia;
		this.pj_nmresponsavel = pj_nmresponsavel;
	}
	public void setPj_cnpj(int pj_cnpj) {
		this.pj_cnpj = pj_cnpj;
	}
	public String getPj_razaosocial() {
		return pj_razaosocial;
	}
	public void setPj_razaosocial(String pj_razaosocial) {
		this.pj_razaosocial = pj_razaosocial;
	}
	public String getPj_nmfantasia() {
		return pj_nmfantasia;
	}
	public void setPj_nmfantasia(String pj_nmfantasia) {
		this.pj_nmfantasia = pj_nmfantasia;
	}
	public String getPj_nmresponsavel() {
		return pj_nmresponsavel;
	}
	public void setPj_nmresponsavel(String pj_nmresponsavel) {
		this.pj_nmresponsavel = pj_nmresponsavel;
	}
 
}
