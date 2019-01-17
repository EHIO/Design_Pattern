package creational.factory.abstract_factory;

public class Test {
    public static void main(String[] args) {
        AbstractFactory f = new DefaultFactory();
        Vehicle v = f.createVehicle();
        v.run();
        Weapon w = f.createWeapon();
        w.shoot();
        Food a = f.createFood();
        a.printName();
    }
}
