//(c) A+ Computer Science  -  www.apluscompsci.com

import java.util.*;

//this example demonstrates how to to use a
//while loop to average all of the digits of a number

public class COAveragingDigits
{
	
	public static int countDigits( int num )
	{
		int count = 0; 
		
		while(num > 0)
		{
			count ++;
			num = num/10;
		}
		
		return count;
	}

	//pre - num > 0
	//post - sum of digits in num will be returned
	public static double sumDigits( int num )
	{
		int total = 0;

		while(num > 0)
		{
			total = total + num%10;
			num = num/10;
			
		}
		
		System.out.println(total);
		return total;
	}

	//pre - none
	//post - average of digits in num will be returned
	//         unless num <= 0 then 0 is returned
	public static double averageDigits( int num )
	{
		return sumDigits(num)/countDigits(num);
	}

   public static void main(String args[])
   {
		Scanner kb = new Scanner( System.in );
		System.out.print( "Enter a number > 0 :: " );
		int num = kb.nextInt();
		System.out.println("The digit average is " + averageDigits(num) );
	}
}
