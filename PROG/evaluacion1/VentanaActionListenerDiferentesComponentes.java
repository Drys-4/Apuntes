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


public class VentanaActionListenerDiferentesComponentes extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblDescrip;
	private JLabel lblMensaje;
	JButton btnUno;
	private JButton btnDos;
	private JButton btnTres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaActionListenerDiferentesComponentes frame = new VentanaActionListenerDiferentesComponentes();
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
	public VentanaActionListenerDiferentesComponentes() {
		setTitle("VentanaParimaparActionListener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		btnUno = new JButton("1");
		btnUno.addActionListener(this);
		panel.add(btnUno);
		
		btnDos = new JButton("2");
		btnDos.addActionListener(this);
		panel.add(btnDos);
		
		btnTres = new JButton("3");
		btnTres.addActionListener(this);
		panel.add(btnTres);
		
		lblMensaje = new JLabel("Pulse boton");
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblMensaje, BorderLayout.SOUTH);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		// obtengo sobre que componente se ha realizado la accion
		Object o = ae.getSource();
		if (o == btnUno){
			this.lblMensaje.setText("Uno");
		}
		else if (o == btnDos){
			this.lblMensaje.setText("Dos");
		}
		else if (o == btnTres){
			this.lblMensaje.setText("Tres");
		}
	}

}
