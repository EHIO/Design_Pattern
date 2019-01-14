package behavior.chainofresponsibility;


public class SesitiveFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("进入SesitiveFilter");
        request.setRequestStr(request.getRequestStr().replace("潜规则", "***"));
        request.requestStr += "---SesitiveFilter";
        chain.doFilter(request, response, chain);
        response.responseStr += "---SesitiveFilter";
        System.out.println("退出SesitiveFilter");
    }
}
