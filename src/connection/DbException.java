package connection;

/**
 *
 * @author nator
 */
public class DbException  extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    /**
     *
     * @param msg
     */
    public DbException(String msg) {
		super(msg);
	}

}
