import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Color;
import javax.swing.JPanel;

public class Traductor {

	private JFrame frmTraductor;
	private JTextField palabra_traductor;
	private JTextField palabra_traducida_traductor;
	private static String pagWeb = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Traductor window = new Traductor();
					window.frmTraductor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	// Traducir INGLES

	private static String traducir_en(String palabra) {
		// TODO Auto-generated method stub

		URL web = null;
		InputStream contenido = null;

		try {
			web = new URL("http://www.wordreference.com/es/en/translation.asp?spen=" + palabra);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			contenido = web.openStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Convertir InputStream en String
		pagWeb = getStringFromInputStream(contenido);

		return pagWeb;
	}

	// Traducir FRANC�S

	private static String traducir_fr(String palabra) {
		// TODO Auto-generated method stub

		URL web = null;
		InputStream contenido = null;

		try {
			web = new URL("http://www.wordreference.com/esfr/" + palabra);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			contenido = web.openStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Convertir InputStream en String
		pagWeb = getStringFromInputStream(contenido);

		return pagWeb;
	}

	// Cortar Palabra

	private static int cortarInicio(String pagWeb) {
		int inicial = pagWeb.indexOf("<td class='ToWrd' >");
		return inicial;
	}

	private static int cortarFin(String pagWeb) {
		int inicial = pagWeb.indexOf("<em class='tooltip POS2'>");
		return inicial;
	}

	// convert InputStream to String
	private static String getStringFromInputStream(InputStream is) {

		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();

		String line;
		try {

			br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return sb.toString();

	}

	/**
	 * Create the application.
	 */
	public Traductor() {
		initialize();
		frmTraductor.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTraductor = new JFrame();
		frmTraductor.setResizable(false);
		frmTraductor.setTitle("Traductor");
		frmTraductor.setBounds(100, 100, 450, 306);
		frmTraductor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTraductor.getContentPane().setLayout(null);

		JLabel lblPalabra = new JLabel("Palabra");
		lblPalabra.setHorizontalAlignment(SwingConstants.CENTER);
		lblPalabra.setBounds(10, 28, 212, 40);
		frmTraductor.getContentPane().add(lblPalabra);

		palabra_traductor = new JTextField();
		palabra_traductor.setCaretColor(Color.BLACK);
		palabra_traductor.setAlignmentX(Component.LEFT_ALIGNMENT);
		palabra_traductor.setHorizontalAlignment(SwingConstants.CENTER);
		palabra_traductor.setBounds(232, 25, 202, 40);
		frmTraductor.getContentPane().add(palabra_traductor);
		palabra_traductor.setColumns(10);

		JButton Btn_traductor = new JButton("Traducir Ingl\u00E9s");

		JLabel lblNewLabel = new JLabel("Palabra Traducida");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 183, 212, 40);
		frmTraductor.getContentPane().add(lblNewLabel);

		palabra_traducida_traductor = new JTextField();
		palabra_traducida_traductor.setEditable(false);
		palabra_traducida_traductor.setBounds(232, 183, 202, 40);
		frmTraductor.getContentPane().add(palabra_traducida_traductor);
		palabra_traducida_traductor.setColumns(10);

		JButton loguin_traductor = new JButton("Loguin");
		loguin_traductor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				frmTraductor.dispose();
			}
		});
		loguin_traductor.setBounds(345, 237, 89, 23);
		frmTraductor.getContentPane().add(loguin_traductor);

		// TRADUCIR INGLES
		Btn_traductor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String palabra = palabra_traductor.getText().toString();

				try {
					traducir_en(palabra);

					String[] cortes = pagWeb.split("<td class='ToWrd' >");
					System.out.println(cortes[1]);

					int pos = cortes[1].indexOf("<em class='tooltip POS2'>");
					String palabraTraducida = cortes[1].substring(0, pos);
					palabra_traducida_traductor.setText(palabraTraducida);

				} catch (ArrayIndexOutOfBoundsException ex) {
					JOptionPane.showMessageDialog(null, "Error en la palabra a traducir", "Word Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		Btn_traductor.setBounds(10, 102, 212, 40);
		frmTraductor.getContentPane().add(Btn_traductor);

		// TRADUCIR FRANCES
		JButton btnNewButton = new JButton("Traducir Franc\u00E9s");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String palabra = palabra_traductor.getText().toString();
				try {
				traducir_fr(palabra);

				String[] cortes = pagWeb.split("<td class='ToWrd' >");
				System.out.println(cortes[1]);

				int pos = cortes[1].indexOf("<em class='tooltip POS2'>");
				String palabraTraducida = cortes[1].substring(0, pos);
				palabra_traducida_traductor.setText(palabraTraducida);
				}catch(ArrayIndexOutOfBoundsException ex2) {
					JOptionPane.showMessageDialog(null, "Error en la palabra a traducir", "Word Error",
							JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnNewButton.setBounds(230, 102, 204, 40);
		frmTraductor.getContentPane().add(btnNewButton);
	}
}