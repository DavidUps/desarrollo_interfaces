import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CalculadoraFlowLayout {

	private JFrame frmCalculadora;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraFlowLayout window = new CalculadoraFlowLayout();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculadoraFlowLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setResizable(false);
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 429, 128);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNumero = new JLabel("N\u00FAmero 1:");
		frmCalculadora.getContentPane().add(lblNumero);
		
		textField = new JTextField();
		frmCalculadora.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNmerp = new JLabel("N\u00FAmero 2:");
		frmCalculadora.getContentPane().add(lblNmerp);
		
		textField_1 = new JTextField();
		frmCalculadora.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Resultado:");
		frmCalculadora.getContentPane().add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		frmCalculadora.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton button = new JButton("+");
		frmCalculadora.getContentPane().add(button);
		
		JButton button_1 = new JButton("-");
		frmCalculadora.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("*");
		frmCalculadora.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("/");
		frmCalculadora.getContentPane().add(button_3);
	}

}
