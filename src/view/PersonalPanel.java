package view;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import controller.MainController;
import model.users.User;

/**
 *
 * @author Capa
 */
@SuppressWarnings("serial")
public class PersonalPanel extends javax.swing.JPanel {

    /**
     * Creates new form PersonalPanel
     */
    public PersonalPanel(MainController controlador) {
    	this.controlador = controlador;
        initComponents();
    }
    private void initComponents() {

        jTextFieldSearch = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListWorkers = new javax.swing.JList<User>();

        jButtonSearch.setText("Buscar");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jTextFieldSearch.setText("B\u00fasqueda...");
        jTextFieldSearch.addActionListener(
        		new AbstractAction()
        		{
        		    @Override
        		    public void actionPerformed(ActionEvent e)
        		    {
                        jButtonSearchActionPerformed(e);
        		    }
        		}
            );
        jListWorkers.setModel(controlador.getWorkersModel());
        jScrollPane1.setViewportView(jListWorkers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1)
                            .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextFieldSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }
    protected void jButtonSearchActionPerformed(ActionEvent evt) {
		String filter = jTextFieldSearch.getText();
		jListWorkers.removeAll();
		controlador.workersFromDBToModel(filter);
		jListWorkers.setModel(controlador.getWorkersModel());
		jListWorkers.repaint();
	}
    // Variables declaration - do not modify                     
    private MainController controlador;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JList<User> jListWorkers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration                   
}