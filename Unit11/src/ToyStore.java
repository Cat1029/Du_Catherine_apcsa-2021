//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		String str[] = toys.split(" ");
		ArrayList<String> toyA = new ArrayList<String>();
		boolean x = false;
		for(int i=0; i<str.length; i++) {
			toyA.add(str[i]);
		}
		for(int j=0; j<toyA.size(); j++) {
			for(int y=0; y<toyList.size(); y++) {
				if(toyA.get(j).equals(toyList.get(y).getName())) {
					toyList.get(y).setCount(toyList.get(y).getCount() + 1);
					x = true;
				}
			}
			if(!x) {
				toyList.add(new Toy(toyA.get(j)));
			}
			x = false;
		}


	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(int i=0; i<toyList.size(); i++) {
  			if(nm.equals(toyList.get(i).getName())) {
  				return toyList.get(i);
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		Toy temp;
  		ArrayList<Toy> tempList = toyList;
  		for(int i=1; i<toyList.size(); i++) {
  			if(tempList.get(i).getCount()>tempList.get(i-1).getCount()) {
  				temp = tempList.get(i);
  				tempList.set(i,  tempList.get(i-1));
  				tempList.set(i-1, temp);
  			}
  		}
  		return tempList.get(0).getName().toString();
  	}  
  
  	public void sortToysByCount()
  	{
  		Toy temp;
  		for(int i=1; i<toyList.size(); i++) {
  			if(toyList.get(i).getCount()>toyList.get(i-1).getCount()) {
  				temp = toyList.get(i);
  				toyList.set(i,  toyList.get(i-1));
  				toyList.set(i-1, temp);
  			}
  		}
  	}  
  	  
	public String toString()
	{
		String output = "";
		for(int i=0; i<toyList.size(); i++) {
			output += toyList.get(i).toString();
			if(i<toyList.size()-1) {
				output+=", ";
			}
		}
	   return output;
	}
}