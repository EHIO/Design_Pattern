package creational.singleton;

/**
 * 延长初始化占位类模式
 */
public class ResourceFactory {

    private static class ResourceHolder {
        public static Resource resource = new Resource();
    }

    public static Resource getResource() {
        return ResourceHolder.resource;
    }

    static class Resource {

    }
}
