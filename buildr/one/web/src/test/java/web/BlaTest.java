package web;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BlaTest {

    @Test
    public void should_return_hello_buildr() {
        Bla bla = new Bla();
        assertThat(bla.test(), is("Hello, Buildr"));
    }
}
