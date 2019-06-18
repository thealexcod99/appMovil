package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.controladorTablaRegistrados;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class vistaAniadirRegistrado extends JFrame {

	private JPanel contentPane;
	private JTextField textField_nombre;
	private JTextField textField_apellido;
	private JTextField textField_email;
	private JTextField textField_password;
	private JTextField textField_nick;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaAniadirRegistrado frame = new vistaAniadirRegistrado();
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
	public vistaAniadirRegistrado() {
		setTitle("appMovil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(45, 12, 66, 15);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(45, 50, 66, 15);
		contentPane.add(lblApellido);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(45, 87, 66, 15);
		contentPane.add(lblEmail);
		
		JLabel lblNewLabel = new JLabel("Contraseña:");
		lblNewLabel.setBounds(45, 123, 83, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNick = new JLabel("Nick:");
		lblNick.setBounds(45, 164, 66, 15);
		contentPane.add(lblNick);
		
		textField_nombre = new JTextField();
		textField_nombre.setBounds(186, 121, 212, 19);
		contentPane.add(textField_nombre);
		textField_nombre.setColumns(10);
		
		textField_apellido = new JTextField();
		textField_apellido.setBounds(186, 85, 212, 19);
		contentPane.add(textField_apellido);
		textField_apellido.setColumns(10);
		
		textField_email = new JTextField();
		textField_email.setBounds(186, 48, 212, 19);
		contentPane.add(textField_email);
		textField_email.setColumns(10);
		
		textField_password = new JTextField();
		textField_password.setBounds(186, 10, 212, 19);
		contentPane.add(textField_password);
		textField_password.setColumns(10);
		
		textField_nick = new JTextField();
		textField_nick.setBounds(186, 162, 212, 19);
		contentPane.add(textField_nick);
		textField_nick.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(239, 207, 114, 25);
		contentPane.add(btnAceptar);
	}

	public String getTextField_nombre() {
		return textField_nombre.getText();
	}

	public void setTextField_nombre(String texto) {
		textField_nombre.setText(texto);
	}

	public String getTextField_apellido() {
		return textField_apellido.getText();
	}

	public void setTextField_apellido(String texto) {
		textField_apellido.setText(texto);
	}

	public String getTextField_email() {
		return textField_email.getText();
	}

	public void setTextField_email(String texto) {
		textField_email.setText(texto);
	}

	public String getTextField_password() {
		return textField_password.getText();
	}

	public void setTextField_password(String texto) {
		textField_password.setText(texto);
	}

	public String getTextField_nick() {
		return textField_nick.getText();
	}

	public void setTextField_nick(String texto) {
		textField_nick.setText(texto);
	}
	
	
}
