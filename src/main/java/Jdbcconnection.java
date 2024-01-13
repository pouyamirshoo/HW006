import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Jdbcconnection {
    private final Connection connection =
            DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");

    public Jdbcconnection() throws SQLException {
    }

    public Connection getConnection() {
        return connection;
    }
}