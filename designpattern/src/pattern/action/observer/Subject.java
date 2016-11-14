package pattern.action.observer;

/**
 * Created by zhangjingzhuan on 2016/11/14.
 */
public interface Subject {
    /**
     *attach observer
     *@date 2016/11/14
     *@author zhangjingzhuan
     */
    public void attach(Observer observer);

    /**
     *detach observer
     *@date 2016/11/14
     *@author zhangjingzhuan
     */
    public void detach(int id);
    
    /**
     *notice all observer
     *@date 2016/11/14
     *@author zhangjingzhuan
     */
    public void noticeAll();
    
    /**
     *get status
     *@date 2016/11/14
     *@author zhangjingzhuan
     */
    public int getStatus();

    /**
     *set status
     *@date 2016/11/14
     *@author zhangjingzhuan
     */
    public void setStatus(int status);
}
