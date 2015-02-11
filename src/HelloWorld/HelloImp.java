package HelloWorld;

import java.rmi.RemoteException;

/**
 * Created by thibaut on 11/02/15.
 */
public class HelloImp implements Hello {

    private String message;

    public HelloImp(String s) throws RemoteException {
        super();
        message = s;
    }

    public String sayHello() throws RemoteException {
        return message;
    }
}
