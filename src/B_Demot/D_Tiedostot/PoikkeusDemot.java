import java.util.Scanner;
import java.io.*;

public class PoikkeusDemot {

	public static void main(String[] args) {

		// Esitellään Scanner-olio sekä tiedosto, joka tullaan lukemaan
		Scanner lukija = null;
		File tiedosto = new File("c://temp//gradu.txt");

		// Luetaan tiedostoa skannerin avulla rivi kerrallaan
		// Varaudutaan poikkeuksiin try-catch -rakenteella

		try {
			lukija = new Scanner(tiedosto);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Tiedostoa ei löydy..");
			e.printStackTrace();
		}

		while (lukija.hasNextLine()) {
			String rivi = lukija.nextLine();
			rivi = rivi.replace("gradu", "oppari");
			System.out.println(rivi);
		}

//		int[] taulu = new int[10];
//
//		try {
//			for (int i = 0; i <= 10; i++) {
//				System.out.println(i + ": " + taulu[i]);
//
//			}
//		
//		 catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Taulukon indeksi ylittyi!");
//		} catch (ArithmeticException e) {
//			System.out.println("Laskutoimiksessa tapahtui virhe!");
//		}
//		catch (Exception e) {
//			System.out.println("Ohjelman suorituksessa tapahtui virhe. Soita ServiceDeskiin!");
//		}
//		 finally {
//			System.out.println("Lopputoimet ohjelman päättyessä!");
//		}
//
	}

}
