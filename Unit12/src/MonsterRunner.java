//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		int size;
		String name;
		
		//ask for name and size
		out.print("Enter 1st monster's name : ");
		name = keyboard.next();
		out.print("Enter 1st monster's size : ");
		size = keyboard.nextInt();
		
		//instantiate monster one
		Monster one = new Skeleton(name, size);
		
		//ask for name and size
		out.print("Enter 2nd monster's name : ");
		name = keyboard.next();
		out.print("Enter 2nd monster's size : ");
		size = keyboard.nextInt();
		
		//instantiate monster two
		Monster two = new Skeleton(name, size);
		
		out.println("Monster 1 – " + one);
		out.println("Monster 2 – " + two);
		
		if(one.isBigger(two)) {
			out.println("Monster one is bigger than Monster two");
		}
		if(one.isSmaller(two)) {
			out.println("Monster one is smaller than Monster two");
		}
		if(one.namesTheSame(two)) {
			out.println("Monster one has the same name as Monster two.");
		}
		else {
			out.println("Monster one does not have the same name as Monster two.");
		}


	}
}