//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		StringOddOrEven test = new StringOddOrEven();
		
		System.out.print("Enter a word :: ");
		String one = keyboard.nextLine();
		test.setString(one);
		System.out.println(one + " is " + test.toString() + "\n");
		
		System.out.print("Enter a word :: ");
		String two = keyboard.nextLine();
		test.setString(two);
		System.out.println(two + " is " + test.toString()+ "\n");
		
		System.out.print("Enter a word :: ");
		String three = keyboard.nextLine();
		test.setString(three);
		System.out.println(three + " is " + test.toString()+ "\n");
		
		System.out.print("Enter a word :: ");
		String four = keyboard.nextLine();
		test.setString(four);
		System.out.println(four + " is " + test.toString()+ "\n");
		
		System.out.print("Enter a word :: ");
		String five = keyboard.nextLine();
		test.setString(five);
		System.out.println(five + " is " + test.toString()+ "\n");
				
		System.out.print("Enter a word :: ");
		String six = keyboard.nextLine();
		test.setString(six);
		System.out.println(six + " is " + test.toString()+ "\n");
		
		System.out.print("Enter a word :: ");
		String seven = keyboard.nextLine();
		test.setString(seven);
		System.out.println(seven + " is " + test.toString()+ "\n");
		
		System.out.print("Enter a word :: ");
		String eight = keyboard.nextLine();
		test.setString(eight);
		System.out.println(eight + " is " + test.toString());

	}
}