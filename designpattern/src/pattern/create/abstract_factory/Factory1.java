package pattern.create.abstract_factory;

/**
 * Created by zhangjingzhuan on 2016/11/16.
 */
public class Factory1 implements Factory {
    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }

    public static void main(String[] args) {
        Factory factory = new Factory1();
        ProductA productA = factory.createProductA();
        productA.use();
        ProductB productB = factory.createProductB();
        productB.use();
    }
}
