package structural.proxy.virtualproxy.example2;

/**
 * 代理对象
 * Created by run on 2017/12/11.
 */
public class ShowProxy implements Show {

    Show showComponent;

    @Override
    public void show() {
        if (showComponent != null) {
            showComponent.show();
        } else {
            System.out.println("请稍候， 您要的东西马上承现");
            showComponent = new ShowComponent();
        }
    }
}
