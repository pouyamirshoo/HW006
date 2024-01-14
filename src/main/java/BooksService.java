import java.sql.SQLException;
import java.util.Scanner;

public class BooksService {
    private final Scanner sc = new Scanner(System.in);
    private final BookRepository bookRepository = new BookRepository();

    public BooksService() throws SQLException {
    }
    public void addBook() throws SQLException {
        System.out.println("Please enter your book name:");
        String bookName = sc.nextLine();

        System.out.println("Please enter your date of publish as MM/dd/yyyy:");
        String yearOfPublish = sc.nextLine();

        System.out.println("Please enter the writer id:");
        int id = sc.nextInt();
        sc.nextLine();

        Books book = new Books(bookName,yearOfPublish,id);
        bookRepository.save(book);
    }
    public void showBook() throws SQLException {
        System.out.println("plz enter book id");
        int id = sc.nextInt();
        sc.nextLine();

        Books book  = bookRepository.loud(id);
        System.out.println(book.getBookName() + "," + book.getYearOfPublish() + "," + book.getWriter());
    }
    public void deleteBook() throws SQLException {
        System.out.println("Please enter your book name:");
        String bookName = sc.nextLine();

        System.out.println("Please enter your date of publish as MM/dd/yyyy:");
        String yearOfPublish = sc.nextLine();

        System.out.println("Please enter the writer id:");
        int id = sc.nextInt();
        sc.nextLine();

        Books book = new Books(bookName,yearOfPublish,id);
        bookRepository.delete(book);
    }
}
