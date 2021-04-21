//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m=new String[size][size];
    	int i=0;
    	for(int r=0; r<size; r++) {
    		for(int c=0; c<size; c++) {
    			m[r][c]=str.substring(i++,i);
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	boolean found=false;
    	int len=m.length;
    	for(int r=0; !found&&r<len; r++) {
    		for(int c=0; !found&&c<len; c++) {
    			if(word.substring(0,1).equals(m[r][c])) {
    				found= checkRight(word,r,c)||
    						checkLeft(word,r,c)||
    						checkUp(word,r,c)||
    						checkDown(word,r,c)||
    						checkDiagUpRight(word,r,c)||
    						checkDiagUpLeft(word,r,c)||
    						checkDiagDownLeft(word,r,c)||
    						checkDiagDownRight(word,r,c);
    						
    			}
    		}
    	}
    	return found;
    }

	public boolean checkRight(String w, int r, int c)
   {
		for(int i=0; i<w.length(); i++) {
			if (c+i < 0 || c+i >= m.length)
				return false;
			if(!w.substring(i,i+1).equals(m[r][c+i])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		for(int i=w.length()-1; i>=0; i--) {
			if (c-i < 0 || c-i >= m.length)
				return false;
			if(!w.substring(i,i+1).equals(m[r][c-i])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkUp(String w, int r, int c)
	{
		for(int i=0; i<w.length(); i++) {
			if (r-i < 0 || r-i >= m.length)
				return false;
			if(!w.substring(i,i+1).equals(m[r-i][c])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDown(String w, int r, int c)
   {
		for(int i=0; i<w.length(); i++) {
			if (r+i < 0 || r+i >= m.length)
				return false;
			if(!w.substring(i,i+1).equals(m[r+i][c])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		for(int i=0; i<w.length(); i++) {
			if (r-i < 0 || r-i >= m.length||c+i<0|| c+i>=m.length)
				return false;
			if(!w.substring(i,i+1).equals(m[r-i][c+i])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		for(int i=0; i<w.length(); i++) {
			if (r-i < 0 || r-i >= m.length||c-i<0|| c-i>m.length)
				return false;
			if(!w.substring(i,i+1).equals(m[r-i][c-i])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		for(int i=0; i<w.length(); i++) {
			if (r+i < 0 || r+i >= m.length||c-i<0|| c-i>=m.length)
				return false;
			if(!w.substring(i,i+1).equals(m[r+i][c-i])) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		for(int i=0; i<w.length(); i++) {
			if (r+i < 0 || r+i >= m.length||c+i<0|| c+i>=m.length)
				return false;
			if(!w.substring(i,i+1).equals(m[r+i][c+i])) {
				return false;
			}
		}
		return true;
	}

    public String toString()
    {
    	String output="";
    	for(int i=0; i<m.length; i++) {
    		for(int j=0; j<m.length; j++) {
    			output+= m[i][j] + " ";
    		}
    		output+= "\n";
    	}
 		return output;
    }
}
