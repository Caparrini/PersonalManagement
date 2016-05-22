package controller;

import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;

import model.CoreModel;
import model.Department;
import model.Faculty;
import model.users.User;
import dba.DBFacade;

/**
 * Controlador para las vistas
 * Utiliza tanto el modelo como la fachada a la base de datos
 * (Patrón singleton)
 * @author Capa
 *
 */
public class MainController {
	private CoreModel model;
	private DBFacade facade;
	private static MainController ctrl;

	public static MainController getController(CoreModel model, DBFacade facade){
		if(ctrl==null){
			ctrl = new MainController(model,facade);
		}
		return ctrl;
	}
	private MainController(CoreModel model, DBFacade facade) {
		this.model = model;
		this.facade = facade;
	}

	public void FacultysFromDBToModel(){
		List<Faculty> aux = facade.getFacultys();
		model.setFacultys(aux);
	}

	public void DepartmentsFromDBToModel(){
		List<Department> aux = facade.getDepartments();
		model.setDepartments(aux);
	}

	public void WorkersFromDBToModel(){
		List<User> aux = facade.getUsers();
		model.setUsers(aux);
	}

	public DefaultListModel<User> getWorkersModel(){
		return model.getUsers();
	}	

	/**
	 * Busca un usuario
	 * @param text
	 * @return
	 */
	public boolean UserExist(String text) {
		boolean existUser = facade.findUser(text);
		return existUser;
	}


	public boolean validaDNI(String text) {
		return model.valDNI(text);
	}

	/**
	 * Recibe una contraseña y un DNI y compara la contraseña dada con la de la base de datos
	 * @param pass
	 * @return TRUE si las contraseñas son iguales
	 */
	public boolean ComparePassword(String DNI,char[] pass) {
		User sesion = facade.getUser(DNI);
		boolean igual = sesion.comparePass(pass);
		if(igual){
			model.setUserSession(sesion);
		}
		return igual;
	}

	public String getSessionName() {
		return model.getSessionName();
	}

	public String getSessionPrename() {
		return model.getSessionPrename();
	}

	public boolean getAdminSession() {
		return model.getSessionIsAdmin();
	}

	public ListModel<Faculty> getFacultyModel() {
		return model.getFacultys();

	}

	public ListModel<Department> getDepartmentsModel() {
		return model.getDepartments();
	}

	public void initModelFromDB() {
		this.WorkersFromDBToModel();
		this.FacultysFromDBToModel();
		this.DepartmentsFromDBToModel();
		
	}

}