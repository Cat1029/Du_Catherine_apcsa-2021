//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		NumberShifter one = new NumberShifter();
		one.makeLucky7Array(20);
		int[] arrayOne = {1, 10, 9, 2, 8, 2, 5, 6, 10, 7, 9, 8, 6, 7, 2, 7, 6, 10, 5, 3};
		one.shiftEm(arrayOne);
		System.out.println(Arrays.toString(arrayOne));

		NumberShifter two = new NumberShifter();
		two.makeLucky7Array(20);
		int[] arrayTwo = {2, 2, 2, 6, 2, 2, 4, 5, 3, 6, 10, 7, 5, 1, 9, 10, 7, 2, 2, 7};
		two.shiftEm(arrayTwo);
		System.out.println(Arrays.toString(arrayTwo));

		NumberShifter three = new NumberShifter();
		three.makeLucky7Array(20);
		int[] arrayThree = {5, 9, 9, 5, 10, 5, 7, 5, 6, 7, 10, 8, 9, 9, 5, 4, 6, 6, 3, 3};
		three.shiftEm(arrayThree);
		System.out.println(Arrays.toString(arrayThree));


	}
}



