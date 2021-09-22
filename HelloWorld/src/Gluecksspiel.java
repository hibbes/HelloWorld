public class Gluecksspiel {


	

	public static void main(String[] args) {
	
		Spieler s1 = new Spieler(16, 1, "Luisa Huber", 42);
		Spieler s2 = new Spieler(20
				
				, 0, "Tom Schmieder", 87);
		
		System.out.println(Gluecksspiel(s1, s2));
		
		
	}

	public static String Gluecksspiel(Spieler spieler1, Spieler spieler2) {
		int zufallszahl = (int) Math.round(Math.random() * 100);
		String ausgabe = "";
		int diff1 = 0;
		int diff2 = 0;
		
		ausgabe = ausgabe+begruessung(spieler1, spieler2);
		
		ausgabe = ausgabe+"Zufallszahl= " + zufallszahl+"\n";
		ausgabe = ausgabe+spieler1.name+" : " + spieler1.ratezahl+"\n";
		ausgabe = ausgabe+spieler2.name+" : " + spieler2.ratezahl+"\n";
		
		diff1 = Math.abs(zufallszahl - spieler1.ratezahl);
		diff2 = Math.abs(zufallszahl - spieler2.ratezahl);

		if (diff1 == diff2) {

			ausgabe = ausgabe +"Unentschieden!";
		} else {
			if (diff1 < diff2) {
				ausgabe = ausgabe + spieler1.name+" gewinnt!";
			} else {
				ausgabe = ausgabe + spieler2.name+" gewinnt!";
			}
		}
		
		return ausgabe;
	}

	public static String begruessung(Spieler spieler1, Spieler spieler2) {
		String begruessung = "";
		if (spieler1.alter < 18 || spieler1.geschlecht == 2) {
			begruessung = "Hallo " + spieler1.name + ",\n";
		} else {
			if (spieler1.geschlecht == 1) {
				begruessung = "Guten Tag Frau " + spieler1.alter + ",\n";
			} else {
				begruessung = "Guten Tag Herr " + spieler1.alter + ",\n";
			}
		}
		if (spieler2.alter < 18 || spieler2.geschlecht == 2) {
			begruessung = begruessung + "Hallo " + spieler2.name + ".\n";
		} else {
			if (spieler2.geschlecht == 1) {
				begruessung = begruessung + "Guten Tag Frau " + spieler2.name + ".\n";
			} else {
				begruessung = begruessung + "Guten Tag Herr " + spieler2.name + ".\n";
			}
		}

		return begruessung;
	}

}
