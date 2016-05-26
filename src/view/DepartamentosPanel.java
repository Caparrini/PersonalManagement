package view;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import controller.MainController;
import model.Department;
import model.users.User;

/**
 *
 * @author Capa
 */
@SuppressWarnings("serial")
public class DepartamentosPanel extends javax.swing.JPanel {

    /**
     * Creates new form DepartamentosPanel
     */
    public DepartamentosPanel(MainController ctrl) {
    	controlador = ctrl;
        initComponents();
    }
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListDepartments = new javax.swing.JList<Department>();
        jTextFieldDepartmentName = new javax.swing.JTextField();
        jButtonAddDepartment = new javax.swing.JButton();
        jButtonDeleteDepartment = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListWorkers = new javax.swing.JList<User>();
        jButtonDeleteWorker = new javax.swing.JButton();
        jLabelFacultad = new javax.swing.JLabel();
        jButtonAddWorker = new javax.swing.JButton();

        jListDepartments.setModel(controlador.getDepartmentsModel());
        jScrollPane1.setViewportView(jListDepartments);

        jTextFieldDepartmentName.setText("Departamento para a\u00f1adir...");
        jTextFieldDepartmentName.addActionListener(
        		new AbstractAction()
        		{
        		    @Override
        		    public void actionPerformed(ActionEvent e)
        		    {
        		    	jButtonAddDepartmentActionPerformed(e);
        		    }
        		}
            );

        jButtonAddDepartment.setText("A\u00f1adir Departamento");
        jButtonAddDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddDepartmentActionPerformed(evt);
            }
        });

        jButtonDeleteDepartment.setText("Eliminar Departamento Seleccionada");
        jButtonDeleteDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteDepartmentActionPerformed(evt);
            }
        });

        jListWorkers.setModel(controlador.getWorkersModel());
        jScrollPane2.setViewportView(jListWorkers);

        jButtonDeleteWorker.setText("Eliminar Trabajador Seleccionado");
        jButtonDeleteWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteWorkerActionPerformed(evt);
            }
        });

        jLabelFacultad.setText("Facultad");

        jButtonAddWorker.setText("A\u00f1adir Trabajador");
        jButtonAddWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddWorkerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonDeleteWorker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonAddWorker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 244, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldDepartmentName)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAddDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonDeleteDepartment)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelFacultad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDeleteWorker)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(jButtonAddWorker))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeleteDepartment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAddDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldDepartmentName)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void jButtonDeleteWorkerActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void jButtonAddWorkerActionPerformed(java.awt.event.ActionEvent evt) {
    	// TODO debe mostrar la ventana recientemente creada para añadir asi un usuario nuevo
        LoginForm loginForm = new LoginForm(controlador, null, true);
        loginForm.setVisible(true);
    }                                                

    private void jButtonAddDepartmentActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        int index = controlador.getIndexSelectedFaculty();
        String nd = jTextFieldDepartmentName.getText();
        Department aux = new Department();
        aux.setNameDepartment(nd);
        controlador.addDepartmentToFaculty(aux,index);
        controlador.changeDepartmentsModel(index);
        jListDepartments.removeAll();
        jListDepartments.setModel(controlador.getDepartmentsModel());
        jListDepartments.repaint();
    }

    private void jButtonDeleteDepartmentActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        int index = controlador.getIndexSelectedFaculty();
        int dindex = jListDepartments.getSelectedIndex();
        controlador.deleteDepartment(index,dindex);
        controlador.changeDepartmentsModel(index);
        jListDepartments.removeAll();
        jListDepartments.setModel(controlador.getDepartmentsModel());
        jListDepartments.repaint();
    }
	public void updateList() {
        jLabelFacultad.setText(controlador.getFacultyModel().getElementAt(controlador.getIndexSelectedFaculty()).toString());
        jListDepartments.setModel(controlador.getDepartmentsModel());
	}

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonAddDepartment;
    private javax.swing.JButton jButtonAddWorker;
    private javax.swing.JButton jButtonDeleteDepartment;
    private javax.swing.JButton jButtonDeleteWorker;
    private javax.swing.JLabel jLabelFacultad;
    private javax.swing.JList<Department> jListDepartments;
    private javax.swing.JList<User> jListWorkers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldDepartmentName;
    private MainController controlador;
    // End of variables declaration                   
}
