import java.sql.SQLException;
import java.util.Scanner;

public class WriterService {

    private final Scanner sc = new Scanner(System.in);
    private final WriterRepository writerRepository = new WriterRepository();

    public WriterService() throws SQLException {
    }
    public void register() throws SQLException {
        System.out.println("Please enter your firstname:");
        String firstname = sc.nextLine();

        System.out.println("Please enter your lastname:");
        String lastname = sc.nextLine();

        System.out.println("Please enter your age:");
        int age = sc.nextInt();
        sc.nextLine();

        Writer writer = new Writer(firstname, lastname, age);
        writerRepository.save(writer);
    }
    public void showWriter() throws SQLException {
        System.out.println("plz enter writer id");
        int id = sc.nextInt();
        sc.nextLine();

        Writer writer = writerRepository.loud(id);
        System.out.println(writer.toString());

    }
}
