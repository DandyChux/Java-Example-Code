//(c) A+ Computer Science 
//www.apluscompsci.com

//Name - Chuck 	
//Date - 9/12/18
//Class - 2B 
//Lab  - Lab03

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class CODistance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public CODistance()
	{
		xOne = 0; 
		yOne = 0;
		xTwo = 0; 
		yTwo = 0; 
	}

	public CODistance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1, y1, x2, y2);
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		x1 = xOne; 
		y1 = yOne; 
		x2 = xTwo; 
		y2 = yTwo; 
	}

	public void calcDistance()
	{
		distance = Math.sqrt(((xTwo - xOne)*(xTwo-xOne)) + ((yTwo - yOne)*(yTwo - yOne)));
	}
	
	public double getDistance()
	{
		return 0.0;
	}
	
	public void print()
	{
		System.out.println("\ndistance ==" + distance + "\n\n\n");
	}

	public String toString()
	{
		return "";
	}
}