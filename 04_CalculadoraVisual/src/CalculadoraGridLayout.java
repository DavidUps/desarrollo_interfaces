import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class CalculadoraGridLayout {

	private JFrame frame;
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
					CalculadoraGridLayout window = new CalculadoraGridLayout();
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
	public CalculadoraGridLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 10, 0, 0));
		
		JLabel lblNmero = new JLabel("N\u00FAmero 1:");
		frame.getContentPane().add(lblNmero);
		
		textField = new JTextField();
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNmero_1 = new JLabel("N\u00FAmero 2:");
		frame.getContentPane().add(lblNmero_1);
		
		textField_1 = new JTextField();
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("+");
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("-");
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("*");
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("/");
		frame.getContentPane().add(button_3);
		
		JLabel lblResultado = new JLabel("Resultado");
		frame.getContentPane().add(lblResultado);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}

}
