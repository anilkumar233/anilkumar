package assignment1;

import java.util.Scanner;

public class Compound_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double princ = 456000, rt = 9.75, tm = 7;
	      double comp_int = princ *(Math.pow((1 + rt / 100), tm));
	      System.out.println("The compound interest for the given principle amount, rate and time is "+          comp_int);
	   }
	
		/*create an object of Scanner class
		    Scanner input = new Scanner(System.in);

		    // take input from users
		    System.out.print("Enter the principal: ");
		    double principal = input.nextDouble();

		    System.out.print("Enter the rate: ");
		    double rate = input.nextDouble();

		    System.out.print("Enter the time: ");
		    double time = input.nextDouble();

		    System.out.print("Enter number of times interest is compounded: ");
		    int number = input.nextInt();

		    double interest = principal * (Math.pow((1 + rate/100), (time * number))) - principal;

		    System.out.println("Principal: " + principal);
		    System.out.println("Interest Rate: " + rate);
		    System.out.println("Time Duration: " + time);
		    System.out.println("Number of Time interest Compounded: " + number);
		    System.out.println("Compound Interest: " + interest);

		    input.close();*/
		  
	}


