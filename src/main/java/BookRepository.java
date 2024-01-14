import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookRepository {
    private final Jdbcconnection jdbcConnection = new Jdbcconnection();

    public BookRepository() throws SQLException {
    }
    public void save(Books book) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        java.util.Date myDate = new java.util.Date(book.getYearOfPublish());
        java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());

        String addBook = "INSERT INTO books(book_name,year_of_publish,writer_id_fk) VALUES(?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(addBook);

        preparedStatement.setString(1, book.getBookName());
        preparedStatement.setDate(2, sqlDate);
        preparedStatement.setInt(3, book.getWriter());

        preparedStatement.executeUpdate();
    }
}
