package unt_KW41_Kapitel12;

import java.util.Scanner;

public class aufgabe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner eingabe = new Scanner(System.in);

		
		System.out.println("Preis pro Pfund Packung A:");
		double preispropfundpackungA = eingabe.nextDouble();

		System.out.println("Prozentmageres Fleisch Packung A:");
		double prozentmageresfleischpackungA = eingabe.nextDouble();

		System.out.println("Preis pro Pfund Packung B:");
		double preispropfundpackungB = eingabe.nextDouble();
		
		System.out.println("Prozentmageres Fleisch Packung B:");
		double prozentmageresfleischpackungB = eingabe.nextDouble();

		
		
		
		double preisPackungA = preispropfundpackungA / (prozentmageresfleischpackungA/100);
				
		double preisPackungB = preispropfundpackungB / (prozentmageresfleischpackungB/100);

		
		System.out.println("Packung A kostet pro Pfund mageres Fleisch:" + preisPackungA);
		System.out.println("Packung B kostet pro Pfund mageres Fleisch:" + preisPackungB);

		
		
		if (preisPackungA < preisPackungB)
		{
			System.out.println("Packung A ist preiswertiger");
		}
		
		
		else
		{
			System.out.println("Packung B ist preisgünstiger");

		}
		
		
		 
		
		
	}

}
