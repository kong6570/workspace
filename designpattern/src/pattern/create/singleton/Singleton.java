package pattern.create.singleton;

/**
 * Created by zhangjingzhuan on 2016/11/17.
 */
public class Singleton {
    private Singleton singleton = null;

    private Singleton(){}

    public Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
