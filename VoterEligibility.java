package assignmentpackage;

public class VoterEligibility {
	public void Check(String Nationality,int Age) {
		if(Nationality.equals("Indian") && Age >= 18) {
			System.out.println("You are Eligible to apply for Voter ID. \nYou can apply for it.");
		}else {
			int ideal=18;
			int remaining= ideal - Age;
			if(remaining > 1) {
				System.out.println("You are not eligible to apply for Voter ID now.\nYou can apply after "+ remaining + " years.");
			}else {
				System.out.println("You are not eligible to apply for Voter ID now.\nYou can apply after "+ remaining + " year.");
			}
		}
	}
	
	public static void main(String[] args) {
		VoterEligibility vcheck = new VoterEligibility();
		vcheck.Check("Indian", 9);
	}
}
