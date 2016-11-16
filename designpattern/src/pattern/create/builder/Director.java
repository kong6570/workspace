package pattern.create.builder;

/**
 * Created by zhangjingzhuan on 2016/11/16.
 */
public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    /**
     *constuct
     *@date 2016/11/16
     *@author zhangjingzhuan
     */
    public Product constuct(){
        builder.buildPartA();
        builder.buildPartB();
        return builder.getResult();
    }

    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        director.setBuilder(builder);
        director.constuct();
    }
}
