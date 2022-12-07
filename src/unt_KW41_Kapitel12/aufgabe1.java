package unt_KW41_Kapitel12;

public class aufgabe1 {

	private static Object eingabe;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Geben Sie den gesamtbetrag ein:");
		
		double Gesamtbetrag = 200.0;
		double Discountpreis;
		
		if (Gesamtbetrag >= 10.0)
		{
			Discountpreis = Gesamtbetrag - Gesamtbetrag*0.1;
			
		System.out.println("Discountpreis:" + Discountpreis);
		}
		
		else 
		{
			System.out.println(Gesamtbetrag);
		}
		
		
		
		
		
	}

}
