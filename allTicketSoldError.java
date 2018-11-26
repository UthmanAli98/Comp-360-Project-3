
public class allTicketSoldError extends Exception {

	private String message = "";
	
	
	public allTicketSoldError(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
	
}
