package modelFactory;

import model.*;

public abstract class TransportFactory {
    public abstract Transport createTransport(String model, int speed);
}
