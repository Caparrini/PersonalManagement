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
	protected Contract buildObjectFromResultSet(ResultSet rs)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Object[] getValues(Contract ob) {
		return new Object[] {
					ob.getWorker().getDNI(),
					ob.getDepartment().getIdDepartment(),
					ob.getIdContract(),
					ob.getConvenio(),
					ob.getDuration(),
					ob.getType(),
					ob.getJobLevel(),
					ob.getIncomeMoney(),
					ob.getHolidays()
				}
			;
	}

	@Override
	protected Object[] getId(Contract ob) {
		// TODO Auto-generated method stub
		return null;
	}

}
