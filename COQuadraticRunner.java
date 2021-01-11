//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Chuck 
//Date - 9/12/18 
//Class - 2B
//Lab  - Lab03

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class COQuadraticRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		  		
  		System.out.println("Enter an integer...");
  		int a = keyboard.nextInt();
  		
  		System.out.println("Enter an integer...");
  		int b = keyboard.nextInt();
  		
  		System.out.println("Enter an integer...");
  		int c = keyboard.nextInt();
  		
  		COQuadratic test = new COQuadratic();
  		
  		test.setEquation(a,b,c);
  		test.calcRoots();
  		test.print();
  		
  		System.out.println("Enter an integer...");
  		 a = keyboard.nextInt();
  		
  		System.out.println("Enter an integer...");
  		 b = keyboard.nextInt();
  		
  		System.out.println("Enter an integer...");
  		c = keyboard.nextInt();
  		
  	
  		
  		test.setEquation(a,b,c);
  		test.calcRoots();
  		test.print();
  		
  		System.out.println("Enter an integer...");
  		 a = keyboard.nextInt();
  		
  		System.out.println("Enter an integer...");
  		 b = keyboard.nextInt();
  		
  		System.out.println("Enter an integer...");
  		 c = keyboard.nextInt();
		  		

  		
  		test.setEquation(a,b,c);
  		test.calcRoots();
  		test.print();
	
	}
}