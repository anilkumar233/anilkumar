package assignment1;

import java.util.Scanner;

public class Square_of_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double num;
        Scanner sc= new Scanner(System.in);
 
        System.out.print("Enter a number: ");
        num=sc.nextDouble();
         sc.close();
        Double square = num*num; // Double square = Math.pow(numb, 2);
        System.out.println("Square of "+ num + " is: "+ square);
    }
	}


