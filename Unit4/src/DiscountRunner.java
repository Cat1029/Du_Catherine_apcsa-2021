//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);

		
		out.print("Enter the original bill amount :: ");
		double amtOne = keyboard.nextDouble();
		System.out.printf("Bill after discount :: %.2f \n\n" , Discount.getDiscountedBill(amtOne));
		
		out.print("Enter the original bill amount :: ");
		double amtTwo = keyboard.nextDouble();
		System.out.printf("Bill after discount :: %.2f \n\n" , Discount.getDiscountedBill(amtTwo));
		
		out.print("Enter the original bill amount :: ");
		double amtThree = keyboard.nextDouble();
		System.out.printf("Bill after discount :: %.2f \n\n" , Discount.getDiscountedBill(amtThree));
		
		out.print("Enter the original bill amount :: ");
		double amtFour = keyboard.nextDouble();
		System.out.printf("Bill after discount :: %.2f \n\n" , Discount.getDiscountedBill(amtFour));
		
		out.print("Enter the original bill amount :: ");
		double amtFive = keyboard.nextDouble();
		System.out.printf("Bill after discount :: %.2f \n\n" , Discount.getDiscountedBill(amtFive));

		//500, 2500, 4000, 333.33, 95874.2154


	}
}