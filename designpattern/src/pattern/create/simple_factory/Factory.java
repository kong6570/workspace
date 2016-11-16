package pattern.create.simple_factory;

import sun.org.mozilla.javascript.internal.EcmaError;

/**
 * Created by zhangjingzhuan on 2016/11/15.
 */
public class Factory {
    /**
     *create product
     *@date 2016/11/15
     *@author zhangjingzhuan
     */
    public static Product createProduct(Class<?> type) throws Exception{
        return (Product) type.newInstance();
    }
}
