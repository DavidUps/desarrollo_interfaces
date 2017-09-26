import java.awt.EventQueue;

import javax.swing.JFrame;
import com.toedter.calendar.JDayChooser;
import java.awt.BorderLayout;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JDateChooser;

public class Ejemplo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo window = new Ejemplo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejemplo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JDayChooser dayChooser = new JDayChooser();
		frame.getContentPane().add(dayChooser, BorderLayout.NORTH);
	}

}
