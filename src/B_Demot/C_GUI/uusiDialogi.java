package B_Demot.C_GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class uusiDialogi extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private Ikkuna2 parent;
	private JLabel lblNimi;
	private JLabel lblOsoite;
	private JLabel lblPuhelin;
	private JTextField lblThnIkkunaanKirjoitetut;
	private JTextField txtTiedotPalautuvatKutsuvaan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			uusiDialogi dialog = new uusiDialogi(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public uusiDialogi(Ikkuna2 parent) {
		setTitle("Tietoa ikkunoiden v\u00E4lill\u00E4");
		this.parent = parent;

		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 428, 206);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			textField = new JTextField();
			textField.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent arg0) {
					parent.setData("Luetaan muutoksen laukaisemana: " + textField.getText());
				}
			});
		 
			textField.setBounds(15, 40, 146, 26);
			contentPanel.add(textField);
			textField.setColumns(10);

		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(15, 92, 146, 26);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(15, 148, 146, 26);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		
		this.lblNimi = new JLabel("Nimi");
		this.lblNimi.setBounds(15, 16, 69, 20);
		contentPanel.add(this.lblNimi);
		
		this.lblOsoite = new JLabel("Osoite");
		this.lblOsoite.setBounds(15, 74, 69, 20);
		contentPanel.add(this.lblOsoite);
		
		this.lblPuhelin = new JLabel("Puhelin");
		this.lblPuhelin.setBounds(15, 127, 69, 20);
		contentPanel.add(this.lblPuhelin);
		
		this.lblThnIkkunaanKirjoitetut = new JTextField("T\u00E4h\u00E4n ikkunaan kirjoitetut");
		this.lblThnIkkunaanKirjoitetut.setAutoscrolls(true);
		this.lblThnIkkunaanKirjoitetut.setBounds(176, 40, 225, 48);
		contentPanel.add(this.lblThnIkkunaanKirjoitetut);
		
		this.txtTiedotPalautuvatKutsuvaan = new JTextField("tiedot palautuvat kutsuvaan JFrameen");
		this.txtTiedotPalautuvatKutsuvaan.setAutoscrolls(true);
		this.txtTiedotPalautuvatKutsuvaan.setBounds(175, 92, 226, 48);
		contentPanel.add(this.txtTiedotPalautuvatKutsuvaan);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 206, 428, 39);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						parent.setData(textField.getText());
						parent.setData(textField_1.getText());
						parent.setData(textField_2.getText());
						System.out.println(textField.getText());
						
						

					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}
}
