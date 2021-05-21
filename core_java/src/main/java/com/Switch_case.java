package com;

public class Switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=85;
		if(m>=65){
//			 System.out.print("First division");
			m=1;
			 
		}
		else{
			if(m>=45 && m<65 )
			{
//			 System.out.print("Second divison");
				m=2;
		}
			else{
				if(m>=33 && m<45)
				{
//				 System.out.print("	Third divison");
					m=3;
			}
				else{
//					System.out.print("fail");
					m=4;
				}
			}
					
			}
		switch(m)
		{
		case 1 :System.out.print("First division");
		break;
		case 2 :System.out.print("second division");
		break;
		case 3 :System.out.print("third division");
		break;
		case 4 :System.out.print("fail");
		break;
		default :System.out.print("invalid choice");
		}
	}
}
			
	
		

	

	