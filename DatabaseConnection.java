package algorithm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static algorithm.Swing.*;
import java.sql.CallableStatement;
import javax.swing.JPasswordField;

public class DatabaseConnection {

    private final String URI, USR, PWD;
    private Connection connection;
    private Statement statement;
    public ResultSet result;

    /**
     *
     * @param uri
     * @param user
     * @param pass
     */
    public DatabaseConnection(String uri, String user, String pass) {
        URI = uri;
        USR = user;
        PWD = pass;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(URI, USR, PWD);
            statement = connection.createStatement();
            Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
                public void run() {
                    end();
                }
            }, "Shutdown-thread"));
        } catch (SQLException | ClassNotFoundException ex) {
            showErrorMessage(null, ex.getMessage());
        }
    }

    /**
     * Get database connection
     *
     * @return Connection
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * Get connection statement
     *
     * @return Statement
     */
    public Statement getStatement() {
        return statement;
    }

    /**
     * End database connection
     */
    public void end() {
        try {
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            System.err.println("Error database end connection: " + ex.getMessage());
        }
    }

    /**
     * Select from database
     *
     * @param sql select query
     * @return ResultSet
     * @throws SQLException
     */
    public ResultSet select(String sql) throws SQLException {
        if (sql.toLowerCase().startsWith("select ")) {
            return statement.executeQuery(sql);
        }
        return null;
    }

    /**
     * Update in database
     *
     * @param sql update query
     * @return boolean
     * @throws SQLException
     */
    public boolean update(String sql) throws SQLException {
        if (sql.toLowerCase().startsWith("update ")) {
            return statement.executeUpdate(sql) > 0;
        }
        return false;
    }

    /**
     * insert into database
     *
     * @param sql insert query
     * @return boolean
     * @throws SQLException
     */
    public boolean insert(String sql) throws SQLException {
        return execute(sql, "insert into ");
    }

    /**
     * Delete from database
     *
     * @param sql delete query
     * @return boolean
     * @throws SQLException
     */
    public boolean delete(String sql) throws SQLException {
        return execute(sql, "delete from ");
    }

    /**
     * Check data from
     *
     * @param sql select query
     * @return boolean
     * @throws SQLException
     */
    public boolean check(String sql) throws SQLException {
        if (execute(sql, "select ")) {
            ResultSet rs = select(sql);
            return rs.next();
        }
        throw new SQLException("select query not found...!");
    }

    /**
     * Use other executes
     *
     * @param sql
     * @return boolean
     * @throws SQLException
     */
    public boolean procedure(String procedure) throws SQLException {
        CallableStatement callableStatement = connection.prepareCall("{call " + procedure + "}");
        return callableStatement.execute();
    }

    private boolean execute(String sql, String check) throws SQLException {
        if (sql.toLowerCase().startsWith(check)) {
            return statement.execute(sql);
        }
        return false;
    }

    public static StringBuilder password(JPasswordField pass) {
        StringBuilder save = new StringBuilder("");
        for (char c : pass.getPassword()) {
            save.append(c);
        }
        return save;
    }
}
