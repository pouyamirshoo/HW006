package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Jdbcconnection {
    private final Connection connection =
            DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "12913133");

    public Jdbcconnection() throws SQLException {
    }

    public Connection getConnection() {
        return connection;
    }
}