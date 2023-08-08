package assignmentpackage;
import java.util.Scanner;

public class StringReverseAlternate {
	public void ReverseAlternate() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String input : ");
		String str = sc.nextLine();
		for(int i=str.length(); i>0;) {
			System.out.println(str.charAt(i-1));
			i=i-2;
		}	
	}
	public static void main(String[] args) {
		StringReverseAlternate string = new StringReverseAlternate();
		string.ReverseAlternate();
	}
}
