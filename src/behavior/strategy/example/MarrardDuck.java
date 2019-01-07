package behavior.strategy.example;

import behavior.strategy.example.fly.FlyWithWings;
import behavior.strategy.example.quack.Quack;

/**
 * 绿头鸭
 *
 * @author wg
 */
public class MarrardDuck extends Duck {

    public MarrardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.err.println("我是绿头鸭");
    }

}
