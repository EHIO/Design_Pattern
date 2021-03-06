package creational.factory.simple_factory.example_2;

public class IPhoneStore {

    SimpleFactory simpleFactory;

    public IPhoneStore(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public IPhone order(String type) {
        return simpleFactory.create(type);
    }
}
