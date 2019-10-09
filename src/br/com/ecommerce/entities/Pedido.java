package br.com.ecommerce.entities;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Pedido {

	Date data = new Date();

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 

	private int Pedi_id;
	private float pedi_valortotal;
	private Carrinho car_id;
	private int pedi_notafiscal;
	private Pedido_status pistatus_id;
	private Pagamento pag_id;

	public Date getData() {
		return data;
	}

	public void setD(Date data) {
		this.data = data;
	}

	public SimpleDateFormat getSdf() {
		return sdf;
	}

	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}


	public int getPedi_id() {
		return Pedi_id;
	}

	public void setPedi_id(int Pedi_id) {
		this.Pedi_id = Pedi_id;
	}

	public float getPedi_valortotal() {
		return pedi_valortotal;
	}

	public void setPedi_valortotal(float pedi_valortotal) {
		this.pedi_valortotal = pedi_valortotal;
	}

	public Carrinho getCar_id() {
		return car_id;
	}

	public void setCar_id(Carrinho car_id) {
		this.car_id = car_id;
	}

	public int getPedi_notafiscal() {
		return pedi_notafiscal;
	}

	public void setPedi_notafiscal(int pedi_notafiscal) {
		this.pedi_notafiscal = pedi_notafiscal;
	}

	public Pedido_status getPistatus_id() {
		return pistatus_id;
	}

	public void setPistatus_id(Pedido_status pistatus_id) {
		this.pistatus_id = pistatus_id;
	}

	public Pagamento getPag_id() {
		return pag_id;
	}

	public void setPag_id(Pagamento pag_id) {
		this.pag_id = pag_id;
	}






}
