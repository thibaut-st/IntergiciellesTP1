package HelloWorld;

import java.rmi.registry.*;

/**
 * Created by thibaut on 11/02/15.
 */
public class HelloClient {
    public static void main(String[] args) {
        try {
            if (args.length < 1) {
                System.out.println("Usage: java HelloWorld.HelloClient <server host>");
                return;
            }
            String host = args[0];
            // Get remote object reference
            Registry registry = LocateRegistry.getRegistry(host);
            Hello h = (Hello)registry.lookup("Hello1");
            // Remote method invocation
            String res = h.sayHello();
            System.out.println(res);
        } catch (Exception e) {
            System.err.println("Error on client: " + e);
        }
    }
}