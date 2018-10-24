import java.util.Scanner;

public class ParadiseInfo2 {
	
	public static void main (String [] args) {
		
		double price;// minimum price for which a discount will be allowed
		double discount;// discount rate
		double savings;// minimum savings, calculated by multiplying the minimum price for a discount and the discount rate.
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter cutoff price for discount:");
		price= keyboard.nextDouble();
		
		System.out.println("Enter discount rate as a a whole number:");
		discount= keyboard.nextDouble();
		
		displayInfo();
		
		savings=computeDiscountInfo(price, discount);
		
		System.out.println("Special this week on any service over "+price);
		System.out.println("Discount of "+discount+" percent");
		System.out.println("That's a savings of at least $" + savings);
		
	}
	
	public static void displayInfo(){
		System.out.println();
		System.out.println("Paradise Day SPA wants to pamper you.");
		System.out.println("We'll make you look good.");
	}
	
	public static double computeDiscountInfo (double price, double discountRate){
		
		double savings;
		savings=price*discountRate/100;
		return savings;
		
	}
	
	
	
}