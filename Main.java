import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws allTicketSoldError {
		// TODO Auto-generated method stub

		//Passenger pass = new Passenger("Uthman", "Alibalogun");
		Flight newflight = new Flight();
		
		newflight.setFlightDate("December 6th");
		newflight.setFlightTime("2:00 PM");
		newflight.setTickets(3);
		
		Flight flight2 = new Flight();
		flight2.setFlightDate("December 6th");
		flight2.setFlightTime("7:00 AM");
		flight2.setTickets(20);
		
		Scanner scan = new Scanner(System.in);
		
		
		newflight.addPassenger(new Passenger("Uthman", "Alibalogun"));
		newflight.addPassenger(new Passenger("Betsy", "Alin"));
		newflight.addPassenger(new Passenger("Ueki", "Alin"));
		newflight.addPassenger(new Passenger("thiom", "Alibalogun"));
		
		newflight.removePassenger("Uthman Alibalogun");
		newflight.addPassenger(new Passenger("thm", "Alibalogun"));
		
		System.out.println();
		
		
		newflight.printList();
		//newflight.addPassenger(pass);
		
		//Passenger pass2 = new Passenger("Ania", "Wallace");
		
		//newflight.addPassenger(pass2);
		
		/**System.out.println("Welcome to Uthman's Flight Booker you have 3 options 1 - Reserve a seat, 2 - Remove your seat , 3 - Exit The System");
		int decision = scan.nextInt();
		
			while(decision != 3) {
				
			if(decision == 1) {
				
				System.out.println("You want to reserve!");
				System.out.print("What flight from Greensboro would you like to be on? 1 - Departing from 2:00 PM , 2 - Departing from 7:00 AM");
				int flightChoice = scan.nextInt();
				
				if(flightChoice == 1) {
					System.out.println("What is your full name?");
					String firstName = scan.nextLine().trim();
					
					
					//System.out.println("What is your last name?");
					String lastName = scan.nextLine().trim();
					
					newflight.addPassenger(new Passenger(firstName, lastName));
					
					System.out.println("Would you like to: 1 - Reserve another seat , 2 - Remove a reservation, 3 - Exit");
					decision = scan.nextInt();
				}
				
				
			}else if(decision == 2) {
				System.out.println("You want to remove!");
				
				System.out.println("Who would you like to remove?");
				String nameRemove = scan.nextLine().trim();
				
				newflight.removePassenger(nameRemove);
				
			}
			
		}
			if(decision == 3) {
				System.exit(-1);
			}
		*/
		
	}

}
