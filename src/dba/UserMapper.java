package dba;

import java.sql.Date;
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

	@Override
	protected User buildObjectFromResultSet(ResultSet rs) throws SQLException {
		String [] k = getColumnNames();

		String name = rs.getString(k[0]);
		String prename = rs.getString(k[1]);
		String password = rs.getString(k[2]);

		String DNI = rs.getString(k[3]);
		String mail = rs.getString(k[4]);

		Boolean down = rs.getBoolean(k[5]);
		Boolean holidays = rs.getBoolean(k[6]);
		Date birthDate = rs.getDate(k[7]);
		Date creatDate = rs.getDate(k[8]);
		Boolean isAdmin = rs.getBoolean(k[9]);


		return new User(DNI,password,mail,name,
				prename,down,holidays,birthDate,
				creatDate,isAdmin);
	}

	@Override
	protected Object[] getValues(User ob) {
		return new Object[] {
					ob.getName(),
					ob.getPrename(),
					ob.getPassword(),
					ob.getDNI(),
					ob.getMail(),
					ob.getDown(),
					ob.getHolidays(),
					ob.getBirthDate(),
					ob.getCreatDate(),
					ob.getIsAdmin()
				};
	}

	@Override
	protected Object[] getId(User ob) {
		return new Object[]{
				ob.getDNI()
		};
	}


}
