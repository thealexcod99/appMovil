package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VistaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtContrasea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaLogin frame = new VistaLogin();
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
	public VistaLogin() {
		setTitle("appMovil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(195, 12, 67, 32);
		contentPane.add(lblLogin);
		
		txtUsuario = new JTextField();
		txtUsuario.setText("Usuario");
		txtUsuario.setBounds(163, 64, 124, 19);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContrasea = new JTextField();
		txtContrasea.setText("Contraseña");
		txtContrasea.setBounds(163, 113, 124, 19);
		contentPane.add(txtContrasea);
		txtContrasea.setColumns(10);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(163, 166, 114, 25);
		contentPane.add(btnIniciar);
		
		JButton btnInvitado = new JButton("Invitado");
		btnInvitado.setBounds(302, 215, 114, 25);
		contentPane.add(btnInvitado);
	}
}
