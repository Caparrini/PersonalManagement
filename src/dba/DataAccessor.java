package dba;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

import javax.sql.DataSource;

public class DataAccessor {
    private DataSource ds;

    public DataAccessor(DataSource ds) {
        super();
        this.ds = ds;
    }

    public boolean deleteRow(String tableName, String[] keyColumnNames, Object[] keyValues) {
        String sql = generateDeleteStatement(tableName, keyColumnNames);

        try(Connection con = ds.getConnection();
            PreparedStatement pst = con.prepareStatement(sql)) {

            for (int i = 0; i < keyValues.length; i++) {
                pst.setObject(i + 1, keyValues[i]);
            }

            int numRows = pst.executeUpdate();
            return (numRows == 1);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateRows(String tableName, String[] keyColumnNames,
                              Object[] keyValues, String[] columnNames, Object[] columnValues) {

        String sql = generateUpdateStatement(tableName, keyColumnNames, columnNames);

        try(Connection con = ds.getConnection();
            PreparedStatement pst = con.prepareStatement(sql)) {

            for (int i = 0; i < columnValues.length; i++) {
                pst.setObject(i + 1, columnValues[i]);
            }

            for (int i = 0; i < keyValues.length; i++){
                pst.setObject(columnValues.length + i + 1, keyValues[i]);
            }

            int numRows = pst.executeUpdate();
            return (numRows == 1);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Inserta una fila en una tabla de la BD.
     *
     * @param tableName Nombre de la tabla en la que insertar la fila.
     * @param fields Nombres de las columnas a rellenar de la nueva fila.
     * @param values Valores a insertar en la nueva fila. Este array ha de tener
     *       tantos elementos como <code>fields</code>
     * @return <code>true</code> si la inserción tuvo éxito, o <code>false</code>
     *       en caso contrario.
     */
    public boolean insertRow(String tableName, String[] fields, Object[] values) {
        String sql = generateInsertStatement(tableName, fields);

        try (Connection con = ds.getConnection();
            PreparedStatement pst = con.prepareStatement(sql)) {

            for (int i = 0; i < values.length; i++) {
                pst.setObject(i + 1, values[i]);
            }

            int numRows = pst.executeUpdate();
            return (numRows == 1);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String generateInsertStatement(String tableName, String[] fields) {
        String[] marks = new String[fields.length];
        Arrays.fill(marks, "?");
        return "INSERT INTO " + tableName + " (" + String.join(", ", fields) + ")" +
               " VALUES " + "( " + String.join(", ", marks) + ")";
    }

    private String generateUpdateStatement(String tableName,
                                           String[] keyColumnNames, String[] columnNames) {

        for (int i = 0; i < columnNames.length; i++)
            columnNames[i] = columnNames[i].concat(" = ?");

        for (int i = 0; i < keyColumnNames.length; i++)
            keyColumnNames[i] = keyColumnNames[i].concat(" = ?");

        return "UPDATE " + tableName +
               " SET " + String.join(", ", columnNames) +
               " WHERE " + String.join(" AND ", keyColumnNames);
    }

    private String generateDeleteStatement(String tableName, String[] keyColumnNames) {
        for (int i = 0; i < keyColumnNames.length; i++) {
            keyColumnNames[i] = keyColumnNames[i].concat(" = ?");
        }
        return "DELETE FROM " + tableName + " WHERE " + String.join(" AND ", keyColumnNames);
    }
}
