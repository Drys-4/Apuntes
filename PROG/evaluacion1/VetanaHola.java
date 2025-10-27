package evaluacion1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLayeredPane;
import java.awt.Label;

public class VetanaHola extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VetanaHola frame = new VetanaHola();
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
	public VetanaHola() {
		setTitle("Hola");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 386, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

			{
				{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				getRootPane().setDefaultButton(okButton);
				}
				{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				}
			}
			
			JPanel panel = new JPanel();
			panel.setBounds(84, 84, 98, 58);
			contentPane.add(panel);
			
			Label label = new Label("New label");
			panel.add(label);
		}
		// Ejecuto la aplicacion
		public static void main(String[] args) {
		try {
			JDialogHola dialog = new JDialogHola();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} 
		catch (Exception e) {
				e.printStackTrace();
			}
	}
}
