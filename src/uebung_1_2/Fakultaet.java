package uebung_1_2;

public class Fakultaet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ergebnis = 1;
		for (int x = 1; x < 8; x++) {
			ergebnis = ergebnis * x;
		}
		System.out.println("Ergebnis: " + ergebnis);
	}

}
