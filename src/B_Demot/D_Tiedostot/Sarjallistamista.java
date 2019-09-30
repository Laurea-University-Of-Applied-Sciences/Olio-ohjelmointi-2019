import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Sarjallistamista {

	public static void main(String[] args) throws IOException {

		// Olion kirjoittamista varten
		FileOutputStream tiedosto = new FileOutputStream("c://temp/Kala.oma");
		ObjectOutputStream olionKirjoittaja = new ObjectOutputStream(tiedosto);

		

		// XML:n kirjoittamista varten
		
		FileOutputStream tiedosto2 = new FileOutputStream("c://temp/Kala.xml");
		XMLEncoder enc = new XMLEncoder(new BufferedOutputStream(tiedosto2));

		Kala[] taulu = new Kala[10];

		Kala k = new Kala();
		k.setLaji("Taimen");
		k.setPaino(10);

		taulu[0] = k;

		// Kirjoitetaan olio tiedostoon
		olionKirjoittaja.writeObject(taulu);
		// Kirjoitetaan olio XML-muotoiseen tiedostoon
		enc.writeObject(taulu);
		
		// Lopputoimet tiedostoille
		enc.close();
		olionKirjoittaja.flush();
		tiedosto.close();

	}

}
