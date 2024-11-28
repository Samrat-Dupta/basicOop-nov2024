package abstractionexample;

public class MainClass {
    public static void main(String[] args) {
        //  AbstractClass abstractClass = new AbstractClass(); cannot create object for abstract class
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.demo1();
        concreteClass.demo2();

    }
}
