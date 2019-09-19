public class PuunIstuttaja {

	public static void main(String[] args) {

		// Luodaan olio
		Omena ekaOmena = new Omena();
		Omena tokaOmena = new Omena();
		Omena kolmasOmena = new Omena();
		
		Ötökkä ö1 = new Ötökkä();
		
		
		
		Omenapuu omaPuu = new Omenapuu();

		// Asetetaan arvot
		ekaOmena.väri = "vihreä";
		ekaOmena.lajike = "Valkeakuulas";

		tokaOmena.väri = "Punainen";
		tokaOmena.lajike = "Ida Red";

		kolmasOmena.väri = "Keltainen";
		kolmasOmena.lajike = "Tuntematon";
 
	
//		omaPuu.omenat[0] = ekaOmena;
//		omaPuu.omenat[1] = tokaOmena;
//		omaPuu.omenat[2] = kolmasOmena;
//		
		omaPuu.omenat.add( ekaOmena );
		
		omaPuu.ötökät[0] = ö1;
		
		System.out.println( omaPuu );

	}
}
