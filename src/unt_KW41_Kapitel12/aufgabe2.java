package unt_KW41_Kapitel12;

import java.util.Scanner;

public class aufgabe2 {

	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);
		
		
		System.out.println("Anzahl der Schrauben:");
		int Schrauben = eingabe.nextInt();

		System.out.println("Anzahl der Unterlegscheiben:");
		int Unterlegscheiben = eingabe.nextInt();
		
		System.out.println("Anzahl der Muttern:");
		int Muttern = eingabe.nextInt();
		
		
		int preisSchraube = 5;
		int preisMuttern = 3;
		int preisUnterlegscheibe = 1;
		
		
		System.out.println( );
		
		if (Schrauben > Muttern)
		{
			System.out.println("Kontrollieren Sie ihre Bestellung!");
		}
		
		
		else 
		{
			System.out.println("Die Bestellung ist okay.");
		}
		
		System.out.println( );
	
		int Gesamtbetrag = preisSchraube*Schrauben + preisUnterlegscheibe*Unterlegscheiben + preisMuttern*Muttern;
		System.out.println("Gesamtbetrag:" + Gesamtbetrag);
		
		eingabe.close();
		
	}

}
