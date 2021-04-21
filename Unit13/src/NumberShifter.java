//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] lucky = new int[size];
		return lucky;
	}
	public static void shiftEm(int[] array)
	{
		int count=0;
		int temp=array[0];
		for (int i=0; i<array.length; i++){
			if(array[i]==7) {
				array[count]=temp;
				array[count]=array[i];
				array[i]=temp;
				count++;
			}
		}
	}
}