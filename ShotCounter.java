import java.util.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class ShotCounter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		System.out.print("Enter the total number of vaccines given: ");
		int total = input.nextInt();
		
		for (int i = 1500; i > 0; i--) {
			
			System.out.print("Enter the number of doses just made: ");
			int doses = input.nextInt();
			
			total = total + doses;
			System.out.println("The total at "+sdf.format(cal.getTime())+" is: "+total+" vaccines given.");
		}
	}
}