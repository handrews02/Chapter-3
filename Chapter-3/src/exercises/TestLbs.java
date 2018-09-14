package exercises;

import java.util.Scanner;

public class TestLbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		double lbs;
		System.out.println("Please enter your weight in lbs >> ");
		lbs = input.nextDouble();
		
		displayConversionToKilos(lbs);
		displayConversionToOunces(lbs);
		displayConversionToMiligrams(lbs);
		
	
		
		
	}
public static void displayConversionToKilos(double lbs) {
	
	double lbsConversion;
	lbsConversion = lbs * 0.45359237;
	
	System.out.println("Your weight to Kilograms is " + lbsConversion + " kilograms");
	}
public static void displayConversionToOunces(double lbs) {
	
	double lbsConversion;
	lbsConversion = lbs * 16;
	
	System.out.println("Your weight to Ounces is " + lbsConversion + " ounces"); 
	}
public static void displayConversionToMiligrams(double lbs) {
	
	double lbsConversion;
	lbsConversion = lbs * 453592.37;
	
	System.out.println("Your weight to Miligrams is " + lbsConversion + " miligrams"); 

	}
}
