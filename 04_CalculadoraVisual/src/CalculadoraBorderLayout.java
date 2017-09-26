import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraBorderLayout {

	private JFrame frame;
	private JTextField n1;
	private JTextField n2;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraBorderLayout window = new CalculadoraBorderLayout();
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
	public CalculadoraBorderLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 154);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JLabel lblNmero = new JLabel("N\u00FAmero 1:");
		panel_3.add(lblNmero);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		n1 = new JTextField();
		panel_2.add(n1);
		n1.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JLabel lblNmero_1 = new JLabel("N\u00FAmero 2:");
		panel_1.add(lblNmero_1);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		
		n2 = new JTextField();
		panel_4.add(n2);
		n2.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		frame.getContentPane().add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));
		
		JPanel panel_9 = new JPanel();
		panel_5.add(panel_9);
		
		JButton suma = new JButton("+");
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int total=0;
				if(Integer.parseInt(n1.getText())>0 && Integer.parseInt(n2.getText())>0 && n1.getText().length()>0 && n2.getText().length()>0) {
					total=Integer.parseInt(n1.getText())+Integer.parseInt(n2.getText());
					resultado.setText(String.valueOf(total));
				}
				if(Integer.parseInt(n1.getText())<0 && Integer.parseInt(n2.getText())<0 && n1.getText().length()<0 && n2.getText().length()<0) {
					JOptionPane.showMessageDialog(null,"Error","Error",JOptionPane.ERROR_MESSAGE);
				}	
			}
		});
		panel_9.add(suma);
		
		JPanel panel_8 = new JPanel();
		panel_5.add(panel_8);
		
		JButton resta = new JButton("-");
		panel_8.add(resta);
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6);
		
		JButton mult = new JButton("*");
		panel_6.add(mult);
		
		JPanel panel_7 = new JPanel();
		panel_5.add(panel_7);
		
		JButton div = new JButton("/");
		panel_7.add(div);
		
		JPanel panel_10 = new JPanel();
		frame.getContentPane().add(panel_10, BorderLayout.SOUTH);
		
		JPanel panel_11 = new JPanel();
		panel_10.add(panel_11);
		
		JLabel lblResultado = new JLabel("Resultado");
		panel_11.add(lblResultado);
		
		JPanel panel_12 = new JPanel();
		panel_10.add(panel_12);
		
		resultado = new JTextField();
		resultado.setEditable(false);
		panel_12.add(resultado);
		resultado.setColumns(10);
	}
}
