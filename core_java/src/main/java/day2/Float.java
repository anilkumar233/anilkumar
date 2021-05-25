package day2;

public class Float {
	 float i;   //instance variable
	    static float j; //class variable
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 float k=8;
	        System.out.println(k);
	        
	        //since i want to access global variable i which is non static inside static void main 
	        //so i have to create object of Variable class
	        Variable v=new Variable(); //create object of class Variable
	        System.out.println(v.i);
	        
	        System.out.println(j);
	}

}
