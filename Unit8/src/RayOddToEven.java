//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	int[] ray;
	
	public RayOddToEven() {
		setRay(new int[] {0, 0, 0, 0, 0} );
	}
	public RayOddToEven(int[]x) {
		setRay(x);
	}
	
	public void setRay(int[] x) {
		ray = x;
	}
	public int go(int[] ray)
	{
		int oddPos = 0;
		int evenPos = 0;
		for(int i = 0; i<ray.length; i++) {
			if(ray[i]%2 == 1) {
				oddPos = i;
				for(int j = i; j<ray.length; j++) {
					if(ray[j]%2==0) {
						evenPos = j;
						return j-i;
					}
				}
				return -1;
			}
		}
		return -1;
	}
	
	public String toString() {
		String output = go(ray) + "";
		return output;
	}
}