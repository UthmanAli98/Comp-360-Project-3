import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws allTicketSoldError {
		// TODO Auto-generated method stub

		//Passenger pass = new Passenger("Uthman", "Alibalogun");
		Flight newflight = new Flight();
		
		newflight.setFlightDate("December 6th");
		newflight.setFlightTime("2:00 PM");
		newflight.setTickets(20);
		
		Flight flight2 = new Flight();
		flight2.setFlightDate("December 6th");
		flight2.setFlightTime("7:00 AM");
		flight2.setTickets(20);
		
		Scanner scan = new Scanner(System.in);
		
		
		//newflight.addPassenger(pass);
		
		//Passenger pass2 = new Passenger("Ania", "Wallace");
		
		//newflight.addPassenger(pass2);
		
		System.out.println("Welcome to Uthman's Flight Booker you have 3 options 1 - Reserve a seat, 2 - Remove your seat , 3 - Exit The System");
		System.out.println("********************************************************************************");

		int decision = scan.nextInt();
		
			while(decision != 3) {
				
			if(decision == 1) {
				
				System.out.println("You want to reserve!");
				
				System.out.println("********************************************************************************");
				System.out.print("What flight from Greensboro would you like to be on? 1 - Departing from 2:00 PM , 2 - Departing from 7:00 AM");
				int flightChoice = scan.nextInt();
				
				if(flightChoice == 1) {
					System.out.println("What is your full name?");
					String fullName = scan.nextLine();
					
					while (fullName.equals("")) {
						fullName = scan.nextLine();
					}
					newflight.addPassenger(fullName);
					
					System.out.println("Would you like to: 1 - Reserve another seat , 2 - Remove a reservation, 3 - Exit");
					decision = scan.nextInt();
					
					
				}else if (flightChoice == 2) {
					System.out.println("What is your full name?");
					String fullName = scan.nextLine();
										
					while (fullName.equals("")) {
						fullName = scan.nextLine();
					}
					flight2.addPassenger(fullName);
					
					System.out.println("Would you like to: 1 - Reserve another seat , 2 - Remove a reservation, 3 - Exit");
					decision = scan.nextInt();
				}
				
				
			}else if(decision == 2) {
				
				System.out.println("What flight would you like to remove from? 1 - 2:00 PM Departure Greensboro December 6th , 2 - 7:00 AM Departure Greensboro December 6th");
				int removeChoice = scan.nextInt();
				
				if(removeChoice ==1) {
				System.out.println("Who would you like to remove?");
				String nameRemove = scan.nextLine();
				
				while (nameRemove.equals("")) {
					nameRemove = scan.nextLine();
				}
				
				newflight.removePassenger(nameRemove);
				
				System.out.println("Would you like to: 1 - Reserve another seat , 2 - Remove a reservation, 3 - Exit");

				decision = scan.nextInt();
				}else if(removeChoice == 2) {
					
					System.out.println("Who would you like to remove?");
					String nameRemove = scan.nextLine();
					
					while (nameRemove.equals("")) {
						nameRemove = scan.nextLine();
					}
					
					flight2.removePassenger(nameRemove);
					
					System.out.println("Would you like to: 1 - Reserve another seat , 2 - Remove a reservation, 3 - Exit");

					decision = scan.nextInt();
				}
			}
			
		}
			if(decision == 3) {
				System.exit(-1);
			}
		
		
	}

}
