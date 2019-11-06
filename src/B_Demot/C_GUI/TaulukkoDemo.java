import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TaulukkoDemo {

	public static void main(String[] args) {

		String[] sarakkeet = { "Merkki", "Väri", "Rekisterinumero", "Vuosimalli" };

		String[][] rowData = { 
				{ "Toyota", "Punainen", "ABC-123", "1999" }, 
				{ "Ford", "Sininen", "BCD-456", "2018" },
				{ "Ford", "Sininen", "BCD-456", "2018" },
				{ "Ford", "Sininen", "BCD-456", "2018" },
				{ "Ford", "Sininen", "BCD-456", "2018" },
				{ "Ford", "Sininen", "BCD-456", "2018" },
				{ "Ford", "Sininen", "BCD-456", "2018" },
				{ "Ford", "Sininen", "BCD-456", "2018" },

		};

		// Luodaan JTable
		DefaultTableModel model = new DefaultTableModel();
		JTable table = new JTable(rowData, sarakkeet);
		
		
		// Luodaan Scrollpane taulukolle
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		 
		 

		// Luodaan JFrame
		JFrame ikkuna = new JFrame();
		ikkuna.getContentPane().add(table);
		ikkuna.getContentPane().add(table.getTableHeader(), BorderLayout.PAGE_START);
		 

		ikkuna.setSize(500, 200);
		ikkuna.setVisible(true);

	}

}
