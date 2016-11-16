package pattern.create.abstract_factory;

/**
 * Created by zhangjingzhuan on 2016/11/16.
 */
public interface Factory {
    /**
     *create productA
     *@date 2016/11/16
     *@author zhangjingzhuan
     */
    public ProductA createProductA();
    
    /**
     *create productB
     *@date 2016/11/16
     *@author zhangjingzhuan
     */
    public ProductB createProductB();
}
