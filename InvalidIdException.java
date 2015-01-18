/**
 * This exception is thrown when you attempt to call one of the {@link RDFVault} methods
 * {@link RDFVault#decode redeem} or {@link RDFVault#trash trash} on an ID that has previously been trashed,
 * or on an object that is not an ID or has not been generated by RDFVault.
 * 
 * @author Steven de Rooij
 */

public class InvalidIdException extends RuntimeException {

	private static final long serialVersionUID = 2371623906872717292L;

	public InvalidIdException() { super("Attempt to use an invalid ID"); }

}
