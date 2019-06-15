package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class vistaAdministradorUsuarios extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaAdministradorUsuarios frame = new vistaAdministradorUsuarios();
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
	public vistaAdministradorUsuarios() {
		setTitle("appMovil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRegistrados = new JButton("Registrados");
		btnRegistrados.setBounds(143, 30, 158, 25);
		contentPane.add(btnRegistrados);
		
		JButton btnAdministradores = new JButton("Administradores");
		btnAdministradores.setBounds(143, 98, 158, 25);
		contentPane.add(btnAdministradores);
		
		JButton btnInvitado = new JButton("Invitado");
		btnInvitado.setBounds(143, 172, 158, 25);
		contentPane.add(btnInvitado);
	}

}
