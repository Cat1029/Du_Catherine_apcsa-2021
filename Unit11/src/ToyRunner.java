//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy sorry = new Toy("sorry");
		sorry.setCount(1);
		Toy giJoe = new Toy("gi joe");
		giJoe.setCount(5);
		System.out.println(sorry);
		System.out.println(giJoe);
	}
}