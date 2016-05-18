package py.edu.facitec.l3.model;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Categoria extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Categoria dialog = new Categoria();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Categoria() {
		setBounds(100, 100, 627, 370);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo :");
		lblCodigo.setBounds(24, 25, 72, 18);
		contentPanel.add(lblCodigo);
		
		textField = new JTextField();
		textField.setBounds(133, 24, 86, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setBounds(24, 65, 86, 14);
		contentPanel.add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(135, 62, 231, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAbreviatura = new JLabel("Abreviatura :");
		lblAbreviatura.setBounds(24, 117, 101, 14);
		contentPanel.add(lblAbreviatura);
		
		textField_2 = new JTextField();
		textField_2.setBounds(133, 114, 142, 17);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado :");
		lblEstado.setBounds(24, 174, 46, 14);
		contentPanel.add(lblEstado);
		
		JRadioButton rdbtnActivo = new JRadioButton("Activo");
		rdbtnActivo.setBounds(133, 170, 72, 23);
		contentPanel.add(rdbtnActivo);
		
		JRadioButton rdbtnInactivo = new JRadioButton("Inactivo");
		rdbtnInactivo.setBounds(217, 170, 109, 23);
		contentPanel.add(rdbtnInactivo);
		
		JLabel lblFechaRegistro = new JLabel("Fecha Registro :");
		lblFechaRegistro.setBounds(24, 233, 86, 14);
		contentPanel.add(lblFechaRegistro);
	}
}
