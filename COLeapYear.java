//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Chuck 
//Date - 9/25/18
//Lab  - Lab04_Ifs

import static java.lang.System.*; 
import java.util.Scanner;

public class COLeapYear
{
	private int year;
	
	public void setYear (int y)
	{
		year = y; 
	}
	
	public static boolean isLeapYear( int year )
	{
		if (year % 4 != 0)
		{
			return false;
		}
		
		else if (year % 400 == 0)
		{
			return true; 
		}
		
		else 
		{
			if (year % 100 == 0)
			{
				return false;
			}
			
			else 
			{
				return true; 
			}
		}
	}
}