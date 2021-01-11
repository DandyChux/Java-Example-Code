//(c) A+ Computer Science
// www.apluscompsci.com

//Name - Chuck 
//Date - 9/12/18
//Class - 2B
//Lab  - Lab03

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class COQuadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;
	private double quadA, quadB, quadC;

	public COQuadratic()
	{
		setEquation(0,0,0);
		rootOne = 0.0;
		rootTwo = 0.0; 
	}

	public COQuadratic(int quadA, int quadB, int quadC)
	{
		setEquation(quadA, quadB, quadC);
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		quadA = a; 
		quadB = b; 
		quadC = c; 
 	}

	public void calcRoots( )
	{
		rootOne = (-1*(quadB) + Math.sqrt((quadB*quadB) - ((4*quadA)*quadC))) / (2*quadA);
		rootTwo = (-1*(quadB) - Math.sqrt((quadB*quadB) - ((4*quadA)*quadC))) / (2*quadA);
	}

    public void print()
	{
		System.out.println();
		System.out.println();
		System.out.printf("rootone :: " + "%.2f\n",rootOne);
		System.out.printf("roottwo :: " + "%.2f\n",rootTwo);
		System.out.print("\n\n\n\n");
	
    }
}