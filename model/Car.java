package model;

public class Car implements Transport {
    private String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("Автомобиль " + model + " едет со скоростью " + speed + " км/ч.");
    }

    @Override
    public void fuelUp() {
        System.out.println("Заправляем автомобиль топливом.");
    }
}

