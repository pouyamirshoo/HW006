import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WriterRepository {
    private final Jdbcconnection jdbcConnection = new Jdbcconnection();
    private final BookRepository bookRepository = new BookRepository();

    public WriterRepository() throws SQLException {
    }
    public void save(Writer writer) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String addWriter = "INSERT INTO writers(firstname,lastname,age) VALUES(?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(addWriter);

        preparedStatement.setString(1, writer.getFirstname());
        preparedStatement.setString(2, writer.getLastname());
        preparedStatement.setInt(3, writer.getAge());

        preparedStatement.executeUpdate();
    }

    public Writer loud(int writerId) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String findWriter = "SELECT * FROM writers WHERE writer_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(findWriter);
        preparedStatement.setInt(1, writerId);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()) {
            String firstName = resultSet.getString("firstname");
            String lastname = resultSet.getString("lastname");
            int age = resultSet.getInt("age");
            Books [] books = bookRepository.arrayOfBooks(writerId);
            Writer writer = new Writer(firstName,lastname,age,books);
            return writer;
        }
        else
            return null;
    }
}
