//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a, b, c, d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double bigOne = 0.0;
		double bigTwo = 0.0;
		bigOne = Double.max(one, two);
		bigTwo = Double.max(three, four);
		double biggest = Double.max(bigOne, bigTwo);
		
		return biggest;
	}

	public String toString()
	{
	   return one + " " + two + " " + three  + " " + four;
	}
}