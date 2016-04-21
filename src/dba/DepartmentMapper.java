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
			"Nombre",
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
		// TODO Auto-generated method stub
		return null;
	}

}
