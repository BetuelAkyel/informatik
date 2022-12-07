package unt_KW45_Kapitel15;


import java.util.Scanner;


public class aufgabe2 {

	public static void main(String[] args) {

		
		
		Scanner eingabe = new Scanner(System.in);

		
		System.out.println("Geben Sie ein Wort ein:");
		String wort = eingabe.next();
		int laenge = wort.length();
		
		System.out.println();
		
		
		int x;
		for (x=1; x<=laenge; x++) {
			System.out.println(wort);
		}
		
		
		
		
	}

}
