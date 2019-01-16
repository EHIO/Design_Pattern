package behavior.chainofresponsibility.example2;

public class FaceFilter implements Filter {

    @Override
    public String doFilter(String str) {
        return str.replace(":)", "^V^");
    }

}
