package dba;

import java.util.List;

import javax.sql.DataSource;

import model.users.User;

/**
 * Única clase para acceder a la base de datos
 * @author Capa
 *
 */
public class DBFacade{

    private UserMapper um;


    public DBFacade(DataSource ds) {
        this.um = new UserMapper(ds);
    }

    /**
     * Función para buscar usuario
     * @param text
     * @return TRUE IF USER EXIST
     */
	public boolean findUser(String text) {
		User aux = um.findById(new String[] {
			text
		});
		return !(aux==null);
	}

	public User getUser(String DNI) {
		User aux = um.findById(new String[] {
				DNI
			});
		return aux;
	}


}
