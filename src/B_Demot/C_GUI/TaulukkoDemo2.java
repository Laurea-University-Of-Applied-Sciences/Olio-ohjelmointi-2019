import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TaulukkoDemo2 {

	public static void main(String[] args) {

		String[] sarakkeet = { "Merkki", "V‰ri", "Rekisterinumero", "Vuosimalli" };

		ArrayList<String[]> rowData2 = new ArrayList<String[]>();

		String[][] rowData = { { "Toyota", "Punainen", "ABC-123", "1999" }, { "Ford", "Sininen", "BCD-456", "2018" },
				{ "Ford", "Sininen", "BCD-456", "2018" }, { "Ford", "Sininen", "BCD-456", "2018" },
				{ "Ford", "Sininen", "BCD-456", "2018" }, { "Ford", "Sininen", "BCD-456", "2018" },
				{ "Ford", "Sininen", "BCD-456", "2018" }, { "Ford", "Sininen", "BCD-456", "2018" },

		};
		
		// Lis‰t‰‰n datat arraylistiin

		for (int i = 0; i < rowData.length; i++) {
			//System.out.println(rowData[i]);
			rowData2.add(rowData[i]);
		}

		System.out.println(rowData2.toArray());

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
