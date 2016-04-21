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
	
	public boolean delete(User obDelete){
		return this.delete(
			new Object[] {
				obDelete.getDNI()
			});
	}

	public boolean update(User obUpdate){
		return this.update(
			new Object[]{
				obUpdate.getName(),
				obUpdate.getPrename(),
				obUpdate.getPassword(),
				obUpdate.getDNI(),
				obUpdate.getMail(),
				obUpdate.getDown(),
				obUpdate.getHolidays(),
				obUpdate.getBirthDate(),
				obUpdate.getCreatDate(),
				obUpdate.getIsAdmin()
			}
			,new Object[]{
				obUpdate.getDNI()
			});
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


}
