//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
      printASmallBox();
      printTwoBlankLines();
      printABigBox();
   }

   public void printTwentyStars()
   {
	   String star = "** ";
	   out.println(star.repeat(10));
   }

   public void printTwentyDashes()
   {
	   String dash = "-- ";
	   out.println(dash.repeat(10));
   }

   public void printTwoBlankLines()
   {
	   out.println("\n\n");
   }
   
   public void printASmallBox()
   {	
	   printTwentyDashes();
	   for (int i = 1; i < 5; i++) {
		   printTwentyStars();
		   printTwentyDashes();
       }
   }

 
   public void printABigBox()
   { 	
	   printTwentyDashes();
	   for (int i = 1; i < 10; i++) {
		   printTwentyStars();
		   printTwentyDashes();
       }
   }   
}