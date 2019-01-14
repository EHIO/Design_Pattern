package behavior.chainofresponsibility;


public class Main {
    public static void main(String[] args) {
        String msg = "<script>，潜规则";
        Request request = new Request();
        request.setRequestStr(msg);
        Response response = new Response();
        response.setResponseStr("神的旨意。不容质疑");
        FilterChain fc = new FilterChain();
        fc.addFilter(new HTMLFilter())
                .addFilter(new SesitiveFilter());

        fc.doFilter(request, response, fc);
        System.out.println(request.getRequestStr());
        System.out.println(response.getResponseStr());
    }
}
