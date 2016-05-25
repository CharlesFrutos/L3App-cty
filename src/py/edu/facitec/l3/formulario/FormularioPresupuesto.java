package py.edu.facitec.l3.formulario;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class FormularioPresupuesto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FormularioPresupuesto dialog = new FormularioPresupuesto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FormularioPresupuesto() {
		setBounds(100, 100, 482, 369);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblCodigoDelProducto = new JLabel("Codigo del Producto:");
		lblCodigoDelProducto.setBounds(10, 11, 123, 14);
		contentPanel.add(lblCodigoDelProducto);
		
		textField = new JTextField();
		textField.setBounds(145, 8, 86, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblProducto = new JLabel("Producto: ");
		lblProducto.setBounds(10, 50, 86, 14);
		contentPanel.add(lblProducto);
		
		textField_1 = new JTextField();
		textField_1.setBounds(126, 47, 172, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblFormaDePago = new JLabel("Forma de Pago:");
		lblFormaDePago.setBounds(10, 130, 106, 14);
		contentPanel.add(lblFormaDePago);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Contado", "Credito", "Cheque"}));
		comboBox.setBounds(121, 127, 91, 20);
		contentPanel.add(comboBox);
		
		JLabel lblCantidad = new JLabel("Cantidad: ");
		lblCantidad.setBounds(10, 175, 91, 14);
		contentPanel.add(lblCantidad);
		
		textField_2 = new JTextField();
		textField_2.setBounds(126, 172, 86, 20);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio: ");
		lblPrecio.setBounds(10, 225, 46, 17);
		contentPanel.add(lblPrecio);
		
		textField_3 = new JTextField();
		textField_3.setBounds(126, 223, 86, 20);
		contentPanel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setBounds(10, 85, 46, 14);
		contentPanel.add(lblCliente);
		
		textField_4 = new JTextField();
		textField_4.setBounds(103, 82, 200, 20);
		contentPanel.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 271, 402, 39);
		contentPanel.add(panel);
		
		JButton button = new JButton("Guardar");
		panel.add(button);
		
		JButton button_1 = new JButton("Modificar");
		panel.add(button_1);
		
		JButton button_2 = new JButton("Eliminar");
		panel.add(button_2);
		
		JButton button_3 = new JButton("Salir");
		panel.add(button_3);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
}
