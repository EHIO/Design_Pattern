package creational.factory.factory_method.example_3;

public class PlaneFactory extends VehicleFactory {
    public Moveable create() {
        return new Plane();
    }
}
