package behavior.strategy.temp;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by run on 2017/11/28.
 */
public class FlyNotWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
