package debugging;

public class Debugging4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int myCredits = 13;
	      int yourCredits = 17;
	      double rate = 75.84;
	      System.out.println("My tuition:");
	      displayTuitionBill(myCredits, rate);
	      System.out.println("Your tuition:");
	      displayTuitionBill(yourCredits, myCredits);
	   }
	   public static void displayTuitionBill(int c, double r) {
	      System.out.println("Total due " + (r*c));
	}

}
