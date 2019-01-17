package creational.factory.factory_method.example_3;

public class MoveableTestDrive {
    public static void main(String[] args) {
        VehicleFactory factory = new CarFactory();
        Moveable m = factory.create();
        m.run();
    }
}
