import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class Sudoku {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JLabel lblResolucin;
	private JButton btnAutomtica;
	private JButton btnManual;
	private JLabel lblNewLabel;
	private JButton btnRestar;
	private JCheckBox chckbxMostarSombreado;
	private JButton btnNewButton;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JLabel lblSuroku;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sudoku window = new Sudoku();
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
	public Sudoku() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 0, 0));
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		panel.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		panel.add(textField_15);
		
		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		lblSuroku = new JLabel("SUROKU");
		panel_1.add(lblSuroku);
		
		panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(1, 2, 0, 0));
		
		rdbtnNewRadioButton = new JRadioButton("Redimensionar Si");
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Redimensionar No");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(rdbtnNewRadioButton_1);
		
		panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, BorderLayout.WEST);
		panel_3.setLayout(new GridLayout(3, 1, 0, 0));
		
		lblResolucin = new JLabel("Resoluci\u00F3n");
		lblResolucin.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblResolucin);
		
		btnAutomtica = new JButton("Autom\u00E1tica");
		panel_3.add(btnAutomtica);
		
		btnManual = new JButton("Manual");
		panel_3.add(btnManual);
		
		panel_4 = new JPanel();
		frame.getContentPane().add(panel_4, BorderLayout.EAST);
		panel_4.setLayout(new GridLayout(4, 1, 0, 0));
		
		lblNewLabel = new JLabel("Opciones");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel);
		
		btnRestar = new JButton("Reiniciar");
		panel_4.add(btnRestar);
		
		chckbxMostarSombreado = new JCheckBox("Mostar Sombreado");
		panel_4.add(chckbxMostarSombreado);
		
		btnNewButton = new JButton("Salir");
		panel_4.add(btnNewButton);
	}

}
