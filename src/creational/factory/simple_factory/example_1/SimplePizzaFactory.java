package creational.factory.simple_factory.example_1;

/**
 * 披萨工厂
 *
 * @author wang.gang
 */
public class SimplePizzaFactory {
    /**
     * 根据传进来的类型创建相应的披萨
     *
     * @param type
     * @return
     */
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
