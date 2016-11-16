package pattern.create.simple_factory;

/**
 * Created by zhangjingzhuan on 2016/11/15.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Product product = Factory.createProduct(ProductA.class);
            product.use();
            product = Factory.createProduct(ProductB.class);
            product.use();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
