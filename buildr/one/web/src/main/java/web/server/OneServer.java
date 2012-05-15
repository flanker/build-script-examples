package web.server;

import org.eclipse.jetty.server.Server;
import web.requestHandler.HelloBuildr;

public class OneServer {

    public static void main(String[] args) throws Exception
    {
        Server server = new Server(8080);
        server.setHandler(new HelloBuildr());

        server.start();
        server.join();
    }
}
