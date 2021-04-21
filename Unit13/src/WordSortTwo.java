//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		int count=0;		
		for(String words: sentence.split(" ")) {
			count++;
		}
		wordRay = new String[count];
		int i=0;
		for(String words: sentence.split(" ")) {
			wordRay[i]=words;
			i++;
		}
	}

	public void sort()
	{
		
		int min=0;
		String temp=wordRay[0];
		for (int i = 0; i < wordRay.length-1; i++) 
	    { 
	        min = i; 
	        for (int j = i+1; j < wordRay.length; j++) 
	        if (wordRay[j].compareTo(wordRay[min])<0) 
	            min = j; 
	  
	        temp=wordRay[min];
	        wordRay[min]=wordRay[i]; 
	        wordRay[i]=temp;
	    } 
	}

	public String toString()
	{
		String output="";

		for(int i=0; i<wordRay.length; i++) {
			output += wordRay[i] +"\n";
		}
		return output+"\n\n";
	}
}