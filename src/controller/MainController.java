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

	public void facultysFromDBToModel(){
		List<Faculty> aux = facade.getFacultys();
		model.setFacultys(aux);
	}

	public void facultysWithDepartmentsFromDBToModel(){
		List<Faculty> aux = facade.getFacultysWithDepartments();
		model.setFacultys(aux);
	}
	public void facultysFromDBToModel(String filter) {
		List<Faculty> aux = facade.getFacultysWithDepartments(filter);
		model.setFacultys(aux);
	}
	public void departmentsFromDBToModel(){
		List<Department> aux = facade.getDepartments();
		model.setDepartments(aux);
	}

	public void workersFromDBToModel(){
		List<User> aux = facade.getUsers();
		model.setUsers(aux);
	}
	public void workersFromDBToModel(String filter) {
		List<User> aux = facade.getUsers(filter);
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
	public boolean userExist(String text) {
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
	public boolean comparePassword(String DNI,char[] pass) {
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
		this.workersFromDBToModel();
		this.facultysWithDepartmentsFromDBToModel();
	}
	public void changeDepartmentsModel(int index) {
		model.setDepartments(model.getFacultyAt(index).getDepartments());
	}
	public void deleteFaculty(int index) {
		Faculty aux = model.getFacultyAt(index);
		model.removeFacultyAt(index);
		model.removeAllDepartments();
		facade.deleteFaculty(aux);
	}
	public void deleteDepartment(int index, int dindex){
		Department aux = model.getFacultyAt(index).getDepartments().get(dindex);
		model.removeFacultyDepartment(index,dindex);
		model.removeDepartment(dindex);	
		facade.deleteDepartment(aux);
	}
	public void addDepartmentToFaculty(Department aux, int index) {
		aux.setFaculty(model.getFacultyAt(index));
		int id = facade.insert(aux);
		if(id!=-1){
			aux.setIdDepartment(id);
			model.addFacultyDepartment(index,aux);
		}else{
			//TODO VENTANA EMERGENTE DE ERRORDE DEPARTAMENTO DUPLICADO
		}

	}
	public void insertFaculty(Faculty aux) {
		if(facade.insert(aux)){
			model.addFaculty(aux);
		}
	}
	public int getIndexSelectedFaculty() {
		return model.getFacultyFocus();
	}
	public void changeFacultyFocus(int index) {
		model.setFacultyFocus(index);
	}
	public void changeUserFocus(int index) {
		model.setUserP(this.getWorkersModel().getElementAt(index));
	}
	public User getUserP() {
		return model.getUserP();
	}
}
