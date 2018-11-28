
public class Flight {

	private int seats;
	private String[] listOfPassenger;
	private int tickets;
	int top = -1;
	private String flightDate;
	private String flightTime;
	private String locationFrom;
	private String locationTo;
	private String ticketConfirmation;
	private int seatnumber;
	
	public Flight() {
		
		tickets = 0;
		flightDate = "";
		flightTime = "";
		setLocationFrom("");
		locationTo  = "";
		ticketConfirmation = "";
		seatnumber = 0;
	}
	public void setSeatNumber(int seatnum) {
		this.seatnumber = seatnum;
	}
	public int getSeatNum() {
		return seatnumber;
	}
	
	
	public void setTickets(int tickets) {
		this.tickets = tickets;
		listOfPassenger = new String[tickets];
		
		for(int i = 0 ; i < listOfPassenger.length ; i++) {
			listOfPassenger[i] = "";
		}
	}
	public int getTickets() {
		
		return this.tickets;
	}
	
	/*public boolean airplaneFull() {
		
		return tickets == 0;
	}
	*/
	public void airplaneFull() throws allTicketSoldError{
		if(tickets == 0) {
			String ex = "\n There are currently no seats available on this flight from Greensboro to Newark at "+ this.getFlightTime();
			throw new allTicketSoldError(ex);
		}
		
	}
	
	public int returnSeatNum(String name) {
		for(int i = 0; i < listOfPassenger.length; i++) {
			if(listOfPassenger[i].equalsIgnoreCase(name)) {
				return i+1;
			}
		}
		return 0;
	}
	
	public void printList() {
		for( String passenger: listOfPassenger) {
			System.out.println(passenger);
		}
	}
	public void addPassenger(Passenger passenger){
		int seatNum = 0;
		
		try {
			airplaneFull();
			
			
			
			for(int i = 0; i < listOfPassenger.length; i++) {
				if(listOfPassenger[i] == "") {
					listOfPassenger[i] = passenger.getName();
					seatNum = i+1;
					break;
					//System.out.println("The seat number: "+ getSeatNum());
					
				}
			}
			
			tickets--;
			
			System.out.println("\n FLIGHT BOOKED! Confirmation for: "+ passenger.getName() + "\nFor Greensboro to Newark flight Departing at: "+ this.getFlightTime()+
						" Seat number: " + seatNum + " Date: "+ this.getFlightDate());
			
		}catch(allTicketSoldError e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}
	public String getFlightDate() {
		// TODO Auto-generated method stub
		return this.flightDate;
	}

	public void setPurchaseTicket(String ticket) {
		
	}
	public String getPurchaseTicket() {
		
		return ticketConfirmation;
	}
	
	//Checks to see if the passenger exists on the flight
	public boolean passengerExists(String passengerName) {
		
		for(String passenger: listOfPassenger) {
			if(passenger.equalsIgnoreCase(passengerName)) {
				return true;
			}
		}
		
		return false;
		
	}
	//If passenger exists then remove the passenger else you notify them that the passenger doesn't exist
	public void removePassenger(String passengerName) {
		if(passengerExists(passengerName)) {
			
			for(String passenger: listOfPassenger) {
				if(passenger.equalsIgnoreCase(passengerName.trim())){
					passenger = "";
					
				}
				
			}
			tickets++;
			System.out.println("The passenger: "+ passengerName+ " was removed!");
		}else {
			System.out.println("The passenger: " + passengerName+" does not exist on this flight!");
		}
	}

	private String getFlightTime() {
		// TODO Auto-generated method stub
		return this.flightTime;
	}

	public String getLocationFrom() {
		return locationFrom;
	}

	public void setLocationFrom(String locationFrom) {
		this.locationFrom = locationFrom;
	}
	
	public void setFlightTime(String time) {
		this.flightTime = time;
	}
	
	
}
