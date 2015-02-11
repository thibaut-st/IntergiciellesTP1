import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by thibaut on 11/02/15.
 */
public interface Hello extends Remote {
    public String sayHello() throws RemoteException;
}
