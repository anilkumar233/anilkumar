package day2;

public class Char {
	 char i;   //instance variable
	    static char j; 
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char k='a';
	        System.out.println(k);
	        
	        //since i want to access global variable i which is non static inside static void main 
	        //so i have to create object of Variable class
	        Char v=new Char(); //create object of class Variable
	        System.out.println(v.i);
	        
	        System.out.println(j);
	}

}
