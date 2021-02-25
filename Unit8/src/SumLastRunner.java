import static java.lang.System.out;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumLastRunner
{
	public static void main( String args[] )
	{		
		int[] array = new int[]{-99,1,2,3,4,5,6,7,8,9,10,5};
		RaySumLast test = new RaySumLast(array);
		out.println(test);
		 
		int[] arrayOne = new int[]{10,9,8,7,6,5,4,3,2,1,-99};
		RaySumLast testOne = new RaySumLast(arrayOne);
		out.println(testOne);
		   
		int[] arrayTwo = new int[]{10,20,30,40,50,-11818,40,30,20,10};
		RaySumLast testTwo = new RaySumLast(arrayTwo);
		out.println(testTwo);
		   
		int[] arrayThree = new int[]{32767};
		RaySumLast testThree = new RaySumLast(arrayThree);
		out.println(testThree);
		   
		int[] arrayFour = new int[]{255,255};
		RaySumLast testFour = new RaySumLast(arrayFour);
		out.println(testFour);
		
		int[] arrayFive = new int[]{9,10,-88,100,-555,2};
		RaySumLast testFive = new RaySumLast(arrayFive);
		out.println(testFive);
		
		int[] arraySix = new int[]{10,10,10,11,456};
		RaySumLast testSix = new RaySumLast(arraySix);
		out.println(testSix);
		
		int[] arraySeven = new int[]{-111,1,2,3,9,11,20,1};
		RaySumLast testSeven = new RaySumLast(arraySeven);
		out.println(testSeven);
		
		int[] arrayEight = new int[]{9,8,7,6,5,4,3,2,0,-2,6};
		RaySumLast testEight = new RaySumLast(arrayEight);
		out.println(testEight);
		
		int[] arrayNine = new int[]{12,15,18,21,23,1000};
		RaySumLast testNine = new RaySumLast(arrayNine);
		out.println(testNine);
		
		int[] arrayTen = new int[]{250,19,17,15,13,11,10,9,6,3,2,1,0};
		RaySumLast testTen = new RaySumLast(arrayTen);
		out.println(testTen);
		
		int[] arrayEleven = new int[]{9,10,-8,10000,-5000,-3000};
		RaySumLast testEleven = new RaySumLast(arrayEleven);
		out.println(testEleven);
		
	}
}