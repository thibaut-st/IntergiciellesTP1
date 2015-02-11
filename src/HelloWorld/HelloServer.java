package HelloWorld;

import java.rmi.server.*;
import java.rmi.registry.*;


/**
 * Created by thibaut on 11/02/15.
 */
public class HelloServer {

    public static void main(String[] args) {
        try {
            // Create a HelloWorld.Hello remote object
            HelloImp h = new HelloImp("HelloWorld.Hello world !");
            Hello h_stub = (Hello) UnicastRemoteObject.exportObject(h, 0);
            // Register the remote object in RMI
            // registry with a given identifier
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind("Hello1", h_stub);
            System.out.println("Server ready");
        } catch (Exception e) {
            System.err.println("Error on server:" + e);
            e.printStackTrace();
            return;
        }
    }
}