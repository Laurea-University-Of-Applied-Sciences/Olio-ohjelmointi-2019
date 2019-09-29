package B_Demot.C_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestClass {
	JTextField textField;
	JFrame mainFrame;
	TestClass parent;

	public TestClass() {
		// a bit awkward looking, but this allows passing a reference to the
		// TestClass object to the JDialog constructed inside the anonymous
		// inner class that is the button's action listener
		this.parent = this;
		mainFrame = new JFrame("Main Frame");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);

		textField = new JTextField(10);
		textField.setText("Data from JDialog");
		JButton button = new JButton("Get Data");

		// an alternative way (preferred by some) to add an
		// action listener to a component. using the anonymous
		// inner class creates new complications, all manageable
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BuildDialog(parent);
			}
		});

		mainFrame.setLayout(new FlowLayout());
		mainFrame.add(textField);
		mainFrame.add(button);

		mainFrame.pack();
		mainFrame.setVisible(true);
	}

	public void setData(String data) {
		textField.setText(data);
	}

	public static void main(String[] args) {
		// begins the swing ap on the Event Dispatch Thread (EDT)
		// i promise all of my Swing examples will be started this way
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new TestClass();
			}
		});

	} // end method main()

} // end class TestClass

class BuildDialog extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JPanel bPanel;
	private JLabel label1;
	private JTextField input1;
	private JButton button1;

	// an instance variable to the parent class
	private TestClass parent;

	private String num1;

	// constructor BuildDialog() takes an argument that is a reference to the
	// parent class so that the parent's getters and setters can be used
	public BuildDialog(TestClass parent) {
		super();
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.parent = parent;

		bPanel = new JPanel();
		label1 = new JLabel("Input A: ");
		input1 = new JTextField("0", 3);
		button1 = new JButton("Add");

		num1 = "0";

		bPanel.add(label1);
		bPanel.add(input1);
		bPanel.add(button1);

		button1.addActionListener(this);

		add(bPanel);
		setSize(new Dimension(200, 200));
		setVisible(true);

	} // end construction BuildDialog()

	// method actionPerformed() determines the source of the event and if the
	// source was button1, obtains the value from the text field and passes
	// it to the parent using the parent's method setData()
	public void actionPerformed(ActionEvent e) {
		Object object = e.getSource();

		if (object.equals(button1)) {
			num1 = input1.getText();
			parent.setData(num1);

			// i removed the dispose so that multiple demonstrations could be
			// shown. it works the same with it uncommented, but just once
			// dispose();
		}

	} // end method actionPerformed()

	// method getNum1() passes num1 to callers
	public String getNum1() {
		return num1;
	}

} // end class BuildDialog