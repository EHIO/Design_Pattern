package structural.adapter.example;

public class DuckTestDrive {
    public static void main(String[] args) {
        // 创建一只鸭子
        Duck duck = new MallardDuck();
        // 创建一只火鸡
        Turkey turkey = new WildTurkey();
        // 将火鸡包装进一个火鸡适配器中
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("-----看火鸡的表演-----");
        turkey.gobble();
        turkey.fly();
        System.out.println("-----看鸭子的表演-----");
        testDuck(duck);
        System.out.println("-----看火鸡适配器的功效-----");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
