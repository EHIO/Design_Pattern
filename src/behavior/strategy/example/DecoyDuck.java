package behavior.strategy.example;

import behavior.strategy.example.fly.FlyNotWay;
import behavior.strategy.example.quack.MuteQuack;

/**
 * 诱饵鸭
 *
 * @author wg
 */
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNotWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
    }
}
