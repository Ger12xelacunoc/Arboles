package front;

import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class IngresarDatos extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public IngresarDatos() {
		setBackground(UIManager.getColor("OptionPane.questionDialog.titlePane.background"));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 100));
		add(panel, BorderLayout.NORTH);
		
		JLabel lblTabla = new JLabel("Tabla");
		panel.add(lblTabla);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setPreferredSize(new Dimension(100, 24));
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 100));
		add(panel_1, BorderLayout.SOUTH);
		
		JButton btnAgregar = new JButton("Agregar");
		panel_1.add(btnAgregar);

	}

}
