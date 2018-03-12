import db.DBHelper;
import models.Author;
import models.Book;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Author author1 = new Author("Iain", "Banks");
        Book book1 = new Book("Wasp Factory", author1);
        Book book2 = new Book("The Crow Road", author1);

        DBHelper.save(author1);
        DBHelper.save(book1);
        DBHelper.save(book2);
        List<Author> authors = DBHelper.getAll("Author");
        List<Book> books1 = DBHelper.getAll("Book");

        book1.setTitle("The Wasp Factory");
        DBHelper.update(book1);
        List<Book> books2 = DBHelper.getAll("Book");

        DBHelper.delete(book2);
        List<Book> books3 = DBHelper.getAll("Book");
    }
}
