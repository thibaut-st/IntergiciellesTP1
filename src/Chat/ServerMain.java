package Chat;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by thibaut on 11/02/15.
 */
public class ServerMain {
    public static void main(String[] args) {
        try {
            Server s = new Server();
            ServerInterface si_stub = (ServerInterface) UnicastRemoteObject.exportObject(s, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind("ServerTchat", si_stub);

            System.out.println("Server ready");
        } catch (Exception e) {
            System.err.println("Error on server:" + e);
            e.printStackTrace();
            return;
        }
    }
}
