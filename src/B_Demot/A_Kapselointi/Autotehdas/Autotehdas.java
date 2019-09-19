package B_Demot.A_Kapselointi.Autotehdas;

public class Autotehdas {

	public static void main(String[] args) {

		// Olioiden luominen
		Auto a1 = new Auto();
		Auto a2 = new Auto();

		// Asetetaan arvot
		a1.nopeus = 20;
		a2.nopeus = 100;
		a1.väri = "Punainen";
		a2.väri = "Sininen";

		// Olioiden tulostaminen
		System.out.println(a1);
		System.out.println(a2);

	}

}
