
public class Main {

	public static void main(String[] args) {
		
		Spieler s1 = new Spieler(16, 1, "Luisa Huber");
		Spieler s2 = new Spieler(20, 0, "Tom Schmieder");
		Gluecksspiel g1 = new Gluecksspiel(s1,s2);
		
		System.out.println(g1.begruessung());
		System.out.println(g1.spielen());
	}
	
}
