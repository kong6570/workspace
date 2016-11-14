package pattern.action.observer;

/**
 * Created by zhangjingzhuan on 2016/11/14.
 */
public class ConcreteObserver implements Observer {
    private int id;

    public ConcreteObserver(int id) {
        this.id = id;
    }

    @Override
    public void update(Subject subject) {
        System.out.println("update observer["+id+"] status"+subject.getStatus());
    }

    @Override
    public int getId() {
        return id;
    }
}
