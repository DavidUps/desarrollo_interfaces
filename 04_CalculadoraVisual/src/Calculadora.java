import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Calculadora {

	private JFrame frmCalculadora;
	private JTextField op1;
	private JTextField res;
	private JTextField op2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setIconImage(Toolkit.getDefaultToolkit().getImage(Calculadora.class.getResource("/javax/swing/plaf/metal/icons/ocean/computer.gif")));
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 450, 256);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(new MigLayout("", "[][grow][][grow]", "[][][][][][][][][]"));
		
		JLabel lblNmero = new JLabel("N\u00FAmero 1:");
		frmCalculadora.getContentPane().add(lblNmero, "cell 0 0,alignx trailing");
		
		op1 = new JTextField();
		frmCalculadora.getContentPane().add(op1, "cell 1 0,growx");
		op1.setColumns(10);
		
		JButton sum = new JButton("+");
		sum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int total=0;
				
				if(Integer.parseInt(op1.getText())>0 && Integer.parseInt(op2.getText())>0 && op1.getText().length()>0 && op2.getText().length()>0) {
					total=Integer.parseInt(op1.getText()) + Integer.parseInt(op2.getText()); 
					res.setText(String.valueOf(total));
				}
			}
		});
		frmCalculadora.getContentPane().add(sum, "cell 2 0");
		
		JButton rest = new JButton("-");
		rest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int total=0;

				if(Integer.parseInt(op1.getText())>0 && Integer.parseInt(op2.getText())>0 && op1.getText().length()>0 && op2.getText().length()>0) {
					total=Integer.parseInt(op1.getText()) - Integer.parseInt(op2.getText()); 
					res.setText(String.valueOf(total));
				}
				
			}
		});
		frmCalculadora.getContentPane().add(rest, "cell 3 0");
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero 2:");
		frmCalculadora.getContentPane().add(lblNewLabel_1, "cell 0 1,alignx trailing");
		
		op2 = new JTextField();
		frmCalculadora.getContentPane().add(op2, "cell 1 1,growx");
		op2.setColumns(10);
		
		JButton mul = new JButton("*");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int total=0;

				if(Integer.parseInt(op1.getText())>0 && Integer.parseInt(op2.getText())>0 && op1.getText().length()>0 && op2.getText().length()>0) {
					total=Integer.parseInt(op1.getText()) * Integer.parseInt(op2.getText()); 
					res.setText(String.valueOf(total));
				}
			}
		});
		frmCalculadora.getContentPane().add(mul, "cell 2 1");
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int total=0;

				if(Integer.parseInt(op1.getText())>0 && Integer.parseInt(op2.getText())>0 && op1.getText().length()>0 && op2.getText().length()>0) {
					total=Integer.parseInt(op1.getText()) / Integer.parseInt(op2.getText()); 
					res.setText(String.valueOf(total));
				}
			}
		});
		frmCalculadora.getContentPane().add(div, "cell 3 1");
		
		JLabel lblNewLabel = new JLabel("Resultado");
		frmCalculadora.getContentPane().add(lblNewLabel, "cell 2 5,alignx center");
		
		res = new JTextField();
		res.setEditable(false);
		frmCalculadora.getContentPane().add(res, "cell 3 5 1 2,alignx center");
		res.setColumns(10);
	}

}
