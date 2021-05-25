package assignment1;

import java.util.Scanner;

public class Square_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Double num;
	        Scanner sc= new Scanner(System.in);
	 
	        System.out.print("Enter a number: ");
	        num = sc.nextDouble();
	         sc.close();
	        Double squareroot = Math.pow(num, 0.5);
	        System.out.println("The Square of a Given Number  " + num + "  =  " + squareroot);
	    }
	}

		

