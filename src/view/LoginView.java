package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LoginView extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel bannerLabel;
	private JLabel imagePanel;
	private JPanel loginPanel;
	
	private JTextField user;
	private JTextField pass;
	
	private JButton btnLogin;
	private JButton btnSalir;
	
	public LoginView(){
		super("Portal de Acceso");
		this.setSize(640, 480);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initGUI();
	}

	private void initGUI() {

		this.getContentPane().setLayout(new BorderLayout());
		
			initBannerPanel();
		
			initImagePanel();
		
			initLoginPanel();
		
	}
	
	private void initBannerPanel(){
		
			this.bannerLabel = new JLabel("Aqui iria el banner de la UCM");
			bannerLabel.setSize(640, 150);
			bannerLabel.setBackground(Color.RED);
			bannerLabel.setOpaque(true);
			
		this.getContentPane().add(bannerLabel,BorderLayout.NORTH);
	}
	
	private void initImagePanel(){
		
			this.imagePanel = new JLabel("Aqui iria la imagen del portal de acceso");
			imagePanel.setBackground(Color.BLUE);
			imagePanel.setOpaque(true);
		
		this.getContentPane().add(imagePanel,BorderLayout.WEST);
	}
	
	private void initLoginPanel(){
		
			this.loginPanel = new JPanel();
			loginPanel.setLayout(new GridLayout(5, 3, 10, 10));
			
				loginPanel.add(new JLabel("Usuario:"));
				
					user = new JTextField();
					user.setPreferredSize(new Dimension(70,25));
					
				loginPanel.add(user);
				
				loginPanel.add(new JLabel("Contrase�a:"));
				
					pass = new JTextField();
					pass.setPreferredSize(new Dimension(70,25));
				
				loginPanel.add(pass);
				
				JPanel pnlBotones = new JPanel();
				pnlBotones.setLayout(new GridLayout(1,2,5,5));
				
					btnLogin = new JButton("Login");
					//btnLogin.addActionListener(new AccionCalcular());
				
				pnlBotones.add(btnLogin);
				
					btnSalir = new JButton("Salir");
					btnSalir.addActionListener(new ActionListener() {
						
						public void actionPerformed(ActionEvent event) {
							LoginView.this.dispose(); //para cerrar la ventana
						}
						
					});
					
				pnlBotones.add(btnSalir);
		
			loginPanel.add(pnlBotones);
			
		this.getContentPane().add(loginPanel);
		
	}
	
	//TESTING MAIN
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new LoginView();
			}
		});

	}
}
