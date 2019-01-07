package behavior.strategy.example.test;

import behavior.strategy.example.Duck;
import behavior.strategy.example.MarrardDuck;
import behavior.strategy.example.ModelDuck;
import behavior.strategy.example.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) throws InterruptedException {
        Duck mallard = new MarrardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Thread.sleep(1000);
        System.out.println("---------------------");
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        // 动态的改变飞行行为
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
