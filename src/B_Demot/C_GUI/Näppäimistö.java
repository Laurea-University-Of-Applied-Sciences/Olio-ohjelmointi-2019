package B_Demot.C_GUI;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

public class N�pp�imist� extends JFrame implements KeyListener {
	JPanel panel;

	public static void main(String[] args) {
		N�pp�imist� ikkuna = new N�pp�imist�();
		ikkuna.setVisible(true);

	}

	public N�pp�imist�() {
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.addKeyListener(this);
		this.setFocusable(true);

		panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		this.requestFocusInWindow();

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			System.out.println("OK");
			panel.setBackground(Color.BLACK);
			

		}
		System.out.print(e.getKeyChar() + " --> ");
		System.out.println(e.getKeyCode());
		panel.setBackground(Color.WHITE);
				

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}