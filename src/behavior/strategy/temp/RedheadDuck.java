package behavior.strategy.temp;

/**
 * Created by run on 2017/11/28.
 */
public class RedheadDuck extends Duck {
    public RedheadDuck(String name) {
        super(name);
        flyBehavior = new FlyWithWings();
    }
}
