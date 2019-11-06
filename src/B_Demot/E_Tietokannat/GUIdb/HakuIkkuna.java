import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class HakuIkkuna extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HakuIkkuna frame = new HakuIkkuna();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HakuIkkuna() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(121, 77, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblHakuehto = new JLabel("ISBN");
		lblHakuehto.setBounds(21, 80, 46, 14);
		contentPane.add(lblHakuehto);
		
		JLabel lblJulkaisuvuosi = new JLabel("Tekij\u00E4");
		lblJulkaisuvuosi.setBounds(21, 108, 73, 14);
		contentPane.add(lblJulkaisuvuosi);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(121, 108, 86, 20);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Tallenna");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String tekija = textField_1.getText();
				
				String SQL = "SELECT * FROM KIRJAT WHERE TEKIJANNIMI LIKE '"+tekija+ "';";
				
				hae( SQL );
				
				
			}
		});
		btnNewButton.setBounds(22, 172, 185, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNimi = new JLabel("Nimi");
		lblNimi.setBounds(21, 51, 46, 14);
		contentPane.add(lblNimi);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(121, 48, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(121, 139, 86, 20);
		contentPane.add(textField_3);
		
		JLabel label = new JLabel("Julkaisuvuosi");
		label.setBounds(21, 142, 73, 14);
		contentPane.add(label);
	}
	
	public static void hae( String SQL) {

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
			ResultSet rs = stmt.executeQuery(SQL);

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
	
}
