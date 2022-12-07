package unt_KW41_Kapitel12;

import java.util.Scanner;

public class aufgabe3 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner eingabe = new Scanner(System.in);

	System.out.println("Tankkapazität:");
	int tankkapazität = eingabe.nextInt();

	System.out.println("Benzinanzeige:");
	double benzinanzeige = eingabe.nextInt()/3.78;
	
	System.out.println("Meilen pro Gallone:");
	int meilenprogallone = eingabe.nextInt();
		
	

	double reichweite = (tankkapazität * benzinanzeige / 100)*meilenprogallone ;
	
	
	if (reichweite <= 200)
	{
		System.out.println("Tanken!");
	}
	
	
	else 
	{
		System.out.println("Weiterfahren...");
	}
	
	
	}

}
