import java.net.*;
import java.util.Scanner;
import java.io.*;

public class ReadFileAndURL {
	public static void main(String[] args) {

		// Tässä virheet on heitetty kutsujan käsiteltäväksi
		// readFromWeb();

		// Tässä virheet on käsitelty metodin sisällä
		readFromFile();
	}

	public static void readFromWeb() throws Exception {
		URL url = new URL("http://www.gutenberg.org/cache/epub/10481/pg10481.txt");
		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
		String i;
		while ((i = read.readLine()) != null)
			System.out.println(i);
		read.close();
	}

	public static void readFromFile() {
		// Esitellään Scanner-olio sekä tiedosto, joka tullaan lukemaan
		Scanner lukija = null;
		File tiedosto = new File("c://temp//gradu.txt");

		// Luetaan tiedostoa skannerin avulla rivi kerrallaan
		// Varaudutaan poikkeuksiin try-catch -rakenteella

		try {
			lukija = new Scanner(tiedosto, "UTF-8");

			while (lukija.hasNextLine()) {
				String rivi = lukija.nextLine();
				System.out.println(rivi);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Tiedostoa ei löydy..");
			e.printStackTrace();
		}

	}
}
