package Chat;

/**
 * Created by thibaut on 11/02/15.
 */
public class Client implements ClientInterface {

    public Client(ServerInterface serverInterface,  String nom) {
        serverInterface.connect(this);
    }

    public String afficherMessage(String message) {
        return message;
    }
}
