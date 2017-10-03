import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class Registro {

	private JFrame frmRegistro;
	private JTextField nombre_registro;
	private JTextField apellido_registro;
	private JTextField correo_registro;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro window = new Registro();
					window.frmRegistro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistro = new JFrame();
		frmRegistro.setResizable(false);
		frmRegistro.setTitle("Registro");
		frmRegistro.setBounds(100, 100, 450, 300);
		frmRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistro.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 36, 74, 14);
		frmRegistro.getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 73, 74, 14);
		frmRegistro.getContentPane().add(lblApellido);
		
		nombre_registro = new JTextField();
		nombre_registro.setBounds(94, 33, 105, 20);
		frmRegistro.getContentPane().add(nombre_registro);
		nombre_registro.setColumns(10);
		
		apellido_registro = new JTextField();
		apellido_registro.setBounds(94, 70, 105, 20);
		frmRegistro.getContentPane().add(apellido_registro);
		apellido_registro.setColumns(10);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha nacimiento");
		lblFechaNacimiento.setBounds(209, 73, 111, 14);
		frmRegistro.getContentPane().add(lblFechaNacimiento);
		
		JDateChooser fecha_registro = new JDateChooser();
		fecha_registro.setBounds(328, 73, 106, 20);
		frmRegistro.getContentPane().add(fecha_registro);
		
		JLabel lblCorreoElectrnico = new JLabel("Correo electr\u00F3nico");
		lblCorreoElectrnico.setBounds(209, 36, 111, 14);
		frmRegistro.getContentPane().add(lblCorreoElectrnico);
		
		correo_registro = new JTextField();
		correo_registro.setBounds(328, 33, 106, 20);
		frmRegistro.getContentPane().add(correo_registro);
		correo_registro.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Desea recibir informaci\u00F3n de nuevos idiomas");
		lblNewLabel.setBounds(10, 173, 265, 23);
		frmRegistro.getContentPane().add(lblNewLabel);
		
		JCheckBox informacion_registro = new JCheckBox("");
		informacion_registro.setSelected(true);
		informacion_registro.setBounds(281, 173, 28, 23);
		frmRegistro.getContentPane().add(informacion_registro);
		
		JLabel lblNewLabel_1 = new JLabel("Fines lucrativos");
		lblNewLabel_1.setBounds(10, 121, 91, 14);
		frmRegistro.getContentPane().add(lblNewLabel_1);
		
		JRadioButton boton_1_registro = new JRadioButton("Si");
		boton_1_registro.setSelected(true);
		buttonGroup.add(boton_1_registro);
		boton_1_registro.setBounds(107, 117, 45, 23);
		frmRegistro.getContentPane().add(boton_1_registro);
		
		JRadioButton boton_2_registro = new JRadioButton("No");
		buttonGroup.add(boton_2_registro);
		boton_2_registro.setBounds(154, 117, 45, 23);
		frmRegistro.getContentPane().add(boton_2_registro);
		
		JLabel lblNacionalidad = new JLabel("Pa\u00EDs");
		lblNacionalidad.setBounds(209, 121, 111, 14);
		frmRegistro.getContentPane().add(lblNacionalidad);
		
		JComboBox pais_registro = new JComboBox();
		pais_registro.setModel(new DefaultComboBoxModel(new String[] {"    Afganist\u00E1n", "    Albania", "    Alemania", "    Andorra", "    Angola", "    Antigua y Barbuda", "    Arabia Saudita", "    Argelia", "    Argentina", "    Armenia", "    Australia", "    Austria", "    Azerbaiy\u00E1n", "    Bahamas", "    Banglad\u00E9s", "    Barbados", "    Bar\u00E9in", "    B\u00E9lgica", "    Belice", "    Ben\u00EDn", "    Bielorrusia", "    Birmania", "    Bolivia", "    Bosnia y Herzegovina", "    Botsuana", "    Brasil", "    Brun\u00E9i", "    Bulgaria", "    Burkina Faso", "    Burundi", "    But\u00E1n", "    Cabo Verde", "    Camboya", "    Camer\u00FAn", "    Canad\u00E1", "    Catar", "    Chad", "    Chile", "    China", "    Chipre", "    Ciudad del Vaticano", "    Colombia", "    Comoras", "    Corea del Norte", "    Corea del Sur", "    Costa de Marfil", "    Costa Rica", "    Croacia", "    Cuba", "    Dinamarca", "    Dominica", "    Ecuador", "    Egipto", "    El Salvador", "    Emiratos \u00C1rabes Unidos", "    Eritrea", "    Eslovaquia", "    Eslovenia", "    Espa\u00F1a", "    Estados Unidos", "    Estonia", "    Etiop\u00EDa", "    Filipinas", "    Finlandia", "    Fiyi", "    Francia", "    Gab\u00F3n", "    Gambia", "    Georgia", "    Ghana", "    Granada", "    Grecia", "    Guatemala", "    Guyana", "    Guinea", "    Guinea ecuatorial", "    Guinea-Bis\u00E1u", "    Hait\u00ED", "    Honduras", "    Hungr\u00EDa", "    India", "    Indonesia", "    Irak", "    Ir\u00E1n", "    Irlanda", "    Islandia", "    Islas Marshall", "    Islas Salom\u00F3n", "    Israel", "    Italia", "    Jamaica", "    Jap\u00F3n", "    Jordania", "    Kazajist\u00E1n", "    Kenia", "    Kirguist\u00E1n", "    Kiribati", "    Kuwait", "    Laos", "    Lesoto", "    Letonia", "    L\u00EDbano", "    Liberia", "    Libia", "    Liechtenstein", "    Lituania", "    Luxemburgo", "    Madagascar", "    Malasia", "    Malaui", "    Maldivas", "    Mal\u00ED", "    Malta", "    Marruecos", "    Mauricio", "    Mauritania", "    M\u00E9xico", "    Micronesia", "    Moldavia", "    M\u00F3naco", "    Mongolia", "    Montenegro", "    Mozambique", "    Namibia", "    Nauru", "    Nepal", "    Nicaragua", "    N\u00EDger", "    Nigeria", "    Noruega", "    Nueva Zelanda", "    Om\u00E1n", "    Pa\u00EDses Bajos", "    Pakist\u00E1n", "    Palaos", "    Panam\u00E1", "    Pap\u00FAa Nueva Guinea", "    Paraguay", "    Per\u00FA", "    Polonia", "    Portugal", "    Reino Unido", "    Rep\u00FAblica Centroafricana", "    Rep\u00FAblica Checa", "    Rep\u00FAblica de Macedonia", "    Rep\u00FAblica del Congo", "    Rep\u00FAblica Democr\u00E1tica del Congo", "    Rep\u00FAblica Dominicana", "    Rep\u00FAblica Sudafricana", "    Ruanda", "    Ruman\u00EDa", "    Rusia", "    Samoa", "    San Crist\u00F3bal y Nieves", "    San Marino", "    San Vicente y las Granadinas", "    Santa Luc\u00EDa", "    Santo Tom\u00E9 y Pr\u00EDncipe", "    Senegal", "    Serbia", "    Seychelles", "    Sierra Leona", "    Singapur", "    Siria", "    Somalia", "    Sri Lanka", "    Suazilandia", "    Sud\u00E1n", "    Sud\u00E1n del Sur", "    Suecia", "    Suiza", "    Surinam", "    Tailandia", "    Tanzania", "    Tayikist\u00E1n", "    Timor Oriental", "    Togo", "    Tonga", "    Trinidad y Tobago", "    T\u00FAnez", "    Turkmenist\u00E1n", "    Turqu\u00EDa", "    Tuvalu", "    Ucrania", "    Uganda", "    Uruguay", "    Uzbekist\u00E1n", "    Vanuatu", "    Venezuela", "    Vietnam", "    Yemen", "    Yibuti", "    Zambia", "    Zimbabue"}));
		pais_registro.setBounds(328, 118, 106, 20);
		frmRegistro.getContentPane().add(pais_registro);
		
		JButton aceptar_registro = new JButton("Aceptar");
		aceptar_registro.setBounds(336, 237, 89, 23);
		frmRegistro.getContentPane().add(aceptar_registro);
		
		JButton cancelar_registro = new JButton("Cancelar");
		cancelar_registro.setBounds(10, 237, 89, 23);
		frmRegistro.getContentPane().add(cancelar_registro);
	}
}
