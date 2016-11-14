package pattern.action.command;

/**
 * Created by zhangjingzhuan on 2016/11/14.
 */
public class ConcreteCommand implements Command {
    public Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
