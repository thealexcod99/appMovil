package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class vistaTablaInvitado extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaTablaInvitado frame = new vistaTablaInvitado();
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
	public vistaTablaInvitado() {
		setTitle("appMovil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(314, 233, 114, 25);
		contentPane.add(btnCerrar);
		
		JButton btnActivar = new JButton("Activar");
		btnActivar.setBounds(314, 143, 114, 25);
		contentPane.add(btnActivar);
		
		JButton btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setBounds(314, 180, 114, 25);
		contentPane.add(btnDesactivar);
	}

}
