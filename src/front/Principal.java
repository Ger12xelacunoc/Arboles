package front;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;

public class Principal extends JFrame implements ActionListener {
	
	private static final String CREAR = "CREAR"; 
	private static final String CARGAR = "CARGAR"; 
	private static final String ELIMINAR = "ELIMINAR"; 

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmCrearTabla;
	private JMenuItem mntmEliminar;
	private JMenu mnTablas;
	private JMenu mnDiagrama;
	private JPanel panel;


	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 793, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		menuBar = new JMenuBar();
		contentPane.add(menuBar, BorderLayout.NORTH);
		
		mnNewMenu = new JMenu("Carga de datos");
		menuBar.add(mnNewMenu);
		
		mntmCrearTabla = new JMenuItem("Crear tabla");
		mntmCrearTabla.setActionCommand(CREAR);
		mntmCrearTabla.addActionListener(this);
		mnNewMenu.add(mntmCrearTabla);
		
		JMenuItem mntmIngresarDatos = new JMenuItem("Ingresar datos");
		mntmIngresarDatos.setActionCommand(CARGAR);
		mntmIngresarDatos.addActionListener(this);
		mnNewMenu.add(mntmIngresarDatos);
		
		mntmEliminar = new JMenuItem("eliminar");
		mntmEliminar.setActionCommand(ELIMINAR);
		mntmEliminar.addActionListener(this);
		mnNewMenu.add(mntmEliminar);
		
		mnTablas = new JMenu("tablas");
		menuBar.add(mnTablas);
		
		mnDiagrama = new JMenu("Diagrama");
		menuBar.add(mnDiagrama);
		
		panel = new JPanel();
		panel.setBackground(UIManager.getColor("OptionPane.warningDialog.titlePane.background"));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new CardLayout(0, 0));
	}


	public void cambiar(JPanel a) {
		panel.removeAll();
		panel.add(a);
		panel.repaint();
		panel.revalidate();
		
	}
	CrearTabla a = new CrearTabla();
	IngresarDatos b = new IngresarDatos();
	Eliminar c = new Eliminar();
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getActionCommand().equals(CREAR)) {
			cambiar(a);
		}else if(evento.getActionCommand().equals(CARGAR)){
			cambiar(b);
		}else if(evento.getActionCommand().equals(ELIMINAR)){
			cambiar(c);
		}
		
	}

	
}
