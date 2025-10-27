package evaluacion1;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Color;


public class VentanaListNumeros extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	DefaultListModel<Integer> dlm;
	private JTextField txtNumero;
	private JLabel lblNumero;
	JPanel panelNorth;
	JButton btnInsert;
	private JButton btnDelete;
	private JButton btnClear;
	private JList<Integer> lstNumeros;
	DefaultListMode<Integer> dml;
	private JPanel panelSur;
	private JLabel lblElementos;
	private JLabel lblElementosValor;
	private JLabel lblSuma;
	private JLabel lblSumaValor;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaListNumeros frame = new VentanaListNumeros();
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
	public VentanaListNumeros() {
		setTitle("VentanaParimaparActionListener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
	
		dlm = new DefaultListModel<Integer>();
		
			lstNumeros = new JList<Integer>();
			lstNumeros.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lstNumeros.setModel(dlm);
		contentPane.add(lstNumeros, BorderLayout.CENTER);
		

		
		
		panelNorth = new JPanel();
		contentPane.add(panelNorth, BorderLayout.NORTH);
		
		lblNumero = new JLabel("Número");
		panelNorth.add(lblNumero);
			
		txtNumero = new JTextField();
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.addActionListener(this);
		txtNumero.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				txtNumero.select(0, txtNumero.getText().length());
			}
			public void focusLost(FocusEvent e) {
				txtNumero.select(0, 0);
			}
			});
		txtNumero.setText("0");
		panelNorth.add(txtNumero);
		txtNumero.addActionListener(this);
		txtNumero.setColumns(10);
		
		btnInsert = new JButton("Insertar");
		btnInsert.addActionListener(this);
		panelNorth.add(btnInsert);
		
		btnDelete = new JButton("Borrar");
		btnDelete.addActionListener(this);
		panelNorth.add(btnDelete);
		
		btnClear = new JButton("Limpiar");
		btnClear.addActionListener(this);
		panelNorth.add(btnClear);
		
		panelSur = new JPanel();
		contentPane.add(panelSur, BorderLayout.SOUTH);
		
		lblElementos = new JLabel("Total elementos:");
		panelSur.add(lblElementos);
		
		lblElementosValor = new JLabel("0");
		lblElementosValor.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblElementosValor.setForeground(new Color(255, 0, 0));
		panelSur.add(lblElementosValor);
		
		lblSuma = new JLabel("Suma Total:");
		panelSur.add(lblSuma);
		
		lblSumaValor = new JLabel("0");
		lblSumaValor.setForeground(Color.RED);
		lblSumaValor.setFont(new Font("Tahoma", Font.BOLD, 18));
		panelSur.add(lblSumaValor);

		
		txtNumero.setText("7");
		btnInsert.doClick();
		txtNumero.setText("5");
		btnInsert.doClick();
		txtNumero.setText("3");
		btnInsert.doClick();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		Object o = ae.getSource();
		if (o == btnInsert || o == txtNumero) {
			if (txtNumero.getText().isEmpty()) {
				JOptionPane.showMessageDialog(this,(String)"Prueba de Cuadros de Diálogo","Cuadro de Diálogo Mensaje",JOptionPane.INFORMATION_MESSAGE,null);
			}
			else {
				Integer valor = Integer.parseInt(this.txtNumero.getText());
				if (dlm.contains(valor)) {
					JOptionPane.showMessageDialog(this,(String)"Prueba de Cuadros de Diálogo","Cuadro de Diálogo Mensaje",JOptionPane.INFORMATION_MESSAGE,null);
				}
				else {
					dlm.addElement(valor);
				}
			}			
		}
		else if (o == btnClear) {
			dlm.clear();
		}
	}
}
