package one;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DaterTest {

    private Library library;

    @Before
    public void setUp() throws Exception {
        library = new Library();
    }

    @Test
    public void should_return_hello_buildr() {
        assertThat(library.getMessage(), is("Hello, Buildr"));
    }
}
