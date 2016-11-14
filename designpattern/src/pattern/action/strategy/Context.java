package pattern.action.strategy;

/**
 * Created by zhangjingzhuan on 2016/11/14.
 */
public class Context {
    private Strategy strategy;

    /**
     *set strategy
     *@date 2016/11/14
     *@author zhangjingzhuan
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void algorithm(){
        strategy.algorithm();
    }
}
