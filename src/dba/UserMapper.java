package dba;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import model.users.User;

public class UserMapper extends AbstractMapper<User>{

	public UserMapper(DataSource ds) {
		super(ds);
	}

	@Override
	protected String getTableName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getColumnNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getKeyColumnNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(User obInsert) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected User buildObjectFromResultSet(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


}
