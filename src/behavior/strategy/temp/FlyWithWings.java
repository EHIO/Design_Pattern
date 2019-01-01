package behavior.strategy.temp;

/**
 * Created by run on 2017/11/28.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我会飞");
    }
}
