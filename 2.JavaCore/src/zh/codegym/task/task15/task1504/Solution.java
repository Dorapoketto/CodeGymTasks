package zh.codegym.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* 
OOP：图书
*/

public class Solution {

    public static void main(String[] args) {
        List<Book> books = new LinkedList<>();
        books.add(new MarkTwainBook("汤姆历险记"));
        books.add(new AgathaChristieBook("大侦探波洛"));
        System.out.println(books);
    }

    public static class MarkTwainBook extends Book {
        private String title;

        public MarkTwainBook(String title) {
            super("Mark Twain");
            this.title = title;
        }

        public MarkTwainBook getBook() {
            return this;
        }

        public String getTitle() {
            return title;
        }
    }

    public static class AgathaChristieBook extends Book {
        private String title;

        public AgathaChristieBook(String title) {
            super("Agatha Christie");
            this.title = title;
        }

        public AgathaChristieBook getBook() {
            return this;
        }

        public String getTitle() {
            return title;
        }
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " 是侦探";
            String markTwainOutput = getBook().getTitle() + " 的作者是：" + author;

            String output = "输出";
            if (getBook() instanceof AgathaChristieBook) output = agathaChristieOutput;
            else if (getBook() instanceof MarkTwainBook) output = markTwainOutput;

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }
}
