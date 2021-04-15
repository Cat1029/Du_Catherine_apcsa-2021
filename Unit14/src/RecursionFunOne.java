//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	//the assigment wants even numbers??
	static int count=0;
	
	public static int countOddDigits(int num)
	{
		if(num>0) {
			  if((num%10)%2==0) {
				  count+=1;
			  }
			  num /=10;
			  return countOddDigits(num);
		}
		return count;
	}
}