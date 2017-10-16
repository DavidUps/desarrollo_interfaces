import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import javax.management.loading.PrivateClassLoader;
import javax.print.attribute.standard.Destination;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ViajesDam {

	private JFrame frmViajesDam;
	private JTextField Pago;
	private JTextField Resumen;
	private JTextField TTitular;
	private JTextField Tnum;
	private JTextField TCvv;
	private JTextField INum;
	private JTextField IBanco;
	private JComboBox origen;
	private JComboBox destino;
	private JCheckBox Familia;
	private JCheckBox Joven;
	private JCheckBox Desempleado;
	private JRadioButton tarjeta;
	private JRadioButton IBAN;
	private JRadioButton iV;
	private JRadioButton i;
	JComboBox billetes;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	double pagar = 0.0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViajesDam window = new ViajesDam();
					window.frmViajesDam.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViajesDam() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */



	
	// Descuentos
	private double descuentos(double pagar, JCheckBox Familia, JCheckBox Joven, JCheckBox Desempleado) {
		if(Familia.isSelected()) {
			pagar = pagar -(pagar *0.10);
		}
		if(Joven.isSelected()) {
			pagar = pagar -(pagar *0.08);
		}
		if(Desempleado.isSelected()) {
			pagar = pagar -(pagar *0.06);
		}
		return pagar;
	}
	
	private void initialize() {
		frmViajesDam = new JFrame();
		frmViajesDam.setTitle("VIAJES DAM");
		frmViajesDam.setResizable(false);
		frmViajesDam.setBounds(100, 100, 768, 540);
		frmViajesDam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmViajesDam.getContentPane().setLayout(null);

		JLabel lblCaractersticasDeSu = new JLabel("Caracter\u00EDsticas de su billete de viaje:");
		lblCaractersticasDeSu.setHorizontalAlignment(SwingConstants.LEFT);
		lblCaractersticasDeSu.setBounds(10, 11, 319, 14);
		frmViajesDam.getContentPane().add(lblCaractersticasDeSu);

		JLabel lblorigen = new JLabel("origen: *");
		lblorigen.setHorizontalAlignment(SwingConstants.RIGHT);
		lblorigen.setBounds(10, 46, 131, 14);
		frmViajesDam.getContentPane().add(lblorigen);

		JLabel lbldestino = new JLabel("destino: *");
		lbldestino.setHorizontalAlignment(SwingConstants.RIGHT);
		lbldestino.setBounds(10, 80, 131, 14);
		frmViajesDam.getContentPane().add(lbldestino);

		JComboBox origen = new JComboBox();
		origen.setModel(new DefaultComboBoxModel(new String[] { "MADRID", "BARCELONA" }));
		origen.setBounds(147, 46, 182, 20);
		frmViajesDam.getContentPane().add(origen);

		JComboBox destino = new JComboBox();
		destino.setModel(new DefaultComboBoxModel(new String[] { "BILBADO", "ZARAGOZA" }));
		destino.setBounds(147, 77, 182, 20);
		frmViajesDam.getContentPane().add(destino);

		JLabel lblNewLabel = new JLabel("N\u00BA de billetes: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 118, 131, 14);
		frmViajesDam.getContentPane().add(lblNewLabel);

		JComboBox billetes = new JComboBox();
		billetes.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
		billetes.setBounds(147, 115, 90, 20);
		frmViajesDam.getContentPane().add(billetes);

		JLabel lblTipoDeViaje = new JLabel("Tipo de viaje:");
		lblTipoDeViaje.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipoDeViaje.setBounds(10, 156, 131, 14);
		frmViajesDam.getContentPane().add(lblTipoDeViaje);

		JRadioButton IV = new JRadioButton("Ida/Vta");
		
		IV.setSelected(true);
		buttonGroup.add(IV);
		IV.setBounds(147, 152, 90, 23);
		frmViajesDam.getContentPane().add(IV);

		JRadioButton I = new JRadioButton("S\u00F3lo ida");
		buttonGroup.add(I);
		I.setBounds(239, 152, 90, 23);
		frmViajesDam.getContentPane().add(I);

		JLabel lblFormaDePago = new JLabel("Forma de pago:");
		lblFormaDePago.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFormaDePago.setBounds(10, 190, 131, 14);
		frmViajesDam.getContentPane().add(lblFormaDePago);

		JLabel lblDescuentos = new JLabel("Descuentos:");
		lblDescuentos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescuentos.setBounds(10, 228, 131, 14);
		frmViajesDam.getContentPane().add(lblDescuentos);

		JCheckBox Familia = new JCheckBox("Familia numerosa (-10%)");
		
		Familia.setBounds(147, 224, 182, 23);
		frmViajesDam.getContentPane().add(Familia);

		JCheckBox Joven = new JCheckBox("Carn\u00E9 joven (-8%)");
		Joven.setBounds(147, 260, 182, 23);
		frmViajesDam.getContentPane().add(Joven);

		JCheckBox Desempleado = new JCheckBox("Desempleado (-6%)");
		Desempleado.setBounds(147, 299, 182, 23);
		frmViajesDam.getContentPane().add(Desempleado);

		JButton Proceder = new JButton("Proceder al pago");
		
		Proceder.setBounds(10, 477, 131, 23);
		frmViajesDam.getContentPane().add(Proceder);

		JButton Salir = new JButton("Salir");
		
		Salir.setBounds(148, 477, 182, 23);
		frmViajesDam.getContentPane().add(Salir);

		JLabel lblTotalAPagar = new JLabel("Total a PAGAR:");
		lblTotalAPagar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalAPagar.setBounds(10, 414, 131, 14);
		frmViajesDam.getContentPane().add(lblTotalAPagar);

		Pago = new JTextField();
		
		Pago.setEditable(false);
		Pago.setBounds(147, 411, 90, 20);
		frmViajesDam.getContentPane().add(Pago);
		Pago.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("\u20ACuros");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(239, 414, 67, 14);
		frmViajesDam.getContentPane().add(lblNewLabel_1);

		Resumen = new JTextField();
		Resumen.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		Resumen.setBounds(340, 374, 412, 124);
		frmViajesDam.getContentPane().add(Resumen);
		Resumen.setColumns(10);

		JPanel JPTarjeta = new JPanel();
		JPTarjeta.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		JPTarjeta.setBounds(340, 36, 412, 168);
		frmViajesDam.getContentPane().add(JPTarjeta);
		JPTarjeta.setLayout(null);

		JLabel lblDatosDetarjeta = new JLabel("Datos de tarjeta:");
		lblDatosDetarjeta.setBounds(10, 11, 392, 14);
		JPTarjeta.add(lblDatosDetarjeta);

		JLabel lblTitular = new JLabel("Titular: *");
		lblTitular.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitular.setBounds(10, 47, 75, 14);
		JPTarjeta.add(lblTitular);

		JLabel lblNtarjeta = new JLabel("N\u00BA tarjeta: *");
		lblNtarjeta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNtarjeta.setBounds(10, 83, 75, 14);
		JPTarjeta.add(lblNtarjeta);

		JLabel lblCvv = new JLabel("CVV: *");
		lblCvv.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCvv.setBounds(10, 126, 75, 14);
		JPTarjeta.add(lblCvv);

		TTitular = new JTextField();
		
		TTitular.setBounds(95, 44, 307, 20);
		JPTarjeta.add(TTitular);
		TTitular.setColumns(10);

		Tnum = new JTextField();
		Tnum.setBounds(95, 80, 240, 20);
		JPTarjeta.add(Tnum);
		Tnum.setColumns(10);

		TCvv = new JTextField();
		TCvv.setBounds(95, 123, 68, 20);
		JPTarjeta.add(TCvv);
		TCvv.setColumns(10);

		JLabel lblDigit = new JLabel("3 DIGIT");
		lblDigit.setBounds(173, 126, 46, 14);
		JPTarjeta.add(lblDigit);

		JLabel lblDigit_1 = new JLabel("16 DIGIT");
		lblDigit_1.setBounds(345, 83, 57, 14);
		JPTarjeta.add(lblDigit_1);

		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipo.setBounds(229, 126, 46, 14);
		JPTarjeta.add(lblTipo);

		JComboBox TTipo = new JComboBox();
		TTipo.setModel(new DefaultComboBoxModel(new String[] { "VISA", "MASTERCARD" }));
		TTipo.setBounds(285, 123, 117, 20);
		JPTarjeta.add(TTipo);

		JPanel JPIBAN = new JPanel();
		JPIBAN.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		JPIBAN.setBounds(340, 215, 412, 148);
		frmViajesDam.getContentPane().add(JPIBAN);
		JPIBAN.setLayout(null);

		JLabel datosdecuenta = new JLabel("Datos cuenta IBAN:");
		datosdecuenta.setBounds(10, 11, 392, 14);
		JPIBAN.add(datosdecuenta);

		JLabel lblIbanEs = new JLabel("IBAN - ES: *");
		lblIbanEs.setBounds(10, 42, 81, 14);
		JPIBAN.add(lblIbanEs);

		INum = new JTextField();
		INum.setBounds(98, 36, 241, 20);
		JPIBAN.add(INum);
		INum.setColumns(10);

		JLabel lblDigit_2 = new JLabel("22 DIGIT");
		lblDigit_2.setBounds(349, 42, 53, 14);
		JPIBAN.add(lblDigit_2);

		JLabel lblBanco = new JLabel("Banco: *");
		lblBanco.setBounds(10, 92, 81, 14);
		JPIBAN.add(lblBanco);

		IBanco = new JTextField();
		IBanco.setBounds(98, 89, 304, 20);
		JPIBAN.add(IBanco);
		IBanco.setColumns(10);

		JLabel lblMtodosDePago = new JLabel("M\u00E9todos de pago");
		lblMtodosDePago.setHorizontalAlignment(SwingConstants.LEFT);
		lblMtodosDePago.setBounds(339, 11, 413, 14);
		frmViajesDam.getContentPane().add(lblMtodosDePago);

		
		
		frmViajesDam.addWindowListener(new WindowAdapter() {
			@Override
			// origen-destino Blanco
			public void windowOpened(WindowEvent arg0) {
				/*
				 * origen = new JComboBox(); destino = new JComboBox();
				 */
				origen.setSelectedItem(null);
				destino.setSelectedItem(null);
				// Coger Items
				
				
			};

		});
		
		IV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String madrid = "MADRID";
				String barcelona = "Barcelona";
				String biblado = "BILBADO";
				String zaragoza = "Zaragoza";
				if(origen.getSelectedItem()!= null && destino.getSelectedItem()!=null){
					// I-V Madrid Bilbado
					if (origen.getSelectedItem().toString().equals(madrid))
						if (destino.getSelectedItem().toString().equals(biblado))
							if (IV.isSelected()) {
								String billete=billetes.getSelectedItem().toString();
								double cantidad = Double.parseDouble(billete);
								
								pagar=50*cantidad;
							}
								
					// I Madrid Bilbado
					if (origen.getSelectedItem().toString().equals(madrid))
						if (destino.getSelectedItem().toString().equals(biblado))
							if (I.isSelected()) {
								String billete=billetes.getSelectedItem().toString();
								double cantidad = Double.parseDouble(billete);
								pagar = 30*cantidad;
							}
								

					// I-V Madrid Zaragoza
					if (origen.getSelectedItem().toString().equals(madrid))
						if (destino.getSelectedItem().toString().equals(zaragoza))
							if (IV.isSelected()){
								String billete=billetes.getSelectedItem().toString();
								double cantidad = Double.parseDouble(billete);
								pagar = 25*cantidad;
							}
					// I Madrid Zaragoza
					if (origen.getSelectedItem().toString().equals(madrid))
						if (destino.getSelectedItem().toString().equals(zaragoza))
							if (I.isSelected()){
								String billete=billetes.getSelectedItem().toString();
								double cantidad = Double.parseDouble(billete);
								pagar = 15*cantidad;
							}

					// I-V Barcelona Bilbado
					if (origen.getSelectedItem().toString().equals(barcelona))
						if (destino.getSelectedItem().toString().equals(biblado))
							if (IV.isSelected())
								pagar = 35;
					// I Barcelona Bilbado
					if (origen.getSelectedItem().toString().equals(barcelona))
						if (destino.getSelectedItem().toString().equals(biblado))
							if (I.isSelected()){
								String billete=billetes.getSelectedItem().toString();
								double cantidad = Double.parseDouble(billete);
								pagar = 20*cantidad;
							}

					// I-V Barcelona Zaragoza
					if (origen.getSelectedItem().toString().equals(barcelona))
						if (destino.getSelectedItem().toString().equals(zaragoza))
							if (IV.isSelected())
								pagar = 20;
					// I Barcelona Zaragoza
					if (origen.getSelectedItem().toString().equals(barcelona))
						if (destino.getSelectedItem().toString().equals(zaragoza))
							if (I.isSelected()){
								String billete=billetes.getSelectedItem().toString();
								double cantidad = Double.parseDouble(billete);
								pagar = 12*cantidad;
							}
				}
				Pago.setText(pagar + "");
			}
		});
		
		// Cambiar tarjeta IBAN
		// tarjeta
		JRadioButton tarjeta = new JRadioButton("tarjeta");
		tarjeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tarjeta.isSelected()) {
					JPTarjeta.setVisible(true);
					JPIBAN.setVisible(false);
					if(TTitular.getText().isEmpty()) {
						//ERROR
					}
				}
			}
		});
		tarjeta.setSelected(true);
		buttonGroup_1.add(tarjeta);
		tarjeta.setBounds(147, 186, 90, 23);
		frmViajesDam.getContentPane().add(tarjeta);

		// IBAN
		JRadioButton IBAN = new JRadioButton("IBAN (+5%)");
		IBAN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (IBAN.isSelected()) {
					JPTarjeta.setVisible(false);
					JPIBAN.setVisible(true);
					pagar= pagar +(pagar * 0.05);
				}
				
			}
		});
		//DESCUENTOS
		Familia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Familia.isSelected()) {
					pagar= pagar -(pagar * 0.10);
				}
			}
		});
		Joven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Familia.isSelected()) {
					pagar= pagar -(pagar * 0.8);
				}
			}
		});
		Desempleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Familia.isSelected()) {
					pagar= pagar -(pagar * 0.10);
				}
			}
		});
		
		//PAGO
		Proceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				origen.setSelectedItem(null);
				destino.setSelectedItem(null);
				pagar = 0.0;
				Resumen.setText("RESUMEN DE SU COMPRA" +
								"Origen" + origen.getSelectedItem().toString() +
								"Destino" + destino.getSelectedItem().toString() +
								"numero de billetes" + billetes.getSelectedItem().toString() +
								"Total Pagado" + pagar
						);
				
			}
		});
		
		//SALIR
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = { "Si", "No" };
				int n = JOptionPane.showOptionDialog(frame, "¿Estas seguro que quieres salir?", "Salir",
						JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]);
				if (n == 0) {
					System.exit(0);
				}
			}
		});
		
		buttonGroup_1.add(IBAN);
		IBAN.setBounds(239, 186, 90, 23);
		frmViajesDam.getContentPane().add(IBAN);
		TTitular.setText("");

	}
}
