package Chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by thibaut on 11/02/15.
 */
public class ClientMain {

    public static void main(String[] args) {
        try {
            if (args.length < 1) {
                System.out.println("Usage: java HelloWorld.HelloClient <server host>");
                return;
            }


            System.out.println("Message : ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String mess = br.readLine();

            String host = args[0];
            // Get remote object reference
            Registry registry = LocateRegistry.getRegistry(host);
            Message m = (Message) registry.lookup("Hello1");


            String id = args[1];
            Server s = (Server) registry.lookup("Hello1");
            s.connect(id);


            // Remote method invocation
            String res = m.sendMessage();
            System.out.println(res);


        } catch (Exception e) {
            System.err.println("Error on client: " + e);
        }
    }
}
