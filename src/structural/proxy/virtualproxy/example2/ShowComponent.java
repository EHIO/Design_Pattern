package structural.proxy.virtualproxy.example2;

/**
 * 具体主题，被代理对象
 * Created by run on 2017/12/11.
 */
public class ShowComponent implements Show {
    @Override
    public void show() {
        System.out.println("你好， 世界");
    }
}
