package behavior.strategy.example;

import behavior.strategy.example.fly.FlyNotWay;
import behavior.strategy.example.quack.Quack;

/**
 * 模型鸭
 *
 * @author wg
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNotWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是模型鸭");
    }

}
