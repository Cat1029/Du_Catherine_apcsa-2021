//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover one = new LetterRemover("I am Sam I am", 'a');
		out.println(one);
		
		LetterRemover two = new LetterRemover("ssssssssxssssesssssesss", 's');
		out.println(two);
		
		LetterRemover three = new LetterRemover("qwertyqwertyqwerty", 'a');
		out.println(three);
		
		LetterRemover four = new LetterRemover("abababababa" ,'b');
		out.println(four);
		
		LetterRemover five = new LetterRemover("abaababababa", 'x');
		out.println(five);	
											
	}
}