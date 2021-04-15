//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		//add code here		
		System.out.print("Row totals are :: ");
		TotalRow s = new TotalRow();
		int [][] m = {{1,2,3},{5,5,5,5}};
		System.out.println(s.getRowTotals(m));
		
		//{{1,2,3},{5},{1},{2,2}};
		//{{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};

		
		

	}
}



