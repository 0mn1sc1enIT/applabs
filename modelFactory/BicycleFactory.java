package modelFactory;

import model.*;

public class BicycleFactory extends TransportFactory {
    @Override
    public Transport createTransport(String model, int speed) {
        return new Bicycle(model, speed);
    }
}

