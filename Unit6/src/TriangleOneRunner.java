//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		TriangleOne first = new TriangleOne("hippo");
		first.print();
		
		TriangleOne second = new TriangleOne("abcd");
		second.print();
		
		TriangleOne third = new TriangleOne("it");
		third.print();
		
		TriangleOne fourth = new TriangleOne("a");
		fourth.print();
		
		TriangleOne fifth = new TriangleOne("chicken");
		fifth.print();
	}
}