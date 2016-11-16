package pattern.create.factory_method;

/**
 * Created by zhangjingzhuan on 2016/11/15.
 */
public class FactoryB implements Factory {
    @Override
    public Product createProduct(String type) {
        if(type.equals("first")){
            return new ProductFirst();
        }else if (type.equals("second")){
            return new ProductSecond();
        }
        return null;
    }
}
