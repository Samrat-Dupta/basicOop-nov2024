package inheritenceexample;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("------------Animal Parent Class------------");
        Animal animal = new Animal();
        animal.see();
        animal.eat();
        animal.breath();

        System.out.println("---------------Dog child Class----------------");
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.breath();
        dog.see();

        System.out.println("---------------Bird child class-----------------");
        Bird bird = new Bird();
        bird.breath();
        bird.eat();
        bird.see();
        bird.fly();

        System.out.println("----------------Fish child class-----------------");
        Fish fish = new Fish();
        fish.breath();
        fish.see();
        fish.swim();

        System.out.println("--------------------Human child class---------------");
        Human human = new Human();
        human.talk();
        human.eat();
        human.breath();
        human.think();
        human.see();
    }
}
