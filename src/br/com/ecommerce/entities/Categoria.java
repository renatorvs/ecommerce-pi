package br.com.ecommerce.entities;

/**
 *
 * @author nator
 */
public class Categoria {
	private int cat_id;
	private String cat_nome;

    /**
     *
     * @param cat_nome
     */
    public Categoria(String cat_nome) {
		//super();
		this.cat_nome = cat_nome;
	}

    /**
     *
     * @return
     */
    public int getCat_id() {
		return cat_id;
	}

    /**
     *
     * @param cat_id
     */
    public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

    /**
     *
     * @return
     */
    public String getCat_nome() {
		return cat_nome;
	}

    /**
     *
     * @param cat_nome
     */
    public void setCat_nome(String cat_nome) {
		this.cat_nome = cat_nome;
	}
	
	
	
	
}
