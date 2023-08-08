package assignmentpackage;
import java.util.Scanner;

public class TrainticketBooking {
	public void Book() {
		int available = 20;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of tickets you want to book : \n");
		int tickets = sc.nextInt();
		sc.nextLine();
		if(tickets <= available) {
			for(int i=1; i<=tickets;i++) {
				System.out.println("Your booked ticket number is "+ i);
			}
		}else {
			System.out.println("\n"+tickets +" tickets are not avilable."+available+" tickets only available now."+" \nIf you want to book available "+available+" tickets please enter 1,\nif not please enter 2.");
			String proceed = sc.nextLine();
			if(proceed.equals("Yes")) {
				for(int j=1;j<=available; j++) {
					System.out.println("Your booked ticket number is "+ j);
				}
			}else {
				System.out.println("No ticket has booked.");
			}
		}
	}

	public static void main(String[] args) {
		TrainticketBooking ticket = new TrainticketBooking();
		ticket.Book();
	}
}
