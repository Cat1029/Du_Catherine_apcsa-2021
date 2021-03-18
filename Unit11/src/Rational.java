//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	int num;
	int den;
	
	//write two constructors
	public Rational() {
		setRational(1, 1);
	}

	public Rational(int x, int y) {
		setRational(x,y);
	}

	//write a setRational method
	public void setRational(int x, int y) {
		setNum(x);
		setDen(y);
	}
	

	//write  a set method for numerator and denominator
	
	public void setNum(int x) {
		num = x;
	}
	
	public void setDen(int y) {
		den = y;
	}

	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		int num = (getNum()*other.getDen()) + (getDen()*other.getNum());
		int den = getDen()*other.getDen();
		setNum(num);
		setDen(den);
		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(num, den);
		setNum(getNum()/gcd);
		setDen(getDen()/gcd);


	}

	private int gcd(int numOne, int numTwo)
	{
		int min = Math.min(numOne, numTwo);
		for(int i=min; i>1; i--) {
			if(numOne%i==0 && numTwo%i==0) {
				return i;
			}
		}
		return 1;
	}

	public Object clone ()
	{
		return new Rational(getNum(), getDen());
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNum() {
		return num;
	}
	
	public int getDen() {
		return den;
	}
	
	
	public boolean equals( Object obj)
	{
		int objNum = ((Rational)obj).getNum();
		int objDen = ((Rational)obj).getDen();
		int greatest = gcd(objNum, objDen);
		objNum = objNum/greatest;
		objDen = objDen/greatest;
		return (num==objNum && den==objDen);
	}

	public int compareTo(Rational other)
	{
		reduce();
		other.reduce();
		if(this.getDen()<other.getDen()) {
			return -1;
		}
		else if(this.getDen()==other.getDen()) {
			if(this.getNum()<other.getNum()) return -1;
			else if(this.getNum()>other.getNum()) return 1;
			else return 0;
		}
		return -1;
	}

	//write  toString() method
	public String toString() {
		return num + "/" + den + "\n";
	}
	
	
}