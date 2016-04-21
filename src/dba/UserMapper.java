package dba;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import model.users.User;

public class UserMapper extends AbstractMapper<User>{

	public UserMapper(DataSource ds) {
		super(ds);
	}

	protected String getTableName() {
		return "Usuario";
	}

	protected String[] getColumnNames() {
		return new String[] {
			"Nombre",
			"Apellidos",
			"Password",
			"DNI",
			"Mail",
			"Baja",
			"Vacaciones",
			"FechNac",
			"FechCreac",
			"Admin"
		};
	}

	protected String[] getKeyColumnNames() {
		return new String[] {"DNI"};
	}

	public boolean insert(User obInsert) {
		return this.insert(
			new Object[] {
				obInsert.getName(),
				obInsert.getPrename(),
				obInsert.getPassword(),
				obInsert.getDNI(),
				obInsert.getMail(),
				obInsert.getDown(),
				obInsert.getHolidays(),
				obInsert.getBirthDate(),
				obInsert.getCreatDate(),
				obInsert.getIsAdmin()
			}
		);
	}

	@Override
	protected User buildObjectFromResultSet(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


}
