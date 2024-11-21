package inheritenceexample;

public class Human extends Animal{
    public void talk(){
        System.out.println("Human can talk");
    }
    public void think(){
        System.out.println("Human can think");
    }
    @Override
    public void see(){
        System.out.println("Human can see");
    }
    @Override
    public void breath(){
        System.out.println("Human can breath");
    }
    @Override
    public void eat(){
        System.out.println("Human can eat");
    }
}
