package assignmentpackage;

import java.util.Scanner;

public class ReverseprintLoop {
	public void Reverse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting number : ");
		int start = sc.nextInt();
		System.out.println("Enter the Ending number : ");
		int end = sc.nextInt();
		System.out.print("\nPrinting the numbers in reverse order from "+start+" to "+end+" :\n");
		
		int i;
		for(i=start; i>=end; i--) {
			System.out.println(i);
		}
	}

	
	public static void main(String[] args) {
		ReverseprintLoop loop = new ReverseprintLoop();
		loop.Reverse();
	}
}
