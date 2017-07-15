import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Rational
{
	
	private int numerator, denominator;
	
	
	public Rational(int n, int d)
	{
		setNumerator(n);
		setDenominator(d);
	}
	
	public void setNumerator(int n)
	{
		this.numerator = n;
	}
	
	public void setDenominator(int d)
	{
		if(d == 0)
		{
			JOptionPane.showMessageDialog(null, "Just a Reminder The Denominator Cannot be 0!" ,"ERROR", JOptionPane.ERROR_MESSAGE);
			
			
		}
		else
		{
			this.denominator = d; 
		}
		 
	}

	public int getNumerator()
	{
		return this.numerator;
	}
	
	public int getDenominator()
	{
		return this.denominator;
	}
	
	//useful for division
	public Rational reciprocal()
	{
		  return new Rational(this.denominator, this.numerator);
	}
	
	
	
	public Rational add(Rational r1, Rational r2)
	{
		int d1 = r1.getDenominator();
		int n1 = r1.getNumerator();
		int d2 = r2.getDenominator();
		int n2 = r2.getNumerator();
		int LCD = findLCD(d1, d2);
		
		//FIRST FRACTION
		int factor1 = LCD/d1;
		int denom1 = d1*factor1;
		int num1 = n1*factor1;
		r1.setDenominator(denom1);
		r1.setNumerator(num1);
		
		//SECOND FRACTION
		int factor2 = LCD/d2;
		int denom2 = d2*factor2;
		int num2 = n2*factor2;
		r2.setDenominator(denom2);
		r2.setNumerator(num2);
		
		//ANSWER FRACTION
		Rational r3 = new Rational(1,1);
		r3.setNumerator(num1 + num2);
		r3.setDenominator(denom1);
		simplify(r3);
		return r3;
		
		
	}
	
	public Rational subtract(Rational r1, Rational r2)
	{
		int d1 = r1.getDenominator();
		int n1 = r1.getNumerator();
		int d2 = r2.getDenominator();
		int n2 = r2.getNumerator();
		int LCD = findLCD(d1, d2);
		
		//FIRST FRACTION
		int factor1 = LCD/d1;
		int denom1 = d1*factor1;
		int num1 = n1*factor1;
		r1.setDenominator(denom1);
		r1.setNumerator(num1);
		
		//SECOND FRACTION
		int factor2 = LCD/d2;
		int denom2 = d2*factor2;
		int num2 = n2*factor2;
		r2.setDenominator(denom2);
		r2.setNumerator(num2);
		
		//ANSWER FRACTION
		Rational r3 = new Rational(1,1);
		r3.setNumerator(num1 - num2);
		r3.setDenominator(denom1);
		simplify(r3);
		return r3;
		
	}
	
	public Rational multiply(Rational r1, Rational r2)
	{
		int d1 = r1.getDenominator();
		int n1 = r1.getNumerator();
		int d2 = r2.getDenominator();
		int n2 = r2.getNumerator();

		int num = n1 * n2;
		int denom = d1 * d2;
		
		if(num < 0 && denom < 0)
		{
			num = -1 * num;
			denom = -1 * denom;
		}
		
		Rational r3 = new Rational(1,1);
		r3.setNumerator(num);
		r3.setDenominator(denom);
		simplify(r3);
		
		return r3;
		
		
		
	}
	
	public Rational divide(Rational r1, Rational r2)
	{
		r2 = r2.reciprocal();
		return multiply(r1,r2);
	}
	
	
	
	//LCD
	public int findLCD(int d1, int d2)
	{
		//make a for loop that assigns the greater

		if(d1 != 0 && d2 != 0)
		{
			if( d1 == d2)
			{
				return d1;
			}
				int larger = (int)Math.max(Math.abs(d1), Math.abs(d2));
				int smaller = (int)Math.min(Math.abs(d1), Math.abs(d2));

				if(larger % smaller == 0)
				{
					return larger;
				}

				int LCD = larger;
				for(int i = 2; i <= smaller; i++ )
				{
					LCD *= i;
					if(LCD % smaller == 0)
					{
						break;
					}

					LCD /= i;
				}
				return LCD;

			}

			return 0;
		}
	
	
	
	//GFC
	public int getGCF(int d1, int d2) 
	{
		int larger = Math.max(Math.abs(d1), Math.abs(d2));
		int smaller = Math.min(Math.abs(d1), Math.abs(d2));

		if (smaller != 0) 
		{
			while (true) 
			{
				if (larger % smaller == 0)

		return smaller;

		int d = larger - smaller;
		larger = Math.max(d, smaller);
		smaller = Math.min(d, smaller);
		}
		} else
		return 0;
		}
	
	
	//simplify
	public Rational simplify(Rational r) 
	{
		int gcf = this.getGCF(r.numerator, r.denominator);
		if (gcf != 0) 
		{
			r.numerator = r.numerator / gcf;
			r.denominator = r.denominator / gcf;
		
			// this is the change (involving negative numbers)
			if (r.getNumerator() < 0 && r.getDenominator() < 0) 
			{
				r.numerator = r.numerator / -1;
				r.denominator = r.denominator / -1;
			}

			return r;
		} 
		else 
		{
			return new Rational(0, r.denominator);
		}
	}
	
	//primes
	public boolean isPrime(int number)
	{
		for(int i = 2; i < number; i++)
		{
			if(number % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public ArrayList<Integer> getPrimeFactors(int number)
	{
		ArrayList <Integer>list = 
				new ArrayList<Integer>();
		//do the stuff now
		int counter = 2;
		do
		{
			if(isPrime(counter) )
			{
				list.add(new Integer(counter));
			}
			
			counter++;
		}while(counter < number);
	
		
		return list;
	}
	
	public String toString()
	{
		return this.numerator + "/" + this.denominator;
	}
	
	public static void main(String[] args) 
	{
		Rational r1 = new Rational(1, 3);
		Rational r2 = new Rational(2, 0);
		System.out.println(r1.divide(r1, r2));
	}
	
	
	
}