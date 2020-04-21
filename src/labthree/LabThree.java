package labthree;

import java.util.Scanner;

public class LabThree {
	public static void main (String [] args) {
		
		Scanner kbd = new Scanner (System.in);

		System.out.println("Enter a value between 1 and 100");
		int input = kbd.nextInt();
		System.out.println("Enter your prefered username: ");
		String username = kbd.next();
		
		
		if(input > 0 && input <= 100) {
			
		if(input % 2 != 0) {
		System.out.println(username + " your number is " + input + "," +  " it is Odd");
		}
		else if (input % 2 == 0 && (input >=2 && input <=25)) {
			System.out.println(username + " your number is even and less than 25");
		}
		else if(input % 2 == 0 && (input >=26 && input <=60)){
			System.out.println(username + " your number is even");	
		}
		else if(input % 2 == 0 && input > 60){
			System.out.println( username + "your number is "+ input + "," + " it is Even");	
		}
		else if(input % 2 != 0 && input > 60) {
			System.out.println( username + " your number is " + input + "," + "Odd");
			}
		}
		else {
			System.out.println("Please enter a valid integer.");
		}
		
		
	System.out.println("Official Program Ending. Goodbye.");
	kbd.close();
	}	
	
	}
