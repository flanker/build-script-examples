package web.message;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MessengerTest {

    @Test
    public void should_return_hello_buildr() {
        Messenger messenger = new Messenger();
        assertThat(messenger.getMessage(), is("Hello, Buildr!!!"));
    }
}
