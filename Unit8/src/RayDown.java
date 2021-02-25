//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	int[] numArray;
	
	public RayDown() {
		setRay(new int[] {0, 0, 0, 0, 0} );
	}
	public RayDown(int[]x) {
		setRay(x);
	}
	
	public void setRay(int[] x) {
		numArray = x;
	}
	
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		for(int i = 1; i<numArray.length; i++) {
			if(numArray[i]>=numArray[i-1]) {
				return false;
			}
		}
		return true;
	}	
	
	public String toString() {
		String output = go(numArray) +"";
		return output;
	}
}