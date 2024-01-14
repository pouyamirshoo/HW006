import Services.BooksService;
import Services.WriterService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        WriterService writerService = new WriterService();
        BooksService booksService = new BooksService();

       // writerService.register();
        // writerService.showWriter();
       // booksService.addBook();
       // booksService.showBook();
       // booksService.deleteBook();
    }
}
