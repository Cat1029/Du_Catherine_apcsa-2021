//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		ArrayList<Word> wordList = new ArrayList<Word>();
		Scanner file = new Scanner(new File("words.dat"));
		int size = file.nextInt();
		for(int i=0; i<size; i++) {
			//out.println(file.nextLine());
			wordList.add(new Word(file.nextLine()));
		}
		Word temp;
		
  		for(int i=0; i<wordList.size()-1; i++) {
  			for(int j=i+1; j<wordList.size(); j++) {
	  			if(wordList.get(i).compareTo(wordList.get(j)) < 0) {
	  				temp = wordList.get(i);
	  				wordList.set(i,  wordList.get(j));
	  				wordList.set(j, temp);
	  			}
  			}
  		}
  		for(int i = 0; i<wordList.size();i++) {
  			out.println(wordList.get(i));
  		}



	}
}