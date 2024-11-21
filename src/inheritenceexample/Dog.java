package inheritenceexample;

public class Dog extends Animal{
    public void bark() {
        System.out.println("Dog can bark");
    }
    @Override
    public void breath() {
        System.out.println("Dog can breath");
    }
    @Override
    public void see() {
        System.out.println("Dog can see");
    }
    @Override
    public void eat() {
        System.out.println("Dog can eat");
    }
}
