package pattern.action.observer;

/**
 * Created by zhangjingzhuan on 2016/11/14.
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();//观察目标
        Observer observerA = new ConcreteObserver(1);
        Observer observerB = new ConcreteObserver(2);
        subject.attach(observerA);
        subject.attach(observerB);
        subject.setStatus(2);
        subject.noticeAll();

        System.out.println("---------------------------------------------");
        subject.detach(1);
        subject.setStatus(3);
        subject.noticeAll();



    }
}
