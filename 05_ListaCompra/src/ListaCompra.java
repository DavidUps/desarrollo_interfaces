import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ListaCompra {

	private JFrame frmListaDeLa;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private double total = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaCompra window = new ListaCompra();
					window.frmListaDeLa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ListaCompra() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListaDeLa = new JFrame();
		
		frmListaDeLa.setResizable(false);
		frmListaDeLa.setTitle("Lista de la compra");
		frmListaDeLa.setBounds(100, 100, 550, 310);
		frmListaDeLa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmListaDeLa.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Identificaci\u00F3n del usuario");
		lblNewLabel.setBounds(10, 11, 174, 14);
		frmListaDeLa.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(194, 8, 130, 20);
		frmListaDeLa.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTotalAPagar = new JLabel("Total a pagar(\u20AC)");
		lblTotalAPagar.setBounds(334, 11, 86, 14);
		frmListaDeLa.getContentPane().add(lblTotalAPagar);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(430, 8, 86, 20);
		frmListaDeLa.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblProducto = new JLabel("Producto:");
		lblProducto.setBounds(10, 48, 67, 14);
		frmListaDeLa.getContentPane().add(lblProducto);
		
		textField_2 = new JTextField();
		
		textField_2.setBounds(69, 45, 121, 20);
		frmListaDeLa.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCantidadYPreciounidad = new JLabel("Cantidad y precio/unidad");
		lblCantidadYPreciounidad.setBounds(194, 48, 149, 14);
		frmListaDeLa.getContentPane().add(lblCantidadYPreciounidad);
		
		textField_3 = new JTextField();
		textField_3.setBounds(395, 45, 121, 20);
		frmListaDeLa.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox.setBounds(344, 45, 41, 20);
		frmListaDeLa.getContentPane().add(comboBox);
		
		textField_4 = new JTextField();
		textField_4.setBorder(new LineBorder(new Color(171, 173, 179)));
		textField_4.setBounds(10, 105, 336, 148);
		frmListaDeLa.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnAadirProductoCreado = new JButton("A\u00F1adir producto creado");
		
		
		btnAadirProductoCreado.setBounds(356, 137, 178, 23);
		frmListaDeLa.getContentPane().add(btnAadirProductoCreado);
		
		JButton btnNewButton = new JButton("Finalizar compra");
		
		btnNewButton.setBounds(356, 217, 178, 23);
		frmListaDeLa.getContentPane().add(btnNewButton);
		
		//EVENTOS FINALIZAR COMPRA
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "hasta luego lucar, tu compra ha sido de: " + total + "€", "Gracias por su compra", JOptionPane.INFORMATION_MESSAGE);			
				}
		});
		//EVENTO JFRAME INCIO
		frmListaDeLa.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				
				comboBox.setSelectedItem(null);
			}
		});
		
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (textField_2.getText().length()>=6)
					System.out.println("Mayor que 6");
				}
		});
		
		//EVENTO DEL COMBO
		/*comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				String seleccionado = comboBox.getSelectedItem().toString();
				textField_3.setText(seleccionado);
		}
		});
		
		*/
		
		//EVENTO AÑADIR PRODUCTO
		btnAadirProductoCreado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String producto = textField_2.getText().toString(); //texto en cadena "PATATAS"
				String cantidad = comboBox.getSelectedItem().toString(); // Item en cadena "2"
				String precio   = textField_3.getText().toString(); //texto en cadena "0.5"
				
				double cantidadD = Double.parseDouble(cantidad);
				double precioD   = Double.parseDouble(precio);
				double calculo   = cantidadD * precioD;
				total = total + calculo;

				textField_4.setText(textField_4.getText() + producto + " ("+cantidad+") "+ "-->" + calculo + "\n");
				textField_1.setText(total + "€");
				textField_2.setText("");
				textField_3.setText("");
				comboBox.setSelectedItem(null);
				
				
				
			}
		});
		
		
	}
}
