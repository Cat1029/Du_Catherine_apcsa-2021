//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
   {
	   char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
	   for(int i=0; i<10; i++) {
		   if(a.charAt(0)== vowels[i]) {
			   return "yes";
		   }
		   else if (a.charAt(a.length()-1)== vowels[i]){
			   return "yes";
		   }
	   }
	   return "no";
   }
}