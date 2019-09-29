package B_Demot.C_GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Rectangle;

public class ikkunaToisenKutsumana extends JFrame {
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblTietojenSytt;

	public ikkunaToisenKutsumana() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Tietojen sy\u00F6tt\u00F6");

		getContentPane().setLayout(null);

		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(15, 182, 115, 29);
		getContentPane().add(btnNewButton);

		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(159, 182, 115, 29);
		getContentPane().add(btnNewButton_1);

		textField = new JTextField();
		textField.setBounds(15, 49, 146, 26);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(15, 91, 146, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(15, 133, 146, 26);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		lblTietojenSytt = new JLabel("Tietojen sy\u00F6tt\u00F6");
		lblTietojenSytt.setFont(new Font("Trebuchet MS", Font.PLAIN, 24));
		lblTietojenSytt.setBounds(15, 0, 232, 44);
		getContentPane().add(lblTietojenSytt);
		setVisible(true);
		setSize(500, 300);
	}
	

	public JTextField getTextField() {
		return textField;
	}


	public void setTextField(JTextField textField) {
		this.textField = textField;
	}


	public static void main(String[] args) {

		ikkunaToisenKutsumana i = new ikkunaToisenKutsumana();
		i.setVisible(true);

	}

}
