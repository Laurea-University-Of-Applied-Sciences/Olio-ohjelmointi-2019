package B_Demot.A_Kapselointi.Omenakone;

public class Omenakone {

	public static void main(String[] args) {

		// Luodaan olio
		Omena ekaOmena = new Omena();
		Omena tokaOmena = new Omena();
		Omena kolmasOmena = new Omena();

		// Asetetaan arvot
		ekaOmena.v�ri = "vihre�";
		ekaOmena.lajike = "Valkeakuulas";
		

		tokaOmena.v�ri = "Punainen";
		tokaOmena.lajike = "Ida Red";

		kolmasOmena.v�ri = "Keltainen";
		kolmasOmena.lajike = "Tuntematon";

		System.out.println(ekaOmena);
		System.out.println(tokaOmena);
		System.out.println(kolmasOmena);

	}

}
