package exercises;

import java.util.Scanner;

public class MetricConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double inches;
		double gallons;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number of inches >> ");
		inches= input.nextDouble();
		System.out.println("Please enter a number of gallons >> ");
		gallons= input.nextDouble();
		displayInchesConversion(inches);
		displayLitersConversion(gallons);
		
	}
public static void displayInchesConversion (double inches) {
	double inchesConversion;
	double centi= 2.54;
	inchesConversion= inches * centi;
	System.out.println("Your inches to centimeters conversion is " + inchesConversion + " centimeters");
	}
public static void displayLitersConversion (double gallons) {
	double gallonsConversion;
	double liters= 3.7854;
	gallonsConversion= gallons * liters;
	System.out.println("Your gallons to liters conversion is " + gallonsConversion + " liters");
}
}
