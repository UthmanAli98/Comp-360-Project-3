
public class Passenger {

	private String firstName;
	private String lastName; 
	private String fullName;
	public Passenger(String firstNam, String lastNam){
		this.firstName = firstNam;
		this.lastName = lastNam;
		this.fullName = firstName +" "+ lastName; 
	}
	
	public String getName() {
		
		return fullName;
	}
	
	
}
