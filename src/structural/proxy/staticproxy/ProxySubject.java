package structural.proxy.staticproxy;

public class ProxySubject extends Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        preRequest();
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
        postRequest();
    }

    public static void preRequest() {
        System.out.println("请求前的操作!");
    }

    public static void postRequest() {
        System.out.println("请求后的操作");
    }
}
