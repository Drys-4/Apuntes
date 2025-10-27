package evaluacion1;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;


public class VentanaPasswordField extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TxtUsuario;
	private JLabel lblUsuario;
	private JLabel lblPasssword;
	JPanel panel;
	JButton btnNewButton;
	private JPasswordField pwfContrasena;
	private JLabel lblMensaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPasswordField frame = new VentanaPasswordField();
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
	public VentanaPasswordField() {
		setTitle("VentanaParimaparActionListener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		lblUsuario = new JLabel("User:");
		panel.add(lblUsuario);
			
		TxtUsuario = new JTextField();
		TxtUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		TxtUsuario.addActionListener(this);
		TxtUsuario.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				TxtUsuario.select(0, TxtUsuario.getText().length());
			}
			public void focusLost(FocusEvent e) {
				TxtUsuario.select(0, 0);
			}
			});
		TxtUsuario.setText("1dw3");
		panel.add(TxtUsuario);
		TxtUsuario.setColumns(10);
		
		btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(this);
		panel.add(btnNewButton);
		
		lblPasssword = new JLabel("Password:");
		panel.add(lblPasssword);
		lblPasssword.setHorizontalAlignment(SwingConstants.CENTER);
		
		pwfContrasena = new JPasswordField();
		pwfContrasena.addActionListener(this);
		pwfContrasena.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				pwfContrasena.setSelectionStart(0);
				String contrasena = new String(pwfContrasena.getPassword());
				pwfContrasena.setSelectionEnd(contrasena.length());
			}
			public void focusLost(FocusEvent e) {
				pwfContrasena.select(0, 0);
			}
			});
		pwfContrasena.setText("1dw3");
		panel.add(pwfContrasena);
		pwfContrasena.setColumns(10);
		panel.add(btnNewButton);
		
		lblMensaje = new JLabel("No hay datos");
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblMensaje, BorderLayout.SOUTH);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String usuario = this.TxtUsuario.getText();
		String contrasena = new String(pwfContrasena.getPassword());
				
		if(usuario.equals("1dw3") && contrasena.equals("1dw3")) {
			this.lblMensaje.setText("Bienvenido "+usuario);
		} else {
			this.lblMensaje.setText("Datos incorret");
		}
		
		//this.lblMensaje.setText("Usuario: "+usuario+" Contraseña: "+contrasena);
	}

}
