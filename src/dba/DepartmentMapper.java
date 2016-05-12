package dba;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import model.Department;
import model.users.User;

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
	public boolean insert(Department obInsert) {
		return this.insert(new Object[]{
			obInsert.getIdDepartment(),
			obInsert.getNameDepartment(),
			obInsert.getFaculty().getName()
		});
	}

	@Override
	protected Department buildObjectFromResultSet(ResultSet rs)
			throws SQLException {
		String [] k = getColumnNames();
		Department aux = new Department();
		int idDep = rs.getInt(k[0]);
		String name = rs.getString(k[1]);
		String facName = rs.getString(k[2]);
		aux.setIdDepartment(idDep);
		aux.setNameDepartment(name);


		return new Department();
	}

}
