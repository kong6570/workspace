package pattern.create.simple_factory;

/**
 * Created by zhangjingzhuan on 2016/11/15.
 */
public class ProductB implements Product {
    @Override
    public void use() {
        System.out.println("productB is using");
    }
}
