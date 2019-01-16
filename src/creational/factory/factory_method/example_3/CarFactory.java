package creational.factory.factory_method.example_3;

public class CarFactory extends VehicleFactory {
    public Moveable create() {
        return new Car();
    }
}
