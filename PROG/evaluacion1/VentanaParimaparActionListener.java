package evaluacion1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;


public class VentanaParimaparActionListener extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TextNumero;
	private JLabel lblNewLabel_1;
	private JLabel lblMensaje;
	JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Impar frame = new Impar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaParimaparActionListener() {
		setTitle("VentanaParimaparActionListener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		lblNewLabel_1 = new JLabel("New label");
		panel.add(lblNewLabel_1);
			
		TextNumero = new JTextField();
		TextNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		TextNumero.setText("0");
		panel.add(TextNumero);
		TextNumero.setColumns(10);
		
		btnNewButton = new JButton("Impar y Par");
		btnNewButton.addActionListener(this);
		panel.add(btnNewButton);
		
		lblMensaje = new JLabel("No se ha introducido nada");
		contentPane.add(lblMensaje, BorderLayout.SOUTH);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
				int n;
				n = Integer.parseInt(TextNumero.getText());
				
				if (n % 2 == 0) {
					lblMensaje.setText("El valor "+n+" es par");
				} else {
					lblMensaje.setText("El valor "+n+" es par");
				}
	}

}
