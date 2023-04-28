package front;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.UIManager;

public class Eliminar extends JPanel {

	/**
	 * Create the panel.
	 */
	public Eliminar() {
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

	}

}
