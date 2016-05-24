package dba;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import model.Department;

public class DepartmentMapper extends AbstractMapper<Department>{

	public DepartmentMapper(DataSource ds) {
		super(ds);
	}

	@Override
	protected String getTableName() {
		return "Departamento";
	}

	@Override
	protected String[] getColumnNames() {
		return new String[] {
			"IdDepartamento",
			"NombreDep",
			"NombreFacultad"
		};
	}

	@Override
	protected String[] getKeyColumnNames() {
		return new String[] {
			"IdDepartamento"
		};
	}

	@Override
	protected Department buildObjectFromResultSet(ResultSet rs)
			throws SQLException {
		String [] k = getColumnNames();
		Department aux = new Department();
		int idDep = rs.getInt(k[0]);
		String name = rs.getString(k[1]);
		aux.setIdDepartment(idDep);
		aux.setNameDepartment(name);


		return aux;
	}

	@Override
	protected Object[] getValues(Department ob) {
		return new Object[]{
				ob.getIdDepartment(),
				ob.getNameDepartment(),
				ob.getFaculty().getName()
			};
	}

	@Override
	protected Object[] getId(Department ob) {
		return new Object[] {
				ob.getIdDepartment()
		};
	}

	public int insertGK(Department aux) {
		DataAccessor da = new DataAccessor(ds);
		return da.insertRowGK(getTableName(), getColumnNamesNI(), getValuesNI(aux));
	}

	private Object[] getValuesNI(Department ob) {
		return new Object[]{
				ob.getNameDepartment(),
				ob.getFaculty().getName()
			};
	}

	private String[] getColumnNamesNI() {
		return new String[] {
				"NombreDep",
				"NombreFacultad"
			};
	}

}
