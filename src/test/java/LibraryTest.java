import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;

    @Before
    public void before(){
        book = new Book();
        library = new Library();
    }

    @Test
    public void hasNoBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canGetBooks(){
        library.addBook(book);
        assertEquals(1,library.bookCount());
        library.removeBook(book);
        assertEquals(0,library.bookCount());
    }

    @Test
    public void checksStock(){
        assertEquals(true, library.checkStock() );
    }


}
