package dba;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

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
	public boolean insert(Faculty obInsert) {
		return this.insert(new Object[]{
			obInsert.getName(),
			obInsert.getAddress()
		});
	}

	@Override
	protected Faculty buildObjectFromResultSet(ResultSet rs)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
