package pattern.action.state;

/**
 * Created by zhangjingzhuan on 2016/11/14.
 */
public class Context {
    public State state = new ConcreteStateA();
    
    /**
     *change state
     *@date 2016/11/14
     *@author zhangjingzhuan
     */
    public void changeState(State state){
        this.state = state;
    }
    
    /**
     *request
     *@date 2016/11/14
     *@author zhangjingzhuan
     */
    public void request(){
        state.handle(this);
    }
}
