package pattern.action.mediator;

/**
 * Created by zhangjingzhuan on 2016/11/11.
 */
public interface Colleague {
    /**
     *send Msg
     *@date 2016/11/11
     *@author zhangjingzhuan
     */
    public void sendMsg(String colleagueName, String msg);

    /**
     *receive Msg
     *@date 2016/11/11
     *@author zhangjingzhuan
     */
    public void receiveMsg(String msg);
    
    /**
     *set Mediator
     *@date 2016/11/11
     *@author zhangjingzhuan
     */
    public void setMediator(Mediator mediator);

    /**
     *get Name
     *@date 2016/11/11
     *@author zhangjingzhuan
     */
    public String getName();

}
