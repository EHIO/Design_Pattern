package behavior.strategy.temp;

/**
 * Created by run on 2017/11/28.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;

    String name;

    public Duck(String name) {
        this.name = name;
        System.out.println("我是一只 " + name);
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void fly() {
        flyBehavior.fly();
    }
}
