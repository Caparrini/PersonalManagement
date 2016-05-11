package controller;

import model.CoreModel;
import model.users.User;
import dba.DBFacade;

/**
 * Controlador para las vistas
 * Utiliza tanto el modelo como la fachada a la base de datos
 * @author Capa
 *
 */
public class MainController {
	private CoreModel model;
	private DBFacade facade;


	public MainController(CoreModel model, DBFacade facade) {
		this.model = model;
		this.facade = facade;
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

}