package pattern.action.strategy;


/**
 * Created by zhangjingzhuan on 2016/11/14.
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategyA = new StrategyA();
        context.setStrategy(strategyA);
        context.algorithm();

        Strategy strategyB = new StrategyB();
        context.setStrategy(strategyB);
        context.algorithm();
    }
}
