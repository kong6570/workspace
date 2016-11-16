package pattern.create.builder;

/**
 * Created by zhangjingzhuan on 2016/11/16.
 */
public interface Builder {
    /**
     *build partA
     *@date 2016/11/16
     *@author zhangjingzhuan
     */
    public void buildPartA();

    /**
     *build partB
     *@date 2016/11/16
     *@author zhangjingzhuan
     */
    public void buildPartB();

    /**
     *get result
     *@date 2016/11/16
     *@author zhangjingzhuan
     */
    public Product getResult();
}
