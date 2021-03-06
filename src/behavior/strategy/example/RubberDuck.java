package behavior.strategy.example;

import behavior.strategy.example.fly.FlyNotWay;
import behavior.strategy.example.quack.Squeak;

/**
 * 橡皮鸭
 *
 * @author wg
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNotWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("我是一只会叫不会飞的橡皮鸭");
    }

}
