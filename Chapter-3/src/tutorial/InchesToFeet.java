package tutorial;

import java.util.Scanner;

public class InchesToFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     int inches;
	     Scanner input = new Scanner(System.in);
	     System.out.print("Enter inches >> ");
	     inches = input.nextInt();
	     displayConversion(inches); 
	}
	    
public static void displayConversion(int inches)	{
		int feet;
		int inchesLeft;
		final int INCHES_IN_FOOT = 12;
		feet = inches / INCHES_IN_FOOT;
		inchesLeft = inches % INCHES_IN_FOOT;
		System.out.println(inches + " inches is "
		feet + " feet and " + inchesLeft + " inches"); 
	}
}
