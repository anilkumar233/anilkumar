package assignment1;

import java.util.Scanner;

public class cubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int square;
		int cube;
		
		
		System.out.println("Number\tSquare\tCube");
		
		
		
		for (number=1; number<11; number++);
		{
			square= number * number;//
			cube= number * square;
			System.out.println(number+"\t"+square+"\t"+cube);
		}
		System.out.println("  ");
	}
}
		
		
		
		/* int number, cube;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();		
		sc.close();
		cube = number * number * number;
		
		System.out.println("\n The Cube of a Given Number  " + number + "  =  " + cube);*/
	
