package behavior.chainofresponsibility;


public class HTMLFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("进入HTMLFilter");
        request.setRequestStr(request.getRequestStr().replace("<", "[").replace(">", "]"));
        request.requestStr += "---HTMLFilter";
        chain.doFilter(request, response, chain);
        response.responseStr += "---HTMLFilter";
        System.out.println("退出HTMLFilter");
    }
}
