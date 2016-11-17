package pattern.structure.adapter;

/**
 * Created by zhangjingzhuan on 2016/11/17.
 */
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);
        adapter.request();
    }
}
