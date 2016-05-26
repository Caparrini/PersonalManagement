package view;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import controller.MainController;
/**
 *
 * @author Capa
 */

@SuppressWarnings("serial")
public class LoginView extends javax.swing.JFrame {
	private MainController controlador;
    /**
     * Creates new form LoginView
     * @param controlador 
     */
    public LoginView(MainController controlador) {
    	this.controlador = controlador;
        initComponents();
    }
    private void initComponents() {

        jLabelDNI = new javax.swing.JLabel();
        jLabelPass = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonCancel = new javax.swing.JButton();
        jButtonLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Personal Management");
        setMaximumSize(new java.awt.Dimension(369, 108));
        setMinimumSize(new java.awt.Dimension(369, 108));

        setName("Login");

        jLabelDNI.setText("DNI: ");

        jLabelPass.setText("Contrase\u00f1a:");

        jTextFieldDNI.setText("DNI de usuario");

        jPasswordField.setText("jPasswordFi");
        jPasswordField.addActionListener(
        		new AbstractAction(){
        			@Override
        			public void actionPerformed(ActionEvent e){
        				jButtonLoginActionPerformed(e);
        			}
        		});

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonLogin.setText("Entrar");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelDNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDNI)
                            .addComponent(jPasswordField)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldDNI)
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        setResizable(false);
        pack();
        setLocationRelativeTo(null);


    }

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {
    	System.exit(DISPOSE_ON_CLOSE);
    }

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {

        String currentDNI = jTextFieldDNI.getText();

		if(!controlador.validaDNI(currentDNI)){
        	JOptionPane.showMessageDialog(this,
        	"DNI introducido es inv\u00e1lido.",
        	"DNI inválido",
        	JOptionPane.WARNING_MESSAGE);
        }

        else if(!controlador.userExist(currentDNI)){
        	JOptionPane.showMessageDialog(this,
        	"Usuario inexistente.",
        	"No dado de alta",
        	JOptionPane.WARNING_MESSAGE);
        }
        else if(!controlador.comparePassword(currentDNI,jPasswordField.getPassword())){
        	JOptionPane.showMessageDialog(this,
        	"Contrase\u00f1a incorrecta.",
        	"La contrase\u00f1a introducida no es correcta",
        	JOptionPane.WARNING_MESSAGE);
        }

        else{
        	JOptionPane.showMessageDialog(this,
        	"Usuario existente.",
        	"DNI CORRECTO",
        	JOptionPane.INFORMATION_MESSAGE);
        	controlador.initModelFromDB();
            new PMMainFrame(controlador).setVisible(true);
            this.setVisible(false);

        }

    }


    // Variables declaration - do not modify
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldDNI;
    // End of variables declaration
}
