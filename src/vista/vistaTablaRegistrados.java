package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.controladorTablaRegistrados;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;

public class vistaTablaRegistrados extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private ModeloTablaRegistrados modeloRegistrados;
	private controladorTablaRegistrados controlador;
	private JScrollPane scrollPane;
	private JButton btnAniadir;
	private JButton btnCerrar;
	private JButton btnEliminar;
	private JButton btnActualizar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaTablaRegistrados frame = new vistaTablaRegistrados();
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
	public vistaTablaRegistrados() {
		setTitle("appMovil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 24, 416, 150);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnAniadir = new JButton("Añadir");
		btnAniadir.setActionCommand("ANIADIR");
		btnAniadir.setBounds(58, 186, 114, 25);
		contentPane.add(btnAniadir);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setActionCommand("CERRAR");
		btnCerrar.setBounds(264, 233, 114, 25);
		contentPane.add(btnCerrar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setActionCommand("ELIMINAR");
		btnEliminar.setBounds(58, 233, 114, 25);
		contentPane.add(btnEliminar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setActionCommand("ACTUALIZAR");
		btnActualizar.setBounds(264, 186, 114, 25);
		contentPane.add(btnActualizar);
	}
	
	public void setModelo(ModeloTablaRegistrados modelo) {
		this.table.setModel(modelo);
	}
	
	public JTable getTabla() {
		return table;
	}
	
	public void setControlador(controladorTablaRegistrados c) {
		table.addMouseListener(c);
		btnCerrar.addActionListener(c);
		btnAniadir.addActionListener(c);
		btnEliminar.addActionListener(c);
		btnActualizar.addActionListener(c);
	}
}
