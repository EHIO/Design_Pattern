package creational.factory.factory_method.example_3;

public class BroomFactory extends VehicleFactory {
    public Moveable create() {
        return new Broom();
    }
}
