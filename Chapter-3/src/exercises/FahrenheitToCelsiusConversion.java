package exercises;

import java.util.Scanner;

public class FahrenheitToCelsiusConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		double ftempa;
		double ftempb;
		double ftempc; 
		double conversiona;
		double conversionb;
		double conversionc;
	
		System.out.println("What temperature in fahrenhite is it at 8 a.m.? ");
		ftempa= input.nextDouble();
		conversiona= (ftempa-32)/1.8; 
		System.out.println("The conversion from " + ftempa + " degrees fahrenhite to Celsius is " + conversiona); 
		System.out.println("What temperature in fahrenhite is it at 12 p.m.? ");
		ftempb= input.nextDouble();
		conversionb= (ftempb-32)/1.8; 
		System.out.println("The conversion from " + ftempb + " degrees fahrenhite to Celsius is " + conversionb);
		System.out.println("What temperature in fahrenhite is it at 5 p.m.? ");
		ftempc= input.nextDouble();
		conversionc= (ftempc-32)/1.8; 
		System.out.println("The conversion from " + ftempc + " degrees fahrenheit to Celsius is " + conversionc);
		
	


		
	}

}
