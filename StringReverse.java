package assignmentpackage;

import java.util.Scanner;

public class StringReverse {
	public void Reverse() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String input : ");
		String str = sc.nextLine();
		for(int i=str.length(); i>0; i--) {
			System.out.println(str.charAt(i-1));
		}
	}
	public static void main(String[] args) {
		StringReverse string = new StringReverse();
		string.Reverse();
	}
}
