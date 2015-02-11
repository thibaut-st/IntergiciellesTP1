package Chat;

import java.rmi.Remote;

/**
 * Created by thibaut on 11/02/15.
 */
public interface ClientInterface extends Remote {
    public String afficherMessage(String message);
}
