import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WriterRepository {
    private final Jdbcconnection jdbcConnection = new Jdbcconnection();

    public WriterRepository() throws SQLException {
    }
    public void save(Writer writer) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String addWriter = "INSERT INTO writers(firstname,lastname,age) VALUES(?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(addWriter);

        preparedStatement.setString(1, writer.getFirstname());
        preparedStatement.setString(2, writer.getLastname());
        preparedStatement.setInt(3, writer.getAge());
    }
}
