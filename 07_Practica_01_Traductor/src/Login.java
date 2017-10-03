import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

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
		
		JButton registro_login = new JButton("Registro");
		registro_login.setBounds(104, 217, 104, 23);
		frmLogin.getContentPane().add(registro_login);
		
		JButton traductor_login = new JButton("Traductor");
		traductor_login.setBounds(223, 217, 104, 23);
		frmLogin.getContentPane().add(traductor_login);
	}
}
