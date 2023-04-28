package front;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.UIManager;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CrearTabla extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JTextField textFCCampos;
	private JLabel lblCampos;
	private JButton btnMostrar;
	private JLabel lblNombreTabla;
	private JTextField txtTabla;
	private JButton btnCrearTabla;

	public CrearTabla() {
		setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 100));
		panel.setMinimumSize(new Dimension(40, 40));
		panel.setBackground(UIManager.getColor("FormattedTextField.inactiveForeground"));
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.CENTER);
		
		lblNombreTabla = new JLabel("Nombre Tabla");
		panel_3.add(lblNombreTabla);
		
		txtTabla = new JTextField();
		txtTabla.setText("tabla");
		panel_3.add(txtTabla);
		txtTabla.setColumns(10);
		
		panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(150, 10));
		panel.add(panel_4, BorderLayout.EAST);
		
		lblCampos = new JLabel("Campos");
		panel_4.add(lblCampos);
		
		textFCCampos = new JTextField();
		panel_4.add(textFCCampos);
		textFCCampos.setColumns(10);
		
		btnMostrar = new JButton("mostrar");
		panel_4.add(btnMostrar);
		
		panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("OptionPane.errorDialog.titlePane.background"));
		add(panel_1, BorderLayout.CENTER);
		
		panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(10, 70));
		panel_2.setBackground(UIManager.getColor("OptionPane.questionDialog.titlePane.background"));
		add(panel_2, BorderLayout.SOUTH);
		
		btnCrearTabla = new JButton("Crear Tabla");
		panel_2.add(btnCrearTabla);
		

	}


}
