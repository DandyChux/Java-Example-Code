//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Chuck 
//Date - 9/12/18 
//Class - 2B 
//Lab  - Lab03

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class CODistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		CODistance test = new CODistance(); 
		
		out.print("Enter X1 :: ");
		int xOne = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int yOne = keyboard.nextInt();
		out.print("Enter X2 :: ");
		int xTwo = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int yTwo = keyboard.nextInt();
		
		test.calcDistance(); 
		test.print();
			
	}
}