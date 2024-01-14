import java.sql.*;

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
    public Books loud(int bookID) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String findBook = "SELECT * FROM Books WHERE book_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(findBook);
        preparedStatement.setInt(1, bookID);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()) {
            String bookName = resultSet.getString("book_name");
            String yearOfPublish = resultSet.getString("year_of_publish");
            int writer = resultSet.getInt("writer_id_fk");
            Books book = new Books(bookName,yearOfPublish,writer);
            return book;
        }
        else
            return null;

    }
    public void delete (Books books) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String deleteRow = "DELETE FROM books WHERE book_name = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(deleteRow);

        preparedStatement.setString(1, books.getBookName());
        preparedStatement.executeUpdate();

    }
    public int lengthOfArray(int writerId) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        int length = 0;

        String selectBooks = "SELECT * FROM books WHERE writer_id_fk = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(selectBooks);

        preparedStatement.setInt(1, writerId);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            length++;
        }
        return length;
    }
    public Books[] arrayOfBooks(int writerId) throws SQLException {
        Connection connection = jdbcConnection.getConnection();
        Books [] books = new Books[lengthOfArray(writerId)];
        int i = 0;

        String selectBooks = "SELECT * FROM books WHERE writer_id_fk = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(selectBooks);

        preparedStatement.setInt(1, writerId);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String bookName = resultSet.getString("book_name");
            String yearOfPublish = resultSet.getString("year_of_publish");
            int writer = resultSet.getInt("writer_id_fk");
            Books book = new Books(bookName,yearOfPublish,writer);
            books[i] = book;
            i++;
        }
        return books;
    }
}
