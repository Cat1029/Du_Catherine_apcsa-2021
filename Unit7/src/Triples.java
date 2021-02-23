//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for(int i = 1; i<=a && i<=b && i<=c; i++) {
			if(a%i == 0 && b%i == 0 && c%i ==0) {
				max = i;
			}					
		}
				
		return max;	
	}

	public String toString()
	{
		String output="";
		output = three() + "\n";

		return output+"\n";
	}
	
	public String three() {
		int a;
		int b;
		int c;
		String str = "";
		for(a = 1; a<=number; a++) {
			for(b = a; b<=number; b++) {
				for(c = b; c<=number; c++) {
					if(Math.pow(a, 2)+Math.pow(b, 2) == Math.pow(c,2)) {
						if((a%2 == 0 && b%2 == 1) || a%2 == 1 && b%2 == 0) {
							if(c%2 == 1) {
								if(greatestCommonFactor(a, b, c) <= 1) {
									str = str + a + " " + b + " " + " " +c + "\n";
								}
							}
								
							}
							
						}
					}
				}
			}
		return str;
	}
}