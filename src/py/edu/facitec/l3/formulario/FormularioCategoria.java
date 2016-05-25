package py.edu.facitec.l3.formulario;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class FormularioCategoria extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tfCodigo;
	private JTextField tfNombre;
	private JTextField tfAbreviatura;
	private JTextField tfFechaRegistro;
	private JRadioButton rdActivo;
	private JButton btnGuardar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FormularioCategoria dialog = new FormularioCategoria();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FormularioCategoria() {
		setBounds(100, 100, 517, 370);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel labelCodigo = new JLabel("Codigo :");
		labelCodigo.setBounds(24, 25, 72, 18);
		contentPanel.add(labelCodigo);
		
		tfCodigo = new JTextField();
		tfCodigo.setBounds(133, 24, 86, 20);
		contentPanel.add(tfCodigo);
		tfCodigo.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setBounds(24, 65, 86, 14);
		contentPanel.add(lblNombre);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(135, 62, 231, 20);
		contentPanel.add(tfNombre);
		tfNombre.setColumns(10);
		
		JLabel lblAbreviatura = new JLabel("Abreviatura :");
		lblAbreviatura.setBounds(24, 117, 101, 14);
		contentPanel.add(lblAbreviatura);
		
		tfAbreviatura = new JTextField();
		tfAbreviatura.setBounds(133, 114, 142, 17);
		contentPanel.add(tfAbreviatura);
		tfAbreviatura.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado :");
		lblEstado.setBounds(24, 174, 46, 14);
		contentPanel.add(lblEstado);
		
		rdActivo = new JRadioButton("Activo");
		rdActivo.setBounds(133, 170, 72, 23);
		contentPanel.add(rdActivo);
		
		JRadioButton rdInactivo = new JRadioButton("Inactivo");
		rdInactivo.setBounds(217, 170, 109, 23);
		contentPanel.add(rdInactivo);
		
		JLabel lblFechaRegistro = new JLabel("Fecha Registro :");
		lblFechaRegistro.setBounds(24, 233, 86, 14);
		contentPanel.add(lblFechaRegistro);
		
		tfFechaRegistro = new JTextField();
		tfFechaRegistro.setBounds(119, 230, 86, 20);
		contentPanel.add(tfFechaRegistro);
		tfFechaRegistro.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(34, 268, 450, 39);
		contentPanel.add(panel);
		
		btnGuardar = new JButton("Guardar");
		panel.add(btnGuardar);
		
		btnModificar = new JButton("Modificar");
		panel.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		panel.add(btnEliminar);
		
		btnSalir = new JButton("Salir");
		panel.add(btnSalir);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(339, 20, 89, 23);
		contentPanel.add(btnBuscar);
	}
}
