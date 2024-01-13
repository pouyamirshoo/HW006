public class Books {
        private int bookId;
        private String bookName;
        private int yearOfPublish;
        private int writer;

        public Books() {
        }

        public Books(String bookName, int yearOfPublish, int writer) {
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

        public int getYearOfPublish() {
            return yearOfPublish;
        }

        public void setYearOfPublish(int yearOfPublish) {
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
            return "Books{" +
                    "bookId=" + bookId +
                    ", bookName='" + bookName + '\'' +
                    ", yearOfPublish=" + yearOfPublish +
                    ", writer=" + writer +
                    '}';
        }
}
