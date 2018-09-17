package exercises;

import java.util.Scanner;

public class BookstoreCredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inputDevice = new Scanner (System.in);
		Scanner input = new Scanner(System.in);
		double GPA;
		String name;
		
		System.out.println("Please enter your Name >> ");
		name= inputDevice.nextLine();
		System.out.println("Please Enter your GPA >> ");
		GPA = input.nextDouble();
		
		displayConversion(GPA, name); 
		
	}	
public static void displayConversion(double GPA, String name){
	double GPAConversion;
	GPAConversion = GPA * 10;
	
	System.out.println(name + "Your reward for your " + GPA + " GPA " + "is $" + GPAConversion );
	
}
}

