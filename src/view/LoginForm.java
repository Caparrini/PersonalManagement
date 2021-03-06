package view;

import java.awt.Frame;

import javax.swing.JDialog;

import controller.MainController;
import model.users.User;

/**
 *
 * @author ivanc
 */
@SuppressWarnings("serial")
public class LoginForm extends javax.swing.JDialog {

    /**
     * Creates new form LoginForm
     */
    public LoginForm(MainController ctrl,Frame owner, boolean modal) {
    	super(owner,"Datos de trabajador",modal);
    	controlador=ctrl;
        initComponents();
        disableComponents();
    }

    private void disableComponents() {
    	if(!this.controlador.getAdminSession()){
    	    vacacionesJTextField.setEditable(false);
	        apellidosPerfilJTextField.setEditable(false);
	        contratosPerfilJComboBox.setEnabled(false);
	        departamentoPerfilJTextField.setEditable(false);
	        dniPerfilJTextField.setEnabled(false);
	        emailPerfilJTextField.setEditable(false);
	        esAdminPerfilJComboBox.setEnabled(false);
	        facultadPerfilJTextField.setEditable(false);
	        nacimienoPerfilJTextField.setEnabled(false);
	        nombrePerfilJTextField.setEditable(false);
    	}
	}

    private void initComponents() {

        panelFoto = new javax.swing.JPanel();
        fotoPerfilJLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nombrePerfilJTextField = new javax.swing.JTextField();
        apellidosPerfilJTextField = new javax.swing.JTextField();
        dniPerfilJTextField = new javax.swing.JTextField();
        emailPerfilJTextField = new javax.swing.JTextField();
        nacimienoPerfilJTextField = new javax.swing.JTextField();
        esAdminPerfilJComboBox = new javax.swing.JComboBox<>();
        facultadPerfilJTextField = new javax.swing.JTextField();
        departamentoPerfilJTextField = new javax.swing.JTextField();
        contratosPerfilJComboBox = new javax.swing.JComboBox<>();
        vacacionesJTextField = new javax.swing.JTextField();
    	User aux = controlador.getUserP();
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        
        //fotoPerfilJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/2000px-Crystal_Clear_app_Login_Manager.svg.png")));
        fotoPerfilJLabel.setText("jLabel1");
        fotoPerfilJLabel.setPreferredSize(new java.awt.Dimension(112, 107));

        javax.swing.GroupLayout panelFotoLayout = new javax.swing.GroupLayout(panelFoto);
        panelFoto.setLayout(panelFotoLayout);
        panelFotoLayout.setHorizontalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFotoLayout.createSequentialGroup()
                .addComponent(fotoPerfilJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 175, Short.MAX_VALUE))
        );
        panelFotoLayout.setVerticalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFotoLayout.createSequentialGroup()
                .addComponent(fotoPerfilJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("DNI:");

        jLabel5.setText("Facultad:");

        jLabel6.setText("Departamento:");

        jLabel7.setText("Vacaciones:");

        jLabel11.setText("Email:");

        jLabel1.setText("Nacimiento");

        jLabel8.setText("es Admin");

        jLabel9.setText("Contratos");

        nombrePerfilJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePerfilJTextFieldActionPerformed(evt);
            }
        });

        emailPerfilJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailPerfilJTextFieldActionPerformed(evt);
            }
        });

        esAdminPerfilJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario"}));

        contratosPerfilJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        if(aux.getIsAdmin()) {
        	esAdminPerfilJComboBox.setSelectedIndex(0);
        }else{
        	esAdminPerfilJComboBox.setSelectedIndex(1);
        }

        nombrePerfilJTextField.setText(aux.getName());
        apellidosPerfilJTextField.setText(aux.getPrename());;

        dniPerfilJTextField.setText(aux.getDNI());;
        emailPerfilJTextField.setText(aux.getMail());

        nacimienoPerfilJTextField.setText(aux.getBirthDate().toString());;


        //facultadPerfilJTextField.setEditable(false);
        //departamentoPerfilJTextField.setEditable(false);
	    //vacacionesJTextField.setText(t);
        //contratosPerfilJComboBox.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(facultadPerfilJTextField)
                            .addComponent(departamentoPerfilJTextField)
                            .addComponent(contratosPerfilJComboBox, 0, 253, Short.MAX_VALUE)
                            .addComponent(vacacionesJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nombrePerfilJTextField)
                        .addComponent(apellidosPerfilJTextField)
                        .addComponent(dniPerfilJTextField)
                        .addComponent(emailPerfilJTextField)
                        .addComponent(nacimienoPerfilJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                    .addComponent(esAdminPerfilJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombrePerfilJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidosPerfilJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dniPerfilJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(emailPerfilJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nacimienoPerfilJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(esAdminPerfilJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(facultadPerfilJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(departamentoPerfilJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(vacacionesJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contratosPerfilJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setResizable(false);
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nombrePerfilJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePerfilJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePerfilJTextFieldActionPerformed

    private void emailPerfilJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailPerfilJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailPerfilJTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidosPerfilJTextField;
    private javax.swing.JComboBox<String> contratosPerfilJComboBox;
    private javax.swing.JTextField departamentoPerfilJTextField;
    private javax.swing.JTextField dniPerfilJTextField;
    private javax.swing.JTextField emailPerfilJTextField;
    private javax.swing.JComboBox<String> esAdminPerfilJComboBox;
    private javax.swing.JTextField facultadPerfilJTextField;
    private javax.swing.JLabel fotoPerfilJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nacimienoPerfilJTextField;
    private javax.swing.JTextField nombrePerfilJTextField;
    private javax.swing.JPanel panelFoto;
    private javax.swing.JTextField vacacionesJTextField;
    private MainController controlador;
    // End of variables declaration//GEN-END:variables
}
