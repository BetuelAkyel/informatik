package Einführung;

public class untKW40_Kontrollstrukturen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		double price=400 ;
		

		
		
		if (price < 1000)
		{
			price = price - price * 0.03;
		}

		
		else if (price < 5000)
		{
			price = price - price * 0.05;
		}
		
		
		else
		{
			price = price - price * 0.08;
		}
		
		
		System.out.println(price);
		
		
		
		
		}
		
	}	

