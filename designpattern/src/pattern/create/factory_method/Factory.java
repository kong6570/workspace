package pattern.create.factory_method;

/**
 * Created by zhangjingzhuan on 2016/11/15.
 */
public interface Factory {
    /**
     *create product
     *@date 2016/11/15
     *@author zhangjingzhuan
     */
    public Product createProduct(String type);
}
