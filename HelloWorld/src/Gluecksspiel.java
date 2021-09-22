public class Gluecksspiel {

	static int zufallszahl = (int) Math.round(Math.random() * 100);
	static byte alter = 19;
	static byte geschlecht = 2;
	static String name = "Marek Czernohous";
	static int spieler1Zahl = 42;
	static int spieler2Zahl = 87;
	static int diff1 = 0;
	static int diff2 = 0;

	public static void main(String[] args) {
		System.out.println("Zufallszahl= " + zufallszahl);
		System.out.println("Spieler 1= " + spieler1Zahl);
		System.out.println("Spieler 2= " + spieler2Zahl);

		diff1 = Math.abs(zufallszahl - spieler1Zahl);
		diff2 = Math.abs(zufallszahl - spieler2Zahl);

		if (diff1 == diff2) {

			System.out.println("Unentschieden!");
		} else {
			if (diff1 < diff2) {
				System.out.println("Spieler 1 gewinnt!");
			} else {
				System.out.println("Spieler 2 gewinnt!");
			}
		}

		if (alter < 18 || geschlecht == 2) {
			System.out.println("Hallo " + name + "!");
		} else {
			if (geschlecht == 1) {
				System.out.println("Guten Tag Frau " + name + "!");
			} else {
				System.out.println("Guten Tag Herr " + name + "!");
			}
		}
	}
}
