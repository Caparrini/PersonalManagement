package dba;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import model.Contract;

public class ContractMapper extends AbstractMapper<Contract>{

	public ContractMapper(DataSource ds) {
		super(ds);
	}

	@Override
	protected String getTableName() {
		return "Contrato";
	}

	@Override
	protected String[] getColumnNames() {
		return new String[] {
				"ContratadoDNI",
				"DepartamentoID",
				"IdContrato",
				"Convenio",
				"Duracion",
				"Tipo",
				"CategoriaProfesional",
				"Remuneracion",
				"Vacaciones"
		};
	}

	@Override
	protected String[] getKeyColumnNames() {
		return new String[] {
				"IdContrato"
		};
	}

	@Override
	public boolean insert(Contract obInsert) {
		return this.insert(
				new Object[] {
					obInsert.getWorker().getDNI(),
					obInsert.getDepartment().getIdDepartment(),
					obInsert.getIdContract(),
					obInsert.getConvenio(),
					obInsert.getDuration(),
					obInsert.getType(),
					obInsert.getJobLevel(),
					obInsert.getIncomeMoney(),
					obInsert.getHolidays()
				}
			);
	}

	@Override
	protected Contract buildObjectFromResultSet(ResultSet rs)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
