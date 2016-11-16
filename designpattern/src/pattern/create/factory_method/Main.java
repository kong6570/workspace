package pattern.create.factory_method;

/**
 * Created by zhangjingzhuan on 2016/11/15.
 */
public class Main {
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Product productA = factoryA.createProduct("A");
        productA.use();
        Product productB = factoryA.createProduct("B");
        productB.use();

        Factory factoryB = new FactoryB();
        Product productFirst = factoryB.createProduct("first");
        productFirst.use();
        Product productSecond = factoryB.createProduct("second");
        productSecond.use();


    }
}
