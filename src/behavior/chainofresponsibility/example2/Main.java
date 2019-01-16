package behavior.chainofresponsibility.example2;

public class Main {

    public static void main(String[] args) {
        String msg = "<script>";
        MsgProcessor mp = new MsgProcessor();
        mp.setMsg(msg);
        FilterChain fc = new FilterChain();
        fc.addFilter(new HTMLFilter())
                .addFilter(new SesitiveFilter())
        ;
        FilterChain fc2 = new FilterChain();
        fc2.addFilter(new FaceFilter());

        fc.addFilter(fc2);
        mp.setFc(fc);
        String result = mp.process();
        System.out.println(result);
    }

}
