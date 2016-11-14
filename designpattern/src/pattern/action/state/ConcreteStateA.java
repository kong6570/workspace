package pattern.action.state;

/**
 * Created by zhangjingzhuan on 2016/11/14.
 */
public class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {
        System.out.println("stateA handle,change state to B");
        context.changeState(new ConcreteStateB());
    }
}
