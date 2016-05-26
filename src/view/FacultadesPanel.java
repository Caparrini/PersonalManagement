package view;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import controller.MainController;
import model.Department;
import model.Faculty;

/**
 *
 * @author Capa
 */
@SuppressWarnings("serial")
public class FacultadesPanel extends javax.swing.JPanel {

    /**
     * Creates new form FacultadesPanel
     */
    public FacultadesPanel(MainController ctrl) {
    	this.controlador = ctrl;
        initComponents();
    }
    @SuppressWarnings({ })
    private void initComponents() {

        jButtonSearch = new javax.swing.JButton();
        jTextFieldSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListFaculty = new javax.swing.JList<Faculty>();
        jTextFieldFaculty = new javax.swing.JTextField();
        jButtonAddFaculty = new javax.swing.JButton();
        jButtonDeleteFaculty = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListDepartments = new javax.swing.JList<Department>();
        jButtonAddDepartment = new javax.swing.JButton();
        jTextFieldDepartmentName = new javax.swing.JTextField();
        jButtonDeleteDepartment = new javax.swing.JButton();

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

        jListFaculty.setModel(controlador.getFacultyModel());

        jListFaculty.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int index = jListFaculty.locationToIndex(e.getPoint());
                    controlador.changeFacultyFocus(index);
                    controlador.changeDepartmentsModel(index);
                    updateList();
                }
            }
        });
        jScrollPane1.setViewportView(jListFaculty);

        jTextFieldFaculty.setText("Facultad para a\u00f1adir...");
        jTextFieldFaculty.addActionListener(
        		new AbstractAction()
        		{
        		    @Override
        		    public void actionPerformed(ActionEvent e)
        		    {
                        jButtonAddFacultyActionPerformed(e);
        		    }
        		}
            );

        jButtonAddFaculty.setText("A\u00f1adir facultad");
        jButtonAddFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddFacultyActionPerformed(evt);
            }
        });

        jButtonDeleteFaculty.setText("Eliminar Facultad Seleccionada");
        jButtonDeleteFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteFacultyActionPerformed(evt);
            }
        });

        jListDepartments.setModel(controlador.getDepartmentsModel());
        jScrollPane2.setViewportView(jListDepartments);

        jButtonAddDepartment.setText("A\u00f1adir Departamento");
        jButtonAddDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddDepartmentActionPerformed(evt);
            }
        });

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

        jButtonDeleteDepartment.setText("Eliminar Departamento Seleccionado");
        jButtonDeleteDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteDepartmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTextFieldSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSearch))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jTextFieldDepartmentName)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonAddDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonDeleteDepartment))
                                .addGap(0, 244, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldFaculty)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAddFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonDeleteFaculty)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearch)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDeleteDepartment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAddDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeleteFaculty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAddFaculty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldFaculty)))
        );
    }
    protected void jButtonSearchActionPerformed(ActionEvent evt) {
		String filter = jTextFieldSearch.getText();
		jListFaculty.removeAll();
		controlador.facultysFromDBToModel(filter);
		jListFaculty.setModel(controlador.getFacultyModel());
		jListDepartments.removeAll();
		jListDepartments.repaint();
		jListFaculty.repaint();
	}

	protected void jButtonAddDepartmentActionPerformed(ActionEvent evt) {
        int index = jListFaculty.getSelectedIndex();
        String nd = jTextFieldDepartmentName.getText();
        Department aux = new Department();
        aux.setNameDepartment(nd);
        controlador.addDepartmentToFaculty(aux,index);
        controlador.changeDepartmentsModel(index);
        jListDepartments.removeAll();
        jListDepartments.setModel(controlador.getDepartmentsModel());
        jListDepartments.repaint();
	}

	protected void jButtonAddFacultyActionPerformed(ActionEvent evt) {
        String nf = jTextFieldFaculty.getText();
        Faculty aux = new Faculty();
        aux.setName(nf);
        controlador.insertFaculty(aux);
        jListDepartments.setModel(controlador.getDepartmentsModel());
        jListFaculty.repaint();
	}

	protected void jButtonDeleteDepartmentActionPerformed(ActionEvent evt) {
        int index = jListFaculty.getSelectedIndex();
        int dindex = jListDepartments.getSelectedIndex();
        controlador.deleteDepartment(index,dindex);
        controlador.changeDepartmentsModel(index);
        jListDepartments.removeAll();
        jListDepartments.setModel(controlador.getDepartmentsModel());
        jListDepartments.repaint();
	}

	protected void jButtonDeleteFacultyActionPerformed(ActionEvent evt) {
        int index = jListFaculty.getSelectedIndex();
        controlador.deleteFaculty(index);
        jListDepartments.removeAll();
        jListDepartments.setModel(controlador.getDepartmentsModel());
        jListDepartments.repaint();
        jListFaculty.repaint();
	}
	public void updateList() {
        jListDepartments.removeAll();
        jListDepartments.setModel(controlador.getDepartmentsModel());
        jListFaculty.repaint();
	}
	// Variables declaration - do not modify                     
    private MainController controlador;
    private javax.swing.JButton jButtonAddFaculty;
    private javax.swing.JButton jButtonDeleteDepartment;
    private javax.swing.JButton jButtonDeleteFaculty;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JList<Department> jListDepartments;
    private javax.swing.JList<Faculty> jListFaculty;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jButtonAddDepartment;
    private javax.swing.JTextField jTextFieldDepartmentName;
    private javax.swing.JTextField jTextFieldFaculty;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration                   

}
