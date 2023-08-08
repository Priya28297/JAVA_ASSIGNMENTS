package assignmentpackage;
import java.util.Scanner;

public class ReplaceParticularLetter {
	public void Replace() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Replace the particular letter to capital in the given string\n");
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		System.out.print("Enter the letter :  ");
		String s = sc.nextLine();
		char letter = s.charAt(0);
		String Result = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == letter) {
				Result += String.valueOf(str.charAt(i)).toUpperCase();
			}else {
				Result += String.valueOf(str.charAt(i));
			}
		}
		System.out.println("\nResult : "+Result);
	}
	public static void main(String[] args) {
		ReplaceParticularLetter logic = new ReplaceParticularLetter();
		logic.Replace();
	}
}
