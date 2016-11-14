package pattern.action.mediator;

/**
 * Created by zhangjingzhuan on 2016/11/11.
 */
public class ConcreteColleague implements Colleague {
    public String name;
    public Mediator mediator;

    public ConcreteColleague(String name){
        super();
        this.name = name;
    }

    @Override
    public void sendMsg(String colleagueName, String msg) {
        if(mediator != null)
            mediator.operation(colleagueName, msg);
    }

    @Override
    public void receiveMsg(String msg) {
        System.out.println(name + " receive msg:" + msg);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return name;
    }
}
