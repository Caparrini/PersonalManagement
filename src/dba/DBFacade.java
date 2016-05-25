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
    private static DBFacade sfacade;

    public static DBFacade getDBFacade(DataSource ds){
    	if(sfacade==null){
    		sfacade = new DBFacade(ds);
    	}
    	return sfacade;
    }

    private DBFacade(DataSource ds) {
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
	public List<User> getUsers(String filter) {
		return um.selectAllFiltered(filter);
	}

	public List<Faculty> getFacultys() {
		return fm.selectAll();
	}

	public List<Department> getDepartments() {
		return dm.selectAll();
	}

	public List<Faculty> getFacultysWithDepartments(){
		return fm.selectAllWithDepartments();
	}
	public List<Faculty> getFacultysWithDepartments(String filter){
		return fm.selectAllWithDepartments(filter);
	}

	public void deleteFaculty(Faculty aux) {
		fm.delete(aux);
	}

	public void deleteDepartment(Department aux) {
		dm.delete(aux);
	}

	public int insert(Department aux) {
		return dm.insertGK(aux);
	}

	public boolean insert(Faculty aux) {
		return fm.insert(aux);
	}
}

