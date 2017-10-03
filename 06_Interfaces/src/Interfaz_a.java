import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz_a {

	private JFrame frmInterfazA;

	public JFrame getFrmInterfazA() {
		return frmInterfazA;
	}

	public void setFrmInterfazA(JFrame frmInterfazA) {
		this.frmInterfazA = frmInterfazA;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_a window = new Interfaz_a();
					window.frmInterfazA.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz_a() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInterfazA = new JFrame();
		frmInterfazA.setTitle("INTERFAZ A");
		frmInterfazA.setBounds(100, 100, 450, 300);
		frmInterfazA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInterfazA.getContentPane().setLayout(null);
		
		JButton btn_b = new JButton("IR A B");
		
		btn_b.setBounds(171, 117, 89, 23);
		frmInterfazA.getContentPane().add(btn_b);
		
		btn_b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Abrir interfaz B
				Interfaz_b b = new Interfaz_b();
				//Cerra r interfaz A
				frmInterfazA.dispose();
			}
			
		});
	}
}
