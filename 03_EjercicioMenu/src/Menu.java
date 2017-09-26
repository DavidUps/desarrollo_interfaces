import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;

public class Menu {

	private JFrame frmMenuPrueba;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frmMenuPrueba.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenuPrueba = new JFrame();
		frmMenuPrueba.setResizable(false);
		frmMenuPrueba.setTitle("Menu Prueba");
		frmMenuPrueba.setBounds(100, 100, 593, 446);
		frmMenuPrueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenuPrueba.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 109, 21);
		frmMenuPrueba.getContentPane().add(menuBar);
		
		JMenu mnEdicin = new JMenu("Edici\u00F3n");
		menuBar.add(mnEdicin);
		
		JMenuItem mntmCopiar = new JMenuItem("Copiar");
		mntmCopiar.setIcon(new ImageIcon(Menu.class.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Copy-Black.png")));
		mnEdicin.add(mntmCopiar);
		
		JMenuItem mntmPegar = new JMenuItem("Pegar");
		mntmPegar.setIcon(new ImageIcon(Menu.class.getResource("/com/sun/javafx/scene/web/skin/IncreaseIndent_16x16_JFX.png")));
		mnEdicin.add(mntmPegar);
		
		JMenu mnArchivos = new JMenu("Archivos");
		menuBar.add(mnArchivos);
		
		JMenuItem mntmImportar = new JMenuItem("Importar");
		mnArchivos.add(mntmImportar);
		
		JMenuItem mntmEjecutar = new JMenuItem("Ejecutar");
		mnArchivos.add(mntmEjecutar);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblNewLabel.setBounds(17, 143, 80, 25);
		frmMenuPrueba.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(17, 179, 80, 25);
		frmMenuPrueba.getContentPane().add(lblNewLabel_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(107, 217, 97, 20);
		frmMenuPrueba.getContentPane().add(dateChooser);
		
		JLabel lblNewLabel_2 = new JLabel("Nacimiento");
		lblNewLabel_2.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(17, 215, 80, 22);
		frmMenuPrueba.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(107, 181, 97, 20);
		frmMenuPrueba.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 145, 98, 20);
		frmMenuPrueba.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Usuario");
		lblNewLabel_3.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(317, 148, 73, 20);
		frmMenuPrueba.getContentPane().add(lblNewLabel_3);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblContrasea.setBounds(317, 184, 73, 20);
		frmMenuPrueba.getContentPane().add(lblContrasea);
		
		textField_2 = new JTextField();
		textField_2.setBounds(384, 148, 86, 20);
		frmMenuPrueba.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(384, 181, 86, 20);
		frmMenuPrueba.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Consolas", Font.PLAIN, 11));
		btnNewButton.setBounds(478, 373, 89, 23);
		frmMenuPrueba.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Nuevo Usuario");
		lblNewLabel_4.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblNewLabel_4.setIcon(new ImageIcon(Menu.class.getResource("/javax/swing/plaf/basic/icons/image-failed.png")));
		lblNewLabel_4.setBounds(17, 81, 187, 51);
		frmMenuPrueba.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Usuario Existente");
		lblNewLabel_5.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblNewLabel_5.setIcon(new ImageIcon(Menu.class.getResource("/javax/swing/plaf/basic/icons/image-delayed.png")));
		lblNewLabel_5.setBounds(309, 81, 201, 56);
		frmMenuPrueba.getContentPane().add(lblNewLabel_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Si");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setFont(new Font("Consolas", Font.PLAIN, 11));
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(17, 322, 53, 23);
		frmMenuPrueba.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setFont(new Font("Consolas", Font.PLAIN, 11));
		buttonGroup.add(rdbtnNo);
		rdbtnNo.setBounds(107, 322, 97, 23);
		frmMenuPrueba.getContentPane().add(rdbtnNo);
		
		JLabel lblNewLabel_6 = new JLabel("Aceptas los terminos");
		lblNewLabel_6.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblNewLabel_6.setIcon(new ImageIcon(Menu.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-warning.png")));
		lblNewLabel_6.setBounds(17, 262, 223, 52);
		frmMenuPrueba.getContentPane().add(lblNewLabel_6);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(317, 301, 157, 56);
		frmMenuPrueba.getContentPane().add(scrollPane);
		
		JList list = new JList();
		list.setFont(new Font("Consolas", Font.PLAIN, 11));
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Madrid", "Sevilla", "\u00C1vila", "Toledo", "Segovia", "Pamplona", "Cadiz"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JLabel lblNewLabel_7 = new JLabel("Ciudad");
		lblNewLabel_7.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblNewLabel_7.setBounds(317, 280, 46, 14);
		frmMenuPrueba.getContentPane().add(lblNewLabel_7);
	}
}
