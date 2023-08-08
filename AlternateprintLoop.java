package assignmentpackage;
import java.util.Scanner;

public class AlternateprintLoop {
	public void Alternate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number :");
		int start = sc.nextInt();
		System.out.println("Enter the ending number :");
		int end = sc.nextInt();
		System.out.println("\nPrinting the alternate numbers in reverse order from "+start+" to "+end +" :");
		
		for(int i=start; i>=end;) {
			System.out.println(i);
			i=i-2;
		}
	}
	public static void main(String[] args) {
		AlternateprintLoop loop = new AlternateprintLoop();
		loop.Alternate();
	}
}
