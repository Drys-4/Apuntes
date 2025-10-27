package evaluacion1;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;

public class VentanaParImpar extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JTextField txtnumero;

	/**
	 * Create the panel.
	 */
	public VentanaParImpar() {
		
		JPanel panel = new JPanel();
		add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Introduce un numero:");
		panel.add(lblNewLabel_1);
		
		txtnumero = new JTextField();
		txtnumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtnumero.setText("0");
		panel.add(txtnumero);
		txtnumero.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular Par Impar");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n;
				n = Integer.parseInt(txtNumro.getText());
				
				if (n % 2 == 0) {
					lblMensaje.setText("El valor "+n+" es par");
				} else {
					lblMensaje.setText("El valor "+n+" es par");
				}
			}
		}
		panel.add(btnCalcular);
		
		JLabel lblNewLabel = new JLabel("No se ha introduciodo un numero");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		add(lblNewLabel);

	}

}
