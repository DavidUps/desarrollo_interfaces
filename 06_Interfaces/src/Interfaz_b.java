import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz_b {

	private JFrame frmInterfazB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_b window = new Interfaz_b();
					window.frmInterfazB.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz_b() {
		initialize();
		frmInterfazB.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInterfazB = new JFrame();
		frmInterfazB.setTitle("INTERFAZ B");
		frmInterfazB.setBounds(100, 100, 450, 300);
		frmInterfazB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInterfazB.getContentPane().setLayout(null);
		
		JButton btn_a = new JButton("IR A A");
		
		btn_a.setBounds(161, 119, 89, 23);
		frmInterfazB.getContentPane().add(btn_a);
		
		//Evento ir al padre (A)
		btn_a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Abrir A
				Interfaz_a a = new Interfaz_a();
				a.getFrmInterfazA().setVisible(true);
				//Cerrar B
				frmInterfazB.dispose();
			}
		});
	}

}
