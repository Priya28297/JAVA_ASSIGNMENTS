package assignmentpackage;

public class StringReturn {
	
	public String Two(String name) {
		System.out.println("Welcome "+name +"!");
		return name;
	}
	
	public void One() {
		Two("priya");
	}

	public static void main(String[] args) {
		StringReturn str=new StringReturn();
		str.One();
	}
}
