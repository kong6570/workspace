package pattern.create.factory_method;

/**
 * Created by zhangjingzhuan on 2016/11/15.
 */
public class ProductA implements Product {
    @Override
    public void use() {
        System.out.println("productA is using");
    }
}
