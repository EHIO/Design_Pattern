package structural.adapter.example;

/**
 * 野火鸡，具体的被适配者
 *
 * @author gang.wang
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("咕咕叫");
    }

    @Override
    public void fly() {
        System.out.println("很想飞");
    }

}
