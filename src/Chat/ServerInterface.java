package Chat;

import java.rmi.Remote;

/**
 * Created by thibaut on 11/02/15.
 */
public interface ServerInterface extends Remote {
    public Boolean connect(ClientInterface ci);
    public Boolean disconnect(ClientInterface ci);

}
