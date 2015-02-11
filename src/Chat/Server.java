package Chat;

import java.util.ArrayList;

/**
 * Created by thibaut on 11/02/15.
 */
public class Server implements ServerInterface {

    private ArrayList<ClientInterface> clients = new ArrayList<ClientInterface>();
    private String message = "";

    public Server() {

    }

    @Override
    public Boolean connect(ClientInterface ci) {
        return null;
    }

    @Override
    public Boolean disconnect(ClientInterface ci) {
        return null;
    }

    public void sendToAll(String message) {
        for (ClientInterface client : clients) {
            client.afficherMessage(message);
        }
    }


}
