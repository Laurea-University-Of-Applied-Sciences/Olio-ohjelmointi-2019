package Sarjallistamista;

import java.util.*;

public class Sanakirja {
	private static Scanner lukija = new Scanner(System.in);

	public static void main(String[] args) {

		String[] suomi = { "kissa", "koira", "hevonen", "auto", "vene" };
		String[] englanti = { "cat", "dog", "horse", "car", "boat" };

		HashMap<String, String> sanakirja = new HashMap<String, String>();
		String sana1, sana2;

		for (int i = 0; i < suomi.length; i++) {

			sanakirja.put(suomi[i], englanti[i]);

		}

		do {
			System.out.print("Sana alkukielellä? (tyhjä lopettaa) ");
			sana1 = lukija.nextLine();
			if (sana1.equals(""))
				break;

			if (sanakirja.containsKey(sana1)) {
				System.out.println("Sana \"" + sana1 + "\" löytyy jo!");
				System.out.println("Vanha käännös " + "\"" + sanakirja.get(sana1) + "\" jää voimaan!");
				continue; // uusi alkukielinen sana
			}

			System.out.print("Sana käännettynä?  (tyhjä lopettaa) ");
			sana2 = lukija.nextLine();
			if (sana2.equals(""))
				break; // syöttö loppui!

			// nyt molemmat sanat ovat ei-tyhjiä ja ensimmäinen on uusi

			sanakirja.put(sana1, sana2);

		} while (true); // loppuu jomman kumman sanan ollessa ""

		System.out.println(sanakirja);

		do {
			System.out.print("Minkä sanan käännöksen haluat tietää? " + "(tyhjä sana lopettaa) ");
			sana1 = lukija.nextLine();
			if (sana1.equals(""))
				break; // kysely loppui!

			if (!sanakirja.containsKey(sana1))
				System.out.println("Sanan \"" + sana1 + "\" käännös on tuntematon!");
			else
				System.out.println("Sanan \"" + sana1 + "\" käännös on \"" + sanakirja.get(sana1) + "\"");

		} while (true); // loppuu tyhjään sanaan
	}
}