package pattern.action.mediator;

/**
 * Created by zhangjingzhuan on 2016/11/11.
 */
public interface Mediator {
    /**
     *rigister member
     *@date 2016/11/11
     *@author zhangjingzhuan
     */
    public void register(Colleague colleague);

    /**
     *memeber operation
     *@date 2016/11/11
     *@author zhangjingzhuan
     */
    public void operation(String colleagueName, String msg);

}
