package web.message;

import one.Library;

public class Messenger {
    public String getMessage() {
        Library library = new Library();
        return library.getMessage() + "!!!";
    }
}
