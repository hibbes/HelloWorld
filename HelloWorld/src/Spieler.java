import java.util.Scanner;

public class Spieler {
	Scanner sc = new Scanner(System.in);
	int alter = 19;
	int geschlecht = 2;
	String name = "";
	int ratezahl;

	public Spieler(int alter, int geschlecht, String name) {
		this.alter = alter;
		this.geschlecht = geschlecht;
		this.name = name;
		int ratezahl;
	}

	public void eingabe() {

		do {
			System.out.print(name + ", bitte eine Zahl zwischen 1 und 100 eingeben: ");
			String eingabe = sc.next();
			try {
				ratezahl = Integer.parseInt(eingabe);

				System.out.println("Eingegebene Zahl: " + ratezahl);
			} catch (NumberFormatException e) {
				System.out.println("Es wurde keine Zahl eingegeben");

			}
            if(ratezahl > 100 || ratezahl < 1) {
            	System.out.println("Bitte Wertebereich zwischen 1-100 einhalten.");
            }
		} while (ratezahl > 100 || ratezahl < 1);
	}
}