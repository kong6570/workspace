package pattern.create.factory_method;

/**
 * Created by zhangjingzhuan on 2016/11/15.
 */
public class FactoryA implements Factory {
    @Override
    public Product createProduct(String type) {
        if(type.equals("A")){
            return new ProductA();
        }else if (type.equals("B")){
            return new ProductB();
        }
        return null;
    }
}
