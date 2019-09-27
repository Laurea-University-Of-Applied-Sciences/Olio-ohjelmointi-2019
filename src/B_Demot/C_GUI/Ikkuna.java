import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Ikkuna extends JFrame {

	private JPanel contentPane;
	JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ikkuna frame = new Ikkuna();
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
	public Ikkuna() {
		setTitle("Uusi ikkuna");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 424, 21);
		contentPane.add(menuBar);

		JMenu mnTiedosto = new JMenu("Tiedosto");
		menuBar.add(mnTiedosto);

		JMenuItem mntmAvaa = new JMenuItem("Avaa");
		mntmAvaa.setIcon(new ImageIcon(Ikkuna.class.getResource("/javax/swing/plaf/metal/icons/ocean/newFolder.gif")));
		mnTiedosto.add(mntmAvaa);

		JMenuItem mntmTallenna = new JMenuItem("Tallenna");
		mnTiedosto.add(mntmTallenna);

		JMenuItem mntmLopeta = new JMenuItem("Lopeta");
		mnTiedosto.add(mntmLopeta);

		JMenu mnMuokkaa = new JMenu("Muokkaa");
		menuBar.add(mnMuokkaa);

		JMenuItem mntmValitseKaikki = new JMenuItem("Valitse kaikki");
		mnMuokkaa.add(mntmValitseKaikki);

		JMenuItem mntmEtsi = new JMenuItem("Etsi");
		mnMuokkaa.add(mntmEtsi);

		JMenuItem mntmKorvaa = new JMenuItem("Korvaa");
		mnMuokkaa.add(mntmKorvaa);

		JPanel panel = new JPanel();
		panel.setBounds(10, 25, 204, 38);
		contentPane.add(panel);

		JButton btnEkaNappi = new JButton("Eka nappi");
		btnEkaNappi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Hoi Maailma!");

			}
		});
		panel.add(btnEkaNappi);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(221, 25, 213, 38);
		contentPane.add(panel_1);

		JButton btnTokaNappi = new JButton("Toka nappi");
		panel_1.add(btnTokaNappi);
		btnTokaNappi.setHorizontalAlignment(SwingConstants.RIGHT);
		btnTokaNappi
				.setIcon(new ImageIcon(Ikkuna.class.getResource("/javax/swing/plaf/metal/icons/ocean/question.png")));

		btnTokaNappi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Painoit nappia " + e.getActionCommand());
			}
		});

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 74, 414, 38);
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnKolmasNappi = new JButton("Kolmas nappi");
		btnKolmasNappi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// System.out.println("Hoi Maailma!");
				String viesti = textArea.getText();
				System.out.println(viesti);
			}
		});
		panel_2.add(btnKolmasNappi);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 120, 414, 130);
		contentPane.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		textArea = new JTextArea();
		textArea.setLineWrap(true);
		panel_3.add(textArea, BorderLayout.CENTER);
	}
}
