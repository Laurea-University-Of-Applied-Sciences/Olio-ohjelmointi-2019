public class PuunIstuttaja {

	public static void main(String[] args) {

		// Luodaan olio
		Omena ekaOmena = new Omena();
		Omena tokaOmena = new Omena();
		Omena kolmasOmena = new Omena();
		
		�t�kk� �1 = new �t�kk�();
		
		
		
		Omenapuu omaPuu = new Omenapuu();

		// Asetetaan arvot
		ekaOmena.v�ri = "vihre�";
		ekaOmena.lajike = "Valkeakuulas";

		tokaOmena.v�ri = "Punainen";
		tokaOmena.lajike = "Ida Red";

		kolmasOmena.v�ri = "Keltainen";
		kolmasOmena.lajike = "Tuntematon";
 
	
//		omaPuu.omenat[0] = ekaOmena;
//		omaPuu.omenat[1] = tokaOmena;
//		omaPuu.omenat[2] = kolmasOmena;
//		
		omaPuu.omenat.add( ekaOmena );
		
		omaPuu.�t�k�t[0] = �1;
		
		System.out.println( omaPuu );

	}
}
