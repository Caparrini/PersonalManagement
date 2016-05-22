package dba;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import model.Department;
import model.Faculty;

public class FacultyMapper extends AbstractMapper<Faculty>{

	public FacultyMapper(DataSource ds) {
		super(ds);
	}

	@Override
	protected String getTableName() {
		return "Facultad";
	}

	@Override
	protected String[] getColumnNames() {
		return new String[]{
			"Nombre",
			"Direccion"
		};
	}

	@Override
	protected String[] getKeyColumnNames() {
		return new String[]{
			"Nombre"
		};
	}

	@Override
	protected Faculty buildObjectFromResultSet(ResultSet rs)
			throws SQLException {
		Faculty aux = new Faculty();
		String [] k = getColumnNames();
		List<Department> d = new ArrayList<Department>();

		String name = rs.getString(k[0]);
		String adress = rs.getString(k[1]);

		aux.setName(name);
		aux.setAddress(adress);
		aux.setDepartments(d);

		return aux;
	}

	@Override
	protected Object[] getValues(Faculty ob) {
		return new Object[]{
				ob.getName(),
				ob.getAddress()
			};
	}

	@Override
	protected Object[] getId(Faculty ob) {
		// TODO Auto-generated method stub
		return null;
	}

}
