//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect() {
	   number = 0;
   }
   
   public Perfect(int num) {
	   setNum(num);
   }

	//add a set method
   public void setNum(int num) {
	   number = num;
   }

	public boolean isPerfect()
	{
		int sum = 0;
		for(int i = 1; i<number; i++) {
			if(number % i == 0) {
				sum = sum + i;
			}
		}
		if(number == sum) {
			return true;
		}
		else return false;
	}

	//add a toString	
	public String toString() {
		if(isPerfect() == true) {
			return number + " is perfect" +"\n";
		}
		else return number + " is not perfect" + "\n";
	}
	
}