package pattern.action.state;

/**
 * Created by zhangjingzhuan on 2016/11/14.
 */
public class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        System.out.println("stateB handle,change state to A");
        context.changeState(new ConcreteStateA());
    }
}
