package pattern.action.state;

/**
 * Created by zhangjingzhuan on 2016/11/14.
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.request();
        context.request();
        context.request();
    }
}
