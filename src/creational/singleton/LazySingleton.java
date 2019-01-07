package creational.singleton;

/**
 * 懒汉式
 * 延迟加载形式。
 *
 * @author wg
 */
public class LazySingleton {

    // volatile保证变量可见性
    private volatile static LazySingleton uniqueInstance;

    private LazySingleton() {
    }

    /**
     * 加入双重判断可以解决效率问题
     *
     * @return
     */
    public static LazySingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (LazySingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new LazySingleton();
                }
            }
        }
        return uniqueInstance;
    }
}

/*
// version 2 : 效率还可以更高
public class LazySingleton {

    private static LazySingleton uniqueInstance;

    private LazySingleton() {
    }

    public synchronized static LazySingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazySingleton();
        }
        return uniqueInstance;
    }
}*/


/*
// version 1 : 线程不安全
public class LazySingleton {

    private static LazySingleton uniqueInstance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazySingleton();
        }
        return uniqueInstance;
    }
}
*/
