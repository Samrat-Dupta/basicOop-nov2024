package inheritenceexample;

public class Fish extends Animal{
    public void see(){
        System.out.println("fish can see");
    }
    public void swim(){
        System.out.println("fish can swim");
    }
    @Override
    public void breath(){
        System.out.println("fish can breath");
    }
}
