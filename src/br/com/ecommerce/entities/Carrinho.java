package br.com.ecommerce.entities;

/**
 *
 * @author nator
 */
public class Carrinho {
	private int carr_id;
	private String carr_descri;
	private Usuario user_id; 
	private Endereco ender_id; 
	private double carr_subtotal;  
	
    /**
     *
     * @return
     */
    public int getCarr_id() {
		return carr_id;
	}

    /**
     *
     * @param carr_id
     */
    public void setCarr_id(int carr_id) {
		this.carr_id = carr_id;
	}

    /**
     *
     * @return
     */
    public String getCarr_descri() {
		return carr_descri;
	}

    /**
     *
     * @param carr_descri
     */
    public void setCarr_descri(String carr_descri) {
		this.carr_descri = carr_descri;
	}

    /**
     *
     * @return
     */
    public Usuario getUser_id() {
		return user_id;
	}

    /**
     *
     * @param user_id
     */
    public void setUser_id(Usuario user_id) {
		this.user_id = user_id;
	}

    /**
     *
     * @return
     */
    public Endereco getEnder_id() {
		return ender_id;
	}

    /**
     *
     * @param ender_id
     */
    public void setEnder_id(Endereco ender_id) {
		this.ender_id = ender_id;
	}

    /**
     *
     * @return
     */
    public double getCarr_subtotal() {
		return carr_subtotal;
	}

    /**
     *
     * @param carr_subtotal
     */
    public void setCarr_subtotal(double carr_subtotal) {
		this.carr_subtotal = carr_subtotal;
	}

	
	
}
