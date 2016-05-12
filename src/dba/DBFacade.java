package dba;

import java.util.List;

import javax.sql.DataSource;

import model.Department;
import model.Faculty;
import model.users.User;

/**
 * Única clase para acceder a la base de datos
 * @author Capa
 *
 */
public class DBFacade{

    private UserMapper um;
    private FacultyMapper fm;
    private DepartmentMapper dm;


    public DBFacade(DataSource ds) {
        this.um = new UserMapper(ds);
        this.fm = new FacultyMapper(ds);
        this.dm = new DepartmentMapper(ds);
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

	public List<User> getUsers(){
		return um.selectAll();
	}

	public List<Faculty> getFacultys() {
		return fm.selectAll();
	}

	public List<Department> getDepartments() {
		return dm.selectAll();
	}

}
