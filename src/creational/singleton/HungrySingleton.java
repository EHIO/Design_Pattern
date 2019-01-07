package creational.singleton;

/**
 * 提前初始化，也被称为饿汉式
 *
 * @author wg
 */
public class HungrySingleton {

    private static HungrySingleton uniqueInstance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {

        return uniqueInstance;
    }
}
