import java.util.Arrays;

public class Writer {
        private int writerId;
        private String firstname;
        private String lastname;
        private int age;
        Books[] books;

        public Writer() {
        }

    public Writer(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Writer(String firstname, String lastname, int age, Books[] books) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
            this.books = books;
        }

        public int getWriterId() {
            return writerId;
        }

        public void setWriterId(int writerId) {
            this.writerId = writerId;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Books[] getBooks() {
            return books;
        }

        public void setBooks(Books[] books) {
            this.books = books;
        }

        @Override
        public String toString() {
            return "Writer{" +
                    "writerId=" + writerId +
                    ", firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", age=" + age +
                    ", books=" + Arrays.toString(books) +
                    '}';
        }
    }

