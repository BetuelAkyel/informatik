package unt_KW45_Kapitel15;

import java.util.Scanner;

public class aufgabe1 {

	public static void main(String[] args) {

		
		Scanner eingabe = new Scanner(System.in);

		
		
		System.out.println("Startwert:");
		int Startwert = eingabe.nextInt();

		
		System.out.println("Endwert:");
		int Endwert = eingabe.nextInt();

		
		int x;
		for (x=Startwert; x<=Endwert; x++) {
			System.out.println(x);
		}
		
		
	}

}
