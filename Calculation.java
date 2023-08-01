package assignmentpackage;

public class Calculation {
	
	//Constructor
	public Calculation() {
		System.out.println("Arithmatic operations\n");
		System.out.println("a = 20");
		System.out.println("b = 10");
	}
	
	//without parameter and without return type - Addition
	public void Add() {
		int a=20;
		int b=10;
		int c=a+b;
		System.out.println("\nAddition of a and b is \t\t:"+ c);
	}

	//with parameter and without return type - Subtraction
	public void Sub(int a,int b) {
		int c=a-b;
		System.out.println("Subtraction of a and b is \t:"+ c);
	}
	
	//with parameter and with return type - Multiplication
	public int Mul(int a,int b) {
		int c=a*b;
		System.out.println("Multiplication of a and b is \t:"+ c);
		return c;
	}
	
	//without parameter and with return type - Division
	public int Div() {
		int a=20;
		int b=10;
		int c=a/b;
		System.out.println("Division of a and b is  \t:"+ c);
		return c;
	}
	
	public static void main(String[] args) {
		Calculation calc=new Calculation();
		calc.Add();
		calc.Sub(20,10);
		calc.Mul(20,10);
		calc.Div();		
	}

}