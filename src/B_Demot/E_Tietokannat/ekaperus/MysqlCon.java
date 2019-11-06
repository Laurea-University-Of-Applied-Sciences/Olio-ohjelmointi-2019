import java.sql.*;

public class MysqlCon {
	public static void main(String args[]) {

		// Varaudutaan poikkeuksiin; esim. jos tietokantaan ei saada yhteytt‰
		try {
			// M‰‰ritell‰‰n tietokannan yhteysosoite sek‰ tietokannan nimi
			String URL = "jdbc:mysql://localhost:8082/8rdc7qjrlq";
			// M‰‰ritell‰‰n k‰ytt‰j‰tiedot yhteyden luomista varten
			String USERID = "root";
			String PASSWORD = "";

			// Luodaan yhteys k‰ytt‰en edell‰nmainittuja tietoja
			Connection con = DriverManager.getConnection(URL, USERID, PASSWORD);

			System.out.println("Yhteys tietokantaan on luotu.");

			// T‰ss‰ kohtaa voitaisiin alkaa luomaan kyselyit‰

			// Suoritetaan kysely ja otetaan tulokset talteen
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM KIRJAT");

			// Tulosjoukko on taulukko-tyyppinen rakenne, joka
			// voidaan k‰yd‰ l‰pi esim. while silmukalla

			while (rs.next()) {
				System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
			}
			// Tulostetaan myˆs palautuneiden rivien m‰‰r‰ (hieman hankalasti)
			// hypp‰‰m‰ll‰ viimeiselle tulosriville ja tulostamalla sen indeksi
			rs.last();
			System.out.println("Tuloksia palautui: " + rs.getRow() + " rivi‰.");

			// Suljetaan yhteys
			con.close();

		} catch (SQLException e) {
			System.out.println("Virhe tietokannan k‰ytˆss‰!");
			System.out.println(e);
		} // catch
	} // main
} // class