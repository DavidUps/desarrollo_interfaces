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
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Sudoku {

	private JFrame frame;
	private JTextField pos_1;
	private JTextField pos_2;
	private JTextField pos_3;
	private JTextField pos_4;
	private JTextField pos_5;
	private JTextField pos_6;
	private JTextField pos_7;
	private JTextField pos_8;
	private JTextField pos_9;
	private JTextField pos_10;
	private JTextField pos_11;
	private JTextField pos_12;
	private JTextField pos_13;
	private JTextField pos_14;
	private JTextField pos_15;
	private JTextField pos_16;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JLabel lblResolucin;
	private JButton btnAutomtica;
	private JButton btnManual;
	private JLabel lblNewLabel;
	private JButton btnRestar;
	private JCheckBox sombreado;
	private JButton btnNewButton;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JLabel lblSuroku;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 0, 0));
		
		pos_1 = new JTextField();
		pos_1.setBackground(Color.WHITE);
		pos_1.setHorizontalAlignment(SwingConstants.CENTER);
		pos_1.setText("2");
		pos_1.setSelectedTextColor(Color.LIGHT_GRAY);
		pos_1.setForeground(Color.BLACK);
		panel.add(pos_1);
		pos_1.setColumns(10);
		
		pos_2 = new JTextField();
		pos_2.setHorizontalAlignment(SwingConstants.CENTER);
		pos_2.setColumns(10);
		panel.add(pos_2);
		
		pos_3 = new JTextField();
		pos_3.setHorizontalAlignment(SwingConstants.CENTER);
		pos_3.setColumns(10);
		panel.add(pos_3);
		
		pos_4 = new JTextField();
		pos_4.setHorizontalAlignment(SwingConstants.CENTER);
		pos_4.setColumns(10);
		panel.add(pos_4);
		
		pos_5 = new JTextField();
		pos_5.setHorizontalAlignment(SwingConstants.CENTER);
		pos_5.setColumns(10);
		panel.add(pos_5);
		
		pos_6 = new JTextField();
		pos_6.setText("3");
		pos_6.setHorizontalAlignment(SwingConstants.CENTER);
		pos_6.setColumns(10);
		panel.add(pos_6);
		
		pos_7 = new JTextField();
		pos_7.setHorizontalAlignment(SwingConstants.CENTER);
		pos_7.setColumns(10);
		panel.add(pos_7);
		
		pos_8 = new JTextField();
		pos_8.setText("4");
		pos_8.setHorizontalAlignment(SwingConstants.CENTER);
		pos_8.setColumns(10);
		panel.add(pos_8);
		
		pos_9 = new JTextField();
		pos_9.setHorizontalAlignment(SwingConstants.CENTER);
		pos_9.setText("3");
		pos_9.setColumns(10);
		panel.add(pos_9);
		
		pos_10 = new JTextField();
		pos_10.setHorizontalAlignment(SwingConstants.CENTER);
		pos_10.setColumns(10);
		panel.add(pos_10);
		
		pos_11 = new JTextField();
		pos_11.setHorizontalAlignment(SwingConstants.CENTER);
		pos_11.setColumns(10);
		panel.add(pos_11);
		
		pos_12 = new JTextField();
		pos_12.setHorizontalAlignment(SwingConstants.CENTER);
		pos_12.setText("1");
		pos_12.setColumns(10);
		panel.add(pos_12);
		
		pos_13 = new JTextField();
		pos_13.setHorizontalAlignment(SwingConstants.CENTER);
		pos_13.setText("4");
		pos_13.setColumns(10);
		panel.add(pos_13);
		
		pos_14 = new JTextField();
		pos_14.setHorizontalAlignment(SwingConstants.CENTER);
		pos_14.setColumns(10);
		panel.add(pos_14);
		
		pos_15 = new JTextField();
		pos_15.setHorizontalAlignment(SwingConstants.CENTER);
		pos_15.setText("3");
		panel.add(pos_15);
		pos_15.setColumns(10);
		
		pos_16 = new JTextField();
		pos_16.setHorizontalAlignment(SwingConstants.CENTER);
		pos_16.setColumns(10);
		panel.add(pos_16);
		
		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		lblSuroku = new JLabel("SUROKU");
		panel_1.add(lblSuroku);
		
		panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(1, 2, 0, 0));
		
		rdbtnNewRadioButton = new JRadioButton("Redimensionar Si");
		
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Redimensionar No");
		
		buttonGroup.add(rdbtnNewRadioButton_1);
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
		
		
		sombreado = new JCheckBox("Mostar Sombreado");
		
		
		btnNewButton = new JButton("Salir");
		
		
		//SOMBREADO
		
		sombreado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(sombreado.isSelected()) {
					pos_1.setBackground(Color.LIGHT_GRAY);
					pos_6.setBackground(Color.LIGHT_GRAY);
					pos_8.setBackground(Color.LIGHT_GRAY);
					pos_9.setBackground(Color.LIGHT_GRAY);
					pos_12.setBackground(Color.LIGHT_GRAY);
					pos_13.setBackground(Color.LIGHT_GRAY);
					pos_15.setBackground(Color.LIGHT_GRAY);
				}else {
					pos_1.setBackground(Color.white);
					pos_6.setBackground(Color.white);
					pos_8.setBackground(Color.white);
					pos_9.setBackground(Color.white);
					pos_12.setBackground(Color.white);
					pos_13.setBackground(Color.white);
					pos_15.setBackground(Color.white);
				}
			}
		});
		
		btnRestar = new JButton("Reiniciar");
		
		//REINICIAR
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pos_2.setText("");
				pos_3.setText("");
				pos_4.setText("");
				pos_5.setText("");
				pos_7.setText("");
				pos_10.setText("");
				pos_11.setText("");
				pos_14.setText("");
				pos_16.setText("");
			}
		});
		panel_4.add(btnRestar);
		panel_4.add(sombreado);
		
		//REDIMENSIONAR
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected())
					frame.setResizable(true);
			}
		});
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1.isSelected())
					frame.setResizable(false);
			}
		});
		
		//SALIR
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panel_4.add(btnNewButton);
	}

}
