//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter an X1 :: ");
		int xOne = keyboard.nextInt();
		System.out.print("Enter an Y1 :: ");
		int yOne = keyboard.nextInt();
		System.out.print("Enter an X2 :: ");
		int xTwo = keyboard.nextInt();
		System.out.print("Enter an Y2 :: ");
		int yTwo = keyboard.nextInt();
		
		Distance test = new Distance(xOne, yOne, xTwo, yTwo);
		



	}
}