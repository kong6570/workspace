package pattern.action.command;

/**
 * Created by zhangjingzhuan on 2016/11/14.
 * Controller
 */
public class Invoker {
    public Command command;
    public Invoker(Command command){
        this.command = command;
    }

    /**
     *call command
     *@date 2016/11/14
     *@author zhangjingzhuan
     */
    public void call(){
        command.execute();
    }
}
