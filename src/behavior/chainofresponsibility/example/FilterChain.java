package behavior.chainofresponsibility.example;


import java.util.ArrayList;
import java.util.List;

/**
 * 过滤链
 *
 * @author wg
 */
public class FilterChain implements Filter {

    int index = 0;

    List<Filter> filters = new ArrayList<>();

    public FilterChain addFilter(Filter f) {
        this.filters.add(f);
        return this;
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("进入FilterChain");
        if (index == filters.size()) {
            return;
        }
        Filter f = filters.get(index);
        index++;
        f.doFilter(request, response, chain);
    }
}
