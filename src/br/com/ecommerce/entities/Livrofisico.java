package br.com.ecommerce.entities;

/**
 *
 * @author nator
 */
public class Livrofisico extends Livro {
	private int  lifisico_id; 
	private int lifisico_isbn;
	private int lifisico_estoque;
	
    /**
     *
     * @param lifisico_id
     * @param lifisico_isbn
     * @param lifisico_estoque
     * @param liv_id
     */
    public Livrofisico(int lifisico_id, int lifisico_isbn, int lifisico_estoque, Livro liv_id) {
		this.lifisico_id = lifisico_id;
		this.lifisico_isbn = lifisico_isbn;
		this.lifisico_estoque = lifisico_estoque;
	}

    /**
     *
     * @return
     */
    public int getLifisico_id() {
		return lifisico_id;
	}

    /**
     *
     * @param lifisico_id
     */
    public void setLifisico_id(int lifisico_id) {
		this.lifisico_id = lifisico_id;
	}

    /**
     *
     * @return
     */
    public int getLifisico_isbn() {
		return lifisico_isbn;
	}

    /**
     *
     * @param lifisico_isbn
     */
    public void setLifisico_isbn(int lifisico_isbn) {
		this.lifisico_isbn = lifisico_isbn;
	}

    /**
     *
     * @return
     */
    public int getLifisico_estoque() {
		return lifisico_estoque;
	}

    /**
     *
     * @param lifisico_estoque
     */
    public void setLifisico_estoque(int lifisico_estoque) {
		this.lifisico_estoque = lifisico_estoque;
	}
	

}
