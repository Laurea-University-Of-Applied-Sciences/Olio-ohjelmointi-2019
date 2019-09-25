package B_Demot.C_GUI;

import java.awt.Color;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseMotionAdapter;

public class SwingPaintDemo3 {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

	private static void createAndShowGUI() {
		System.out.println("Created GUI on EDT? ");
		JFrame f = new JFrame("Swing Paint Demo");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.add(new MyPanel());
		f.pack();
		f.setVisible(true);
	}
}

class MyPanel extends JPanel {

	private int squareX = 50;
	private int squareY = 50;
	private int squareW = 20;
	private int squareH = 20;

	public MyPanel() {

		setBorder(BorderFactory.createLineBorder(Color.black));
		setFocusable(true);
		requestFocusInWindow();

		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				moveSquare(e.getX(), e.getY());
			}
		});

		addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) {
				moveSquare(e.getX(), e.getY());
			}
		});

		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			public void keyPressed(KeyEvent e) {
				int painettu = e.getKeyCode();

				if (painettu == KeyEvent.VK_UP)
					moveSquare(squareX, squareY - 10);
				else if (painettu == KeyEvent.VK_DOWN)
					moveSquare(squareX, squareY + 10);

				else if (painettu == KeyEvent.VK_LEFT)
					moveSquare(squareX - 10, squareY);

				else if (painettu == KeyEvent.VK_RIGHT)
					moveSquare(squareX + 10, squareY);

				System.out.println("Painoit nappia: "+painettu);
				System.out.println("X: " + squareX + "Y: " + squareY);
			}
		});

	}

	private void moveSquare(int x, int y) {
		int OFFSET = 1;
		if ((squareX != x) || (squareY != y)) {
			repaint(squareX, squareY, squareW + OFFSET, squareH + OFFSET);
			squareX = x;
			squareY = y;
			repaint(squareX, squareY, squareW + OFFSET, squareH + OFFSET);
		}
	}

	public Dimension getPreferredSize() {
		return new Dimension(250, 200);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("This is my custom Panel!", 10, 20);
		g.setColor(Color.RED);
		g.fillRect(squareX, squareY, squareW, squareH);
		g.setColor(Color.BLACK);
		g.drawRect(squareX, squareY, squareW, squareH);
	}
}