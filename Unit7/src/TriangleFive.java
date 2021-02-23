//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		for(int i=0; i<amount; i++) {
			char character = letter;
			for(int x = amount; x>i; x--) {
				for(int y = 0; y<x; y++) {
					if(character > 'Z') {
						character = 'A';
					}
					output += character;
				}
				output +=" ";
				character++;
			}
			output+="\n";
		}
		return output;
	}
}