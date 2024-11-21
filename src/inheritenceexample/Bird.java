package inheritenceexample;

public class Bird extends Animal {
    public void fly() {
        System.out.println("Bird can fly");
    }
    @Override
    public void see() {
        System.out.println("Bird can see");
    }
    @Override
    public void breath() {
        System.out.println("Bird can brath");
    }
    @Override
    public void eat() {
        System.out.println("Bird can eat");
    }
}
