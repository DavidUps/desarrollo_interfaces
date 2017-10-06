import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frmLogin;
	private JTextField usuario_login;
	private JPasswordField contraseña_login;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		frmLogin.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setResizable(false);
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		usuario_login = new JTextField();
		usuario_login.setBounds(223, 70, 104, 20);
		frmLogin.getContentPane().add(usuario_login);
		usuario_login.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(104, 73, 104, 14);
		frmLogin.getContentPane().add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(104, 117, 104, 14);
		frmLogin.getContentPane().add(lblContrasea);
		
		contraseña_login = new JPasswordField();
		contraseña_login.setBounds(223, 114, 104, 20);
		frmLogin.getContentPane().add(contraseña_login);

		
		//Traductor
		
		JButton traductor_login = new JButton("Traductor");
		traductor_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!usuario_login.getText().isEmpty() && !contraseña_login.getText().isEmpty() && usuario_login.getText().equals(contraseña_login.getText())) {
					Traductor traductor = new Traductor();
					frmLogin.dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta", "Login Error", JOptionPane.ERROR_MESSAGE);
				}		
			}
		});
		traductor_login.setBounds(223, 217, 104, 23);
		frmLogin.getContentPane().add(traductor_login);
		
		//Registro
		
		JButton registro_login = new JButton("Registro");
		registro_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registro registro = new Registro();
				frmLogin.dispose();
			}
		});
		registro_login.setBounds(104, 217, 104, 23);
		frmLogin.getContentPane().add(registro_login);
	}
}
