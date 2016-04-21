package dba;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import model.Contract;

public class ContractMapper extends AbstractMapper<Contract>{

	public ContractMapper(DataSource ds) {
		super(ds);
		// TODO Auto-generated constructor stub
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
	public boolean insert(Contract obInsert) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected Contract buildObjectFromResultSet(ResultSet rs)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
