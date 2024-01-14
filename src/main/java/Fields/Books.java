package Fields;

public class Books {
        private int bookId;
        private String bookName;
        private String yearOfPublish;
        private int writer;

        public Books() {
        }

        public Books(String bookName, String yearOfPublish, int writer) {
            this.bookName = bookName;
            this.yearOfPublish = yearOfPublish;
            this.writer = writer;
        }

        public int getBookId() {
            return bookId;
        }

        public void setBookId(int bookId) {
            this.bookId = bookId;
        }

        public String getBookName() {
            return bookName;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }

        public String getYearOfPublish() {
            return yearOfPublish;
        }

        public void setYearOfPublish(String yearOfPublish) {
            this.yearOfPublish = yearOfPublish;
        }

        public int getWriter() {
            return writer;
        }

        public void setWriter(int writer) {
            this.writer = writer;
        }

        @Override
        public String toString() {
            return "Fields.Books{" +
                    "bookId=" + bookId +
                    ", bookName='" + bookName + '\'' +
                    ", yearOfPublish=" + yearOfPublish +
                    ", writer=" + writer +
                    '}';
        }
}
