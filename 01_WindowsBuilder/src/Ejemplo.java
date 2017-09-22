import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejemplo {

	private JFrame frame;
	private JTextField txtSoyUnJtextfield;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo window = new Ejemplo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejemplo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 478, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSoyUnJLABEL = new JLabel("SOY UN JLABEL");
		lblSoyUnJLABEL.setBounds(85, 76, 76, 14);
		frame.getContentPane().add(lblSoyUnJLABEL);
		
		JButton btnNewButton = new JButton("SOY UN JBUTON");
		btnNewButton.setBounds(171, 72, 111, 23);
		frame.getContentPane().add(btnNewButton);
		
		txtSoyUnJtextfield = new JTextField();
		txtSoyUnJtextfield.setText("SOY UN JTEXTFIELD");
		txtSoyUnJtextfield.setBounds(161, 101, 111, 20);
		frame.getContentPane().add(txtSoyUnJtextfield);
		txtSoyUnJtextfield.setColumns(10);
		
		JRadioButton rdbtnSoyUnJradiobutton = new JRadioButton("SOY UN JRADIOBUTTON");
		buttonGroup.add(rdbtnSoyUnJradiobutton);
		rdbtnSoyUnJradiobutton.setBounds(161, 128, 174, 23);
		frame.getContentPane().add(rdbtnSoyUnJradiobutton);
		
		JCheckBox chckbxSoyUnCheckbox = new JCheckBox("SOY UN CHECKBOX");
		chckbxSoyUnCheckbox.setBounds(161, 179, 140, 23);
		frame.getContentPane().add(chckbxSoyUnCheckbox);
		
		JRadioButton rdbtnSoyUnJradiobutton_1 = new JRadioButton("SOY UN JRADIOBUTTON 2");
		buttonGroup.add(rdbtnSoyUnJradiobutton_1);
		rdbtnSoyUnJradiobutton_1.setBounds(161, 153, 174, 23);
		frame.getContentPane().add(rdbtnSoyUnJradiobutton_1);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnAceptar.setBounds(363, 306, 89, 23);
		frame.getContentPane().add(btnAceptar);
	}
}
