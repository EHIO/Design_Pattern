package behavior.strategy.temp;

/**
 * Created by run on 2017/11/28.
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        Duck duck = new RedheadDuck("红头鸭");
        duck.fly();

        System.out.println("-------------------改变行为--------------------");
        Thread.sleep(100);
        duck.setFlyBehavior(new FlyNotWay());
        duck.fly();
    }
}
