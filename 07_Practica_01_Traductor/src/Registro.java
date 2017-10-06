import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registro {

	private JFrame frmRegistro;
	private JTextField nombre_registro;
	private JTextField apellido_registro;
	private JTextField correo_registro;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

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
		frmRegistro.setVisible(true);
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
		
		JLabel lblNombre = new JLabel("Nombre *");
		lblNombre.setBounds(14, 23, 70, 14);
		frmRegistro.getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido *");
		lblApellido.setBounds(14, 66, 70, 14);
		frmRegistro.getContentPane().add(lblApellido);
		
		JLabel lblCorreoElectrnico = new JLabel("Correo electr\u00F3nico *");
		lblCorreoElectrnico.setBounds(220, 23, 121, 14);
		frmRegistro.getContentPane().add(lblCorreoElectrnico);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha nacimiento");
		lblFechaNacimiento.setBounds(220, 66, 109, 14);
		frmRegistro.getContentPane().add(lblFechaNacimiento);
		
		JLabel lblFinesLucrativos = new JLabel("Fines lucrativos *");
		lblFinesLucrativos.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinesLucrativos.setBounds(14, 117, 216, 14);
		frmRegistro.getContentPane().add(lblFinesLucrativos);
		
		JRadioButton btn_2_registro = new JRadioButton("Si");
		buttonGroup.add(btn_2_registro);
		btn_2_registro.setSelected(true);
		btn_2_registro.setHorizontalAlignment(SwingConstants.CENTER);
		btn_2_registro.setBounds(121, 138, 109, 23);
		frmRegistro.getContentPane().add(btn_2_registro);
		
		JRadioButton btn_1_registro = new JRadioButton("No");
		buttonGroup.add(btn_1_registro);
		btn_1_registro.setHorizontalAlignment(SwingConstants.CENTER);
		btn_1_registro.setBounds(10, 138, 109, 23);
		frmRegistro.getContentPane().add(btn_1_registro);
		
		JLabel lblDeseaRecibirInformacin = new JLabel("Desea recibir informaci\u00F3n de nuevos idiomas");
		lblDeseaRecibirInformacin.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeseaRecibirInformacin.setBounds(14, 182, 424, 14);
		frmRegistro.getContentPane().add(lblDeseaRecibirInformacin);
		
		JCheckBox check_registro = new JCheckBox("");
		check_registro.setSelected(true);
		check_registro.setBounds(220, 203, 21, 23);
		frmRegistro.getContentPane().add(check_registro);
		
		
		
		
		
		nombre_registro = new JTextField();
		nombre_registro.setBounds(94, 20, 116, 20);
		frmRegistro.getContentPane().add(nombre_registro);
		nombre_registro.setColumns(10);
		
		apellido_registro = new JTextField();
		apellido_registro.setBounds(94, 63, 116, 20);
		frmRegistro.getContentPane().add(apellido_registro);
		apellido_registro.setColumns(10);
		
		correo_registro = new JTextField();
		correo_registro.setBounds(339, 20, 99, 20);
		frmRegistro.getContentPane().add(correo_registro);
		correo_registro.setColumns(10);
		
		JDateChooser fecha_registro = new JDateChooser();
		fecha_registro.setBounds(339, 66, 99, 20);
		frmRegistro.getContentPane().add(fecha_registro);
		
		JLabel lblNewLabel = new JLabel("Pais");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(220, 117, 218, 14);
		frmRegistro.getContentPane().add(lblNewLabel);
		
		JComboBox pais_registro = new JComboBox();
		pais_registro.setModel(new DefaultComboBoxModel(new String[] {"    Afganist\u00E1n", "    Akrotiri", "    Albania", "    Alemania", "    Andorra", "    Angola", "    Anguila", "    Ant\u00E1rtida", "    Antigua y Barbuda", "    Antillas Neerlandesas", "    Arabia Saud\u00ED", "    Arctic Ocean", "    Argelia", "    Argentina", "    Armenia", "    Aruba", "    Ashmore and Cartier Islands", "    Atlantic Ocean", "    Australia", "    Austria", "    Azerbaiy\u00E1n", "    Bahamas", "    Bahr\u00E1in", "    Bangladesh", "    Barbados", "    B\u00E9lgica", "    Belice", "    Ben\u00EDn", "    Bermudas", "    Bielorrusia", "    Birmania; Myanmar", "    Bolivia", "    Bosnia y Hercegovina", "    Botsuana", "    Brasil", "    Brun\u00E9i", "    Bulgaria", "    Burkina Faso", "    Burundi", "    But\u00E1n", "    Cabo Verde", "    Camboya", "    Camer\u00FAn", "    Canad\u00E1", "    Chad", "    Chile", "    China", "    Chipre", "    Clipperton Island", "    Colombia", "    Comoras", "    Congo", "    Coral Sea Islands", "    Corea del Norte", "    Corea del Sur", "    Costa de Marfil", "    Costa Rica", "    Croacia", "    Cuba", "    Dhekelia", "    Dinamarca", "    Dominica", "    Ecuador", "    Egipto", "    El Salvador", "    El Vaticano", "    Emiratos \u00C1rabes Unidos", "    Eritrea", "    Eslovaquia", "    Eslovenia", "    Espa\u00F1a", "    Estados Unidos", "    Estonia", "    Etiop\u00EDa", "    Filipinas", "    Finlandia", "    Fiyi", "    Francia", "    Gab\u00F3n", "    Gambia", "    Gaza Strip", "    Georgia", "    Ghana", "    Gibraltar", "    Granada", "    Grecia", "    Groenlandia", "    Guam", "    Guatemala", "    Guernsey", "    Guinea", "    Guinea Ecuatorial", "    Guinea-Bissau", "    Guyana", "    Hait\u00ED", "    Honduras", "    Hong Kong", "    Hungr\u00EDa", "    India", "    Indian Ocean", "    Indonesia", "    Ir\u00E1n", "    Iraq", "    Irlanda", "    Isla Bouvet", "    Isla Christmas", "    Isla Norfolk", "    Islandia", "    Islas Caim\u00E1n", "    Islas Cocos", "    Islas Cook", "    Islas Feroe", "    Islas Georgia del Sur y Sandwich del Sur", "    Islas Heard y McDonald", "    Islas Malvinas", "    Islas Marianas del Norte", "    Islas Marshall", "    Islas Pitcairn", "    Islas Salom\u00F3n", "    Islas Turcas y Caicos", "    Islas V\u00EDrgenes Americanas", "    Islas V\u00EDrgenes Brit\u00E1nicas", "    Israel", "    Italia", "    Jamaica", "    Jan Mayen", "    Jap\u00F3n", "    Jersey", "    Jordania", "    Kazajist\u00E1n", "    Kenia", "    Kirguizist\u00E1n", "    Kiribati", "    Kuwait", "    Laos", "    Lesoto", "    Letonia", "    L\u00EDbano", "    Liberia", "    Libia", "    Liechtenstein", "    Lituania", "    Luxemburgo", "    Macao", "    Macedonia", "    Madagascar", "    Malasia", "    Malaui", "    Maldivas", "    Mal\u00ED", "    Malta", "    Man, Isle of", "    Marruecos", "    Mauricio", "    Mauritania", "    Mayotte", "    M\u00E9xico", "    Micronesia", "    Moldavia", "    M\u00F3naco", "    Mongolia", "    Montenegro", "    Montserrat", "    Mozambique", "    Mundo", "    Namibia", "    Nauru", "    Navassa Island", "    Nepal", "    Nicaragua", "    N\u00EDger", "    Nigeria", "    Niue", "    Noruega", "    Nueva Caledonia", "    Nueva Zelanda", "    Om\u00E1n", "    Pacific Ocean", "    Pa\u00EDses Bajos", "    Pakist\u00E1n", "    Palaos", "    Panam\u00E1", "    Pap\u00FAa-Nueva Guinea", "    Paracel Islands", "    Paraguay", "    Per\u00FA", "    Polinesia Francesa", "    Polonia", "    Portugal", "    Puerto Rico", "    Qatar", "    Reino Unido", "    Rep\u00FAblica Centroafricana", "    Rep\u00FAblica Checa", "    Rep\u00FAblica Democr\u00E1tica del Congo", "    Rep\u00FAblica Dominicana", "    Ruanda", "    Rumania", "    Rusia", "    S\u00E1hara Occidental", "    Samoa", "    Samoa Americana", "    San Crist\u00F3bal y Nieves", "    San Marino", "    San Pedro y Miquel\u00F3n", "    San Vicente y las Granadinas", "    Santa Helena", "    Santa Luc\u00EDa", "    Santo Tom\u00E9 y Pr\u00EDncipe", "    Senegal", "    Serbia", "    Seychelles", "    Sierra Leona", "    Singapur", "    Siria", "    Somalia", "    Southern Ocean", "    Spratly Islands", "    Sri Lanka", "    Suazilandia", "    Sud\u00E1frica", "    Sud\u00E1n", "    Suecia", "    Suiza", "    Surinam", "    Svalbard y Jan Mayen", "    Tailandia", "    Taiw\u00E1n", "    Tanzania", "    Tayikist\u00E1n", "    Territorio Brit\u00E1nico del Oc\u00E9ano Indico", "    Territorios Australes Franceses", "    Timor Oriental", "    Togo", "    Tokelau", "    Tonga", "    Trinidad y Tobago", "    T\u00FAnez", "    Turkmenist\u00E1n", "    Turqu\u00EDa", "    Tuvalu", "    Ucrania", "    Uganda", "    Uni\u00F3n Europea", "    Uruguay", "    Uzbekist\u00E1n", "    Vanuatu", "    Venezuela", "    Vietnam", "    Wake Island", "    Wallis y Futuna", "    West Bank", "    Yemen", "    Yibuti", "    Zambia", "    Zimbabue"}));
		pais_registro.setBounds(236, 139, 198, 20);
		frmRegistro.getContentPane().add(pais_registro);
		
		//Loguin
		
		JButton cancelar_registro = new JButton("Cancelar");
		cancelar_registro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				frmRegistro.dispose();
			}
		});
		cancelar_registro.setBounds(10, 237, 121, 23);
		frmRegistro.getContentPane().add(cancelar_registro);
		
		//Traductor
		
		JButton aceptar_registro = new JButton("Aceptar");
		aceptar_registro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(
				   nombre_registro.getText().length()>=1 &&
				   correo_registro.getText().length()>=1 &&
				   apellido_registro.getText().length()>=1
				   ){
					Traductor traductor = new Traductor();
					frmRegistro.dispose();
				}else
					JOptionPane.showMessageDialog(null, "Faltan campos", "Empty",
							JOptionPane.WARNING_MESSAGE);
			}
		});
		aceptar_registro.setBounds(313, 237, 121, 23);
		frmRegistro.getContentPane().add(aceptar_registro);
	}
	
}
