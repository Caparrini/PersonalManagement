package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class UserView extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserView() {
		
		super("UCM PERSONAL MANAGEMENT");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setSize(1000,500);
		this.setResizable(false);
		
		
		JPanel pnl = new JPanel();
		JPanel pnl2 = new JPanel();
	    this.getContentPane().add(pnl2);
	   	pnl.setLayout(new BorderLayout());
	   	pnl2.setLayout(new BorderLayout());
	   	pnl2.add(new JLabel("UCM PERSONAL MANAGEMENT",SwingConstants.CENTER),BorderLayout.NORTH);
	   	MiMenuListener menuLst = new MiMenuListener();
		JMenuBar menuBar = new JMenuBar();
		Color bg = Color.WHITE;
		menuBar.setBackground(bg );
		pnl2.add(menuBar,BorderLayout.CENTER);
		
	   	
	
		
		
		MiMenuListener menuLst2 = new MiMenuListener();
		JPanel menuBar2 = new JPanel();
		menuBar2.setLayout(new GridLayout(5,1,5,5));
		Color bg3 = Color.WHITE;
		menuBar2.setBackground(bg3);
		pnl2.add(menuBar2,BorderLayout.WEST);
		
		JButton nomina = new JButton("Nomina");
		menuBar2.add(nomina);
		nomina.setBackground(bg3);
		nomina.addActionListener(menuLst2);
		
		JButton baja = new JButton("Baja");
		menuBar2.add(baja);
		baja.setBackground(bg3);
		baja.addActionListener(menuLst2);
		
		JButton vac = new JButton("Vacaciones");
		menuBar2.add(vac);
		vac.setBackground(bg3);
		vac.addActionListener(menuLst2);
		
		JButton cont = new JButton("Contrato");
		menuBar2.add(cont);
		cont.setBackground(bg3);
		cont.addActionListener(menuLst2);
		
		JButton mc = new JButton("Modificar Cuenta");
		menuBar2.add(mc);
		mc.setBackground(bg3);
		mc.addActionListener(menuLst2);
		
		JLabel usuario = new JLabel("Nombre Apellido1 Apellido2");
		menuBar.add(usuario);	
		
	
		
		JButton button = new JButton("Perfil");
		Color bg2 = Color.WHITE;
		button.setBackground(bg2);
		button.addActionListener(menuLst);
		JButton button2 = new JButton("Cerrar Sesión");
		button2.setBackground(bg2);
		CerrarListener menuLst3 = new CerrarListener();
		button2.addActionListener(menuLst3);
		Calendar calendario = Calendar.getInstance();
		
		
		int hora = calendario.get(Calendar.HOUR_OF_DAY);
		int minutos = calendario.get(Calendar.MINUTE);
		int segundos = calendario.get(Calendar.SECOND);
		
		JLabel horas = new JLabel(hora+":"+minutos+":"+segundos);
		menuBar.add(button);
		menuBar.add(button2);
		menuBar.add(horas);
		
		menuBar2.add(mc);
		menuBar2.add(cont);
		menuBar2.add(nomina);
		menuBar2.add(baja);
		menuBar2.add(vac);
		
		
		pnl2.add(menuBar,BorderLayout.CENTER);
		
		pnl.add(menuBar2,BorderLayout.WEST);
		pnl.add(new JLabel("PERFIL Y ESAS MIERDAS",SwingConstants.CENTER),BorderLayout.CENTER);
		pnl.add(pnl2,BorderLayout.NORTH);
		
		
		
		this.add(pnl);
		
		
		
	}

	private class MiMenuListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(
					UserView.this, 
					"Se ha pulsado en la opción de menú: " + e.getActionCommand(), 
					"Información del menú", 
					JOptionPane.DEFAULT_OPTION);			
		}
	}
	
	private class CerrarListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {	
			UserView.this.dispose();
		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				UserView v = new UserView();
				v.setVisible(true);
			}});
	}
}
