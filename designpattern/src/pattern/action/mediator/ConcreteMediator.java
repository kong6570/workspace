package pattern.action.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangjingzhuan on 2016/11/11.
 */
public class ConcreteMediator implements Mediator {
    public Map<String, Colleague> colleagues = new HashMap<String, Colleague>();

    @Override
    public void register(Colleague colleague) {
        if(colleague != null){
            colleagues.put(colleague.getName(), colleague);
        }
    }

    @Override
    public void operation(String colleagueName, String msg) {
        Colleague colleague = colleagues.get(colleagueName);
        if(colleague == null){
            System.out.println("cooleague:"+colleagueName+" not find");
        }else {
            colleague.receiveMsg(msg);
        }

    }

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague concreteColleagueA = new ConcreteColleague("user1");
        Colleague concreteColleagueB = new ConcreteColleague("user2");
        concreteColleagueA.setMediator(mediator);
        concreteColleagueB.setMediator(mediator);
        mediator.register(concreteColleagueA);
        mediator.register(concreteColleagueB);
        concreteColleagueA.sendMsg("user2", "msg from user1");
    }

}
