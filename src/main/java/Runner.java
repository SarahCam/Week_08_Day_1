import db.DBHelper;
import models.Author;
import models.Book;

public class Runner {

    public static void main(String[] args) {

        Author author1 = new Author("Iain", "Banks");
        Book book1 = new Book("The Wasp Factory", author1);

        DBHelper.save(author1);
        DBHelper.save(book1);
    }
}
