package pattern.create.builder;

/**
 * Created by zhangjingzhuan on 2016/11/16.
 */
public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        System.out.println("build part A");
    }

    @Override
    public void buildPartB() {
        System.out.println("build part B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
