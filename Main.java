import java.util.Scanner;

import model.*;
import modelFactory.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип транспорта: Car, Motorcycle, Plane, Bicycle");
        String transportType = scanner.nextLine();

        System.out.println("Введите модель транспорта:");
        String model = scanner.nextLine();

        System.out.println("Введите скорость транспорта:");
        int speed = scanner.nextInt();

        TransportFactory factory = getFactory(transportType);
        if (factory != null) {
            Transport transport = factory.createTransport(model, speed);
            transport.move();
            transport.fuelUp();
        } else {
            System.out.println("Неправильный тип транспорта.");
        }

        scanner.close();
    }

    public static TransportFactory getFactory(String transportType) {
        switch (transportType.toLowerCase()) {
            case "car":
                return new CarFactory();
            case "motorcycle":
                return new MotorcycleFactory();
            case "plane":
                return new PlaneFactory();
            case "bicycle":
                return new BicycleFactory();
            default:
                return null;
        }
    }
}
