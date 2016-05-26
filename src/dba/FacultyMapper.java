package dba;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.sql.DataSource;
import model.Department;
import model.Faculty;

public class FacultyMapper extends AbstractMapper<Faculty>{
	private DepartmentMapper dm;

	public FacultyMapper(DataSource ds) {
		super(ds);
		dm = new DepartmentMapper(ds);
	}

	public boolean delete(Faculty ob){
		List<Department> del = ob.getDepartments();
		boolean suc = true;
		Iterator<Department> it= del.iterator();

		while(it.hasNext()) {
			Department dep = it.next();
			suc &=dm.delete(dep);
		}
		suc&=super.delete(ob);
		return suc;
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
    /**
     * Select All
     * @return List of Facultys with their departments
     */
    public List<Faculty> selectAllWithDepartments() {
        List<Faculty> res = Collections.emptyList();

        String facTab = getTableName();
        String depTab = dm.getTableName();
        String facName = getKeyColumnNames()[0];
        String depFK = dm.getColumnNames()[2];

        String sql = "SELECT * FROM " + facTab +
                     " LEFT JOIN " + depTab + " ON " + facTab + "." + facName +
                     " = " + depTab + "." + depFK;

        try (Connection con = ds.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            ResultSet rs = pst.executeQuery();
            res = buildSetWithoutDuplicates(rs);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return res;
    }
    /**
     * Select All with the string passed as filter
     * @param text must content the Faculty's name
     * @return List of Facultys
     */
    public List<Faculty> selectAllWithDepartments(String text) {
        List<Faculty> res = Collections.emptyList();

        String facTab = getTableName();
        String depTab = dm.getTableName();
        String facName = getKeyColumnNames()[0];
        String depFK = dm.getColumnNames()[2];

        String sql = "SELECT * FROM " + facTab +
                " LEFT JOIN " + depTab + " ON " + facTab + "." + facName +
                " = " + depTab + "." + depFK +
                     " WHERE " + facTab + "." + facName + " LIKE ?";

        String filter = "%" + text + "%";

        try (Connection con = ds.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, filter);
            ResultSet rs = pst.executeQuery();
            res = buildSetWithoutDuplicates(rs);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return res;
	}

    private List<Faculty> buildSetWithoutDuplicates(ResultSet rs) throws SQLException {
        HashMap<String, Faculty> set = new HashMap<>();

        while (rs.next()) {
            Faculty fac = buildObjectFromResultSet(rs);

            if (set.containsKey(fac.getName())) {
                fac = set.get(fac.getName());
            } else {
                set.put(fac.getName(), fac);
            }

            Department opt = dm.buildObjectFromResultSet(rs);
            if (opt.getIdDepartment() != 0) {
                opt.setFaculty(fac);
                fac.addDepartment(opt);
            }
        }

        return new ArrayList<>(set.values());
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
		return new Object[] {
				ob.getName()
		};
	}

}
