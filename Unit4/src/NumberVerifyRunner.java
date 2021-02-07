//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a whole number :: ");
		int numOne = keyboard.nextInt();
		System.out.println(numOne + " is odd :: " + NumberVerify.isOdd(numOne));
		System.out.println(numOne + " is even :: " + NumberVerify.isEven(numOne)+"\n");
		
		System.out.print("Enter a whole number :: ");
		int numTwo = keyboard.nextInt();
		System.out.println(numTwo + " is odd :: " + NumberVerify.isOdd(numTwo));
		System.out.println(numTwo + " is even :: " + NumberVerify.isEven(numTwo)+"\n");
		
		System.out.print("Enter a whole number :: ");
		int numThree = keyboard.nextInt();
		System.out.println(numThree + " is odd :: " + NumberVerify.isOdd(numThree));
		System.out.println(numThree + " is even :: " + NumberVerify.isEven(numThree)+"\n");
		
		System.out.print("Enter a whole number :: ");
		int numFour = keyboard.nextInt();
		System.out.println(numFour + " is odd :: " + NumberVerify.isOdd(numFour));
		System.out.println(numFour + " is even :: " + NumberVerify.isEven(numFour)+"\n");
		
		System.out.print("Enter a whole number :: ");
		int numFive = keyboard.nextInt();
		System.out.println(numFive + " is odd :: " + NumberVerify.isOdd(numFive));
		System.out.println(numFive + " is even :: " + NumberVerify.isEven(numFive)+"\n");
		
		//111, 2000, -99, 1111, -850

	}
}