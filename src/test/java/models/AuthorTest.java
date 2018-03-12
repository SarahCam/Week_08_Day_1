package models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AuthorTest {

    Author author1;

    @Before
    public void setUp() throws Exception {
        author1 = new Author("Iain", "Banks");
    }

    @Test
    public void hasFirstName() {
        assertEquals("Iain", author1.getFirstName());
    }

    @Test
    public void hasLastName() {
        assertEquals("Banks", author1.getLastName());
    }

}
