package models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;
    Author author;

    @Before
    public void setUp() throws Exception {
        author = new Author("Iain", "Banks");
        book = new Book("The Wasp Factory", author);
    }

    @Test
    public void hasTitle() {
        assertEquals("The Wasp Factory", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assert(book.getAuthor() instanceof Author);
    }
}
