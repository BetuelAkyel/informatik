package probeklausur;
import java.util.Scanner;
public class aufgabe5_ {

	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);

		
		
		
		System.out.println("Welche Note hast du?");
		
		int note = eingabe.nextInt();

		if (note <= 4) {
			System.out.println("Leider ein Unterkurs");
			System.out.println("Beim nächsten Mal wird es besser!");
		}
		
		
		else {
		
			if (note > 12) {
				System.out.println("Eine sehr gute Leistung");
			}
			
			else {
				System.out.println("Das war doch ok!");
			}
		}
		
	}

}
