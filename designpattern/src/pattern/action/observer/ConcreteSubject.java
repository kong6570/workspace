package pattern.action.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangjingzhuan on 2016/11/14.
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int status;

    @Override
    public void attach(Observer observer) {
        if(observer != null){
            observers.add(observer);
        }
    }

    @Override
    public void detach(int id) {
        if(observers.size() > 0){
            for(int i = 0; i < observers.size(); i++){
                if(observers.get(i).getId() == id){
                    observers.remove(i);
                    break;
                }
            }
        }
    }

    @Override
    public void noticeAll() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public int getStatus() {
        return status;
    }

    @Override
    public void setStatus(int status) {
        this.status = status;
    }

}
