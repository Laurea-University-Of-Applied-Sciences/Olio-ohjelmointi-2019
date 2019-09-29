package B_Demot.C_GUI;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Dimension;

public class uusiPaneeli extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JFormattedTextField formattedTextField;
	private JFormattedTextField formattedTextField_1;
	private JLabel lblSytTietoja;

	/**
	 * Create the panel.
	 */
	public uusiPaneeli() {
		setMinimumSize(new Dimension(400, 400));
		setBorder(new CompoundBorder(new CompoundBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Test", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0))), null));
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		textField = new JTextField();
		textField.setText("");
		textField.setBounds(31, 59, 146, 26);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(31, 101, 146, 26);
		add(textField_1);
		textField_1.setColumns(10);
		
		formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(31, 143, 146, 26);
		add(formattedTextField);
		
		formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(31, 188, 146, 26);
		add(formattedTextField_1);
		
		lblSytTietoja = new JLabel("Sy\u00F6t\u00E4 tietoja");
		lblSytTietoja.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSytTietoja.setBounds(31, 30, 171, 20);
		add(lblSytTietoja);

	}
}
