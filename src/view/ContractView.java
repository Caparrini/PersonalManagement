/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

import controller.MainController;
import model.Contract;

/**
 *
 * @author jdelcano
 */
@SuppressWarnings("serial")
public class ContractView extends javax.swing.JPanel {
    
    private MainController mc;
    
    private Contract contractData;

    /**
     * Creates new form NewJPanel
     */
    public ContractView(MainController mc) {
    	this.mc = mc;
        initComponents();
        disableComponents();
    }
                         
    private void initComponents() {

        p_datosEmpleado = new javax.swing.JPanel();
        p_dni = new javax.swing.JPanel();
        l_dni = new javax.swing.JLabel();
        t_dni = new javax.swing.JTextField();
        b_dni = new javax.swing.JButton();
        p_id = new javax.swing.JPanel();
        l_id = new javax.swing.JLabel();
        t_id = new javax.swing.JTextField();
        b_id = new javax.swing.JButton();
        p_categoria = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        t_categoria = new javax.swing.JTextField();
        b_categoria = new javax.swing.JButton();
        p_datosContrato = new javax.swing.JPanel();
        p_departamento = new javax.swing.JPanel();
        l_departamento = new javax.swing.JLabel();
        t_departamento = new javax.swing.JTextField();
        b_departamento = new javax.swing.JButton();
        p_convenio = new javax.swing.JPanel();
        l_convenio = new javax.swing.JLabel();
        t_convenio = new javax.swing.JTextField();
        b_convenio = new javax.swing.JButton();
        p_duracion = new javax.swing.JPanel();
        l_duracion = new javax.swing.JLabel();
        t_duracion = new javax.swing.JTextField();
        b_duracion = new javax.swing.JButton();
        p_tipo = new javax.swing.JPanel();
        l_tipo = new javax.swing.JLabel();
        t_tipo = new javax.swing.JTextField();
        b_tipo = new javax.swing.JButton();
        p_remuneracion = new javax.swing.JPanel();
        l_remuneracion = new javax.swing.JLabel();
        t_remuneracion = new javax.swing.JTextField();
        b_remuneracion = new javax.swing.JButton();
        p_vacaciones = new javax.swing.JPanel();
        l_vacaciones = new javax.swing.JLabel();
        t_vacaciones = new javax.swing.JTextField();
        b_vacaciones = new javax.swing.JButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        p_datosEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS EMPLEADO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        p_datosEmpleado.setLayout(new java.awt.GridLayout(3, 0));

        l_dni.setText("DNI: ");
        l_dni.setToolTipText("");

        //t_dni.setText(contractData.getWorker().getDNI());
        
        b_dni.setText("EDITAR");
        b_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_dniActionPerformed(evt);
            }
        });
     

        javax.swing.GroupLayout p_dniLayout = new javax.swing.GroupLayout(p_dni);
        p_dni.setLayout(p_dniLayout);
        p_dniLayout.setHorizontalGroup(
            p_dniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_dniLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_dni)
                .addGap(18, 18, 18)
                .addComponent(t_dni, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(b_dni)
                .addContainerGap())
        );
        p_dniLayout.setVerticalGroup(
            p_dniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_dniLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(p_dniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_dni)
                    .addComponent(l_dni))
                .addContainerGap())
        );

        p_datosEmpleado.add(p_dni);

        l_id.setText("ID CONTRATADO: ");

        //t_id.setText(Integer.toString(contractData.getIdContract()));

        b_id.setText("EDITAR");
        b_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_idLayout = new javax.swing.GroupLayout(p_id);
        p_id.setLayout(p_idLayout);
        p_idLayout.setHorizontalGroup(
            p_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_idLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_id)
                .addGap(18, 18, 18)
                .addComponent(t_id, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(b_id)
                .addContainerGap())
        );
        p_idLayout.setVerticalGroup(
            p_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_idLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(p_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_id)
                    .addComponent(l_id))
                .addContainerGap())
        );

        p_datosEmpleado.add(p_id);

        jLabel8.setText("CATEGOR\u00cdA PROFESIONAL: ");

        //t_categoria.setText(contractData.getJobLevel());

        b_categoria.setText("EDITAR");
        b_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_categoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_categoriaLayout = new javax.swing.GroupLayout(p_categoria);
        p_categoria.setLayout(p_categoriaLayout);
        p_categoriaLayout.setHorizontalGroup(
            p_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_categoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(25, 25, 25)
                .addComponent(t_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(b_categoria)
                .addContainerGap())
        );
        p_categoriaLayout.setVerticalGroup(
            p_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_categoriaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(p_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_categoria)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        p_datosEmpleado.add(p_categoria);

        add(p_datosEmpleado);

        p_datosContrato.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL CONTRATO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        p_datosContrato.setLayout(new java.awt.GridLayout(6, 0));

        l_departamento.setText("DEPARTAMENTO: ");

        //t_departamento.setText(contractData.getDepartment().getNameDepartment());

        b_departamento.setText("EDITAR");
        b_departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_departamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_departamentoLayout = new javax.swing.GroupLayout(p_departamento);
        p_departamento.setLayout(p_departamentoLayout);
        p_departamentoLayout.setHorizontalGroup(
            p_departamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_departamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_departamento)
                .addGap(18, 18, 18)
                .addComponent(t_departamento, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(b_departamento)
                .addContainerGap())
        );
        p_departamentoLayout.setVerticalGroup(
            p_departamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_departamentoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(p_departamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_departamento)
                    .addComponent(l_departamento))
                .addContainerGap())
        );

        p_datosContrato.add(p_departamento);

        l_convenio.setText("CONVENIO: ");

        //t_convenio.setText(contractData.getConvenio());

        
        b_convenio.setText("EDITAR");
        b_convenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_convenioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_convenioLayout = new javax.swing.GroupLayout(p_convenio);
        p_convenio.setLayout(p_convenioLayout);
        p_convenioLayout.setHorizontalGroup(
            p_convenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_convenioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_convenio)
                .addGap(18, 18, 18)
                .addComponent(t_convenio, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(b_convenio)
                .addContainerGap())
        );
        p_convenioLayout.setVerticalGroup(
            p_convenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_convenioLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(p_convenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_convenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_convenio)
                    .addComponent(l_convenio))
                .addContainerGap())
        );

        p_datosContrato.add(p_convenio);

        l_duracion.setText("DURACI\u00d3N: ");

        //t_duracion.setText(Integer.toString(contractData.getDuration()));
        
        b_duracion.setText("EDITAR");
        b_duracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_duracionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_duracionLayout = new javax.swing.GroupLayout(p_duracion);
        p_duracion.setLayout(p_duracionLayout);
        p_duracionLayout.setHorizontalGroup(
            p_duracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_duracionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_duracion)
                .addGap(18, 18, 18)
                .addComponent(t_duracion, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(b_duracion)
                .addContainerGap())
        );
        p_duracionLayout.setVerticalGroup(
            p_duracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_duracionLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(p_duracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_duracion)
                    .addComponent(l_duracion))
                .addContainerGap())
        );

        p_datosContrato.add(p_duracion);

        l_tipo.setText("TIPO: ");

        //t_tipo.setText(contractData.getType());

        b_tipo.setText("EDITAR");
        b_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_tipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_tipoLayout = new javax.swing.GroupLayout(p_tipo);
        p_tipo.setLayout(p_tipoLayout);
        p_tipoLayout.setHorizontalGroup(
            p_tipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_tipoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_tipo)
                .addGap(18, 18, 18)
                .addComponent(t_tipo, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(b_tipo)
                .addContainerGap())
        );
        p_tipoLayout.setVerticalGroup(
            p_tipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_tipoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(p_tipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_tipo)
                    .addComponent(l_tipo))
                .addContainerGap())
        );

        p_datosContrato.add(p_tipo);

        l_remuneracion.setText("REMUNERACI\u00d3N: ");

        //t_remuneracion.setText(Double.toString(contractData.getIncomeMoney()));

        b_remuneracion.setText("EDITAR");
        b_remuneracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_remuneracionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_remuneracionLayout = new javax.swing.GroupLayout(p_remuneracion);
        p_remuneracion.setLayout(p_remuneracionLayout);
        p_remuneracionLayout.setHorizontalGroup(
            p_remuneracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_remuneracionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_remuneracion)
                .addGap(18, 18, 18)
                .addComponent(t_remuneracion, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(b_remuneracion)
                .addContainerGap())
        );
        p_remuneracionLayout.setVerticalGroup(
            p_remuneracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_remuneracionLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(p_remuneracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_remuneracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_remuneracion)
                    .addComponent(l_remuneracion))
                .addContainerGap())
        );

        p_datosContrato.add(p_remuneracion);

        l_vacaciones.setText("VACACIONES: ");

        //t_vacaciones.setText(Integer.toString(contractData.getHolidays()));

        b_vacaciones.setText("EDITAR");
        b_vacaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_vacacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_vacacionesLayout = new javax.swing.GroupLayout(p_vacaciones);
        p_vacaciones.setLayout(p_vacacionesLayout);
        p_vacacionesLayout.setHorizontalGroup(
            p_vacacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_vacacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_vacaciones)
                .addGap(18, 18, 18)
                .addComponent(t_vacaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(b_vacaciones)
                .addContainerGap())
        );
        p_vacacionesLayout.setVerticalGroup(
            p_vacacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_vacacionesLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(p_vacacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_vacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_vacaciones)
                    .addComponent(l_vacaciones))
                .addContainerGap())
        );

        p_datosContrato.add(p_vacaciones);

        add(p_datosContrato);
    }// </editor-fold>         
    
    private void disableComponents(){
    	if(!this.mc.getAdminSession()){
    		t_dni.setEditable(false);
	        b_dni.setEnabled(false);
	        
	        t_id.setEditable(false);
	        b_id.setEnabled(false);
	        
	        t_categoria.setEditable(false);
	        b_categoria.setEnabled(false);
	        
	        t_tipo.setEditable(false);
	        b_tipo.setEnabled(false);
	        
	        t_departamento.setEditable(false);
	        b_departamento.setEnabled(false);
	        
	        t_convenio.setEditable(false);
	        b_convenio.setEnabled(false);
	        
	        t_duracion.setEditable(false);
	        b_duracion.setEnabled(false);
	        
	        t_remuneracion.setEditable(false);
	        b_remuneracion.setEnabled(false);
	        
	        t_vacaciones.setEditable(false);
	        b_vacaciones.setEnabled(false);
    	}
    }

	private void b_dniActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String text = t_dni.getText();
        this.contractData.getWorker().setDNI(text);
    }
	
	private void b_idActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String text = t_id.getText();
        int id;
        try{
        	id = Integer.valueOf(text);
        	this.contractData.setIdContract(id);
        } catch (NumberFormatException e){
        	JOptionPane.showMessageDialog(this,
                	"ID introducido es inv\u00e1lido.",
                	"ID inv\u00e1lido",
                	JOptionPane.WARNING_MESSAGE);
        }
        
    }
	
	private void b_categoriaActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String text = t_categoria.getText();
        this.contractData.setJobLevel(text);
    }
	
	private void b_departamentoActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String text = t_departamento.getText();
        this.contractData.getDepartment().setNameDepartment(text);
    }
	
	private void b_convenioActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String text = t_convenio.getText();
        this.contractData.setConvenio(text);
    }
	
	private void b_duracionActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String text = t_duracion.getText();
        int duracion;
        try{
        	duracion = Integer.valueOf(text);
        	this.contractData.setDuration(duracion);
        } catch (NumberFormatException e){
        	JOptionPane.showMessageDialog(this,
                	"Duraci\u00f3n introducida es inv\u00e1lida.",
                	"Duraci\u00f3n inv\u00e1lida",
                	JOptionPane.WARNING_MESSAGE);
        }
    }
	
	private void b_remuneracionActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String text = t_remuneracion.getText();
        double income;
        try{
        	income = Integer.valueOf(text);
        	this.contractData.setIncomeMoney(income);
        } catch (NumberFormatException e){
        	JOptionPane.showMessageDialog(this,
                	"Remuneraci\u00f3n introducida es inv\u00f3lida.",
                	"Remuneraci\u00f3n inv\u00f3lida",
                	JOptionPane.WARNING_MESSAGE);
        }
	}
	
	private void b_tipoActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String text = t_tipo.getText();
        this.contractData.setType(text);
    }
	
	private void b_vacacionesActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String text = t_vacaciones.getText();
        int vacaciones;
        try{
        	vacaciones = Integer.valueOf(text);
        	this.contractData.setIdContract(vacaciones);
        } catch (NumberFormatException e){
        	JOptionPane.showMessageDialog(this,
                	"Vacaciones introducidas son inv\u00f3lida.",
                	"Vacaciones inv\u00f3lidas",
                	JOptionPane.WARNING_MESSAGE);
        }
    }


    // Variables declaration - do not modify                     
    private javax.swing.JButton b_categoria;
    private javax.swing.JButton b_convenio;
    private javax.swing.JButton b_departamento;
    private javax.swing.JButton b_dni;
    private javax.swing.JButton b_duracion;
    private javax.swing.JButton b_id;
    private javax.swing.JButton b_remuneracion;
    private javax.swing.JButton b_tipo;
    private javax.swing.JButton b_vacaciones;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel l_convenio;
    private javax.swing.JLabel l_departamento;
    private javax.swing.JLabel l_dni;
    private javax.swing.JLabel l_duracion;
    private javax.swing.JLabel l_id;
    private javax.swing.JLabel l_remuneracion;
    private javax.swing.JLabel l_tipo;
    private javax.swing.JLabel l_vacaciones;
    private javax.swing.JPanel p_categoria;
    private javax.swing.JPanel p_convenio;
    private javax.swing.JPanel p_datosContrato;
    private javax.swing.JPanel p_datosEmpleado;
    private javax.swing.JPanel p_departamento;
    private javax.swing.JPanel p_dni;
    private javax.swing.JPanel p_duracion;
    private javax.swing.JPanel p_id;
    private javax.swing.JPanel p_remuneracion;
    private javax.swing.JPanel p_tipo;
    private javax.swing.JPanel p_vacaciones;
    private javax.swing.JTextField t_categoria;
    private javax.swing.JTextField t_convenio;
    private javax.swing.JTextField t_departamento;
    private javax.swing.JTextField t_dni;
    private javax.swing.JTextField t_duracion;
    private javax.swing.JTextField t_id;
    private javax.swing.JTextField t_remuneracion;
    private javax.swing.JTextField t_tipo;
    private javax.swing.JTextField t_vacaciones;
    // End of variables declaration                   
}