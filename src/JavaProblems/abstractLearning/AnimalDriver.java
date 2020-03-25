package JavaProblems.abstractLearning;

public class AnimalDriver {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.bark();
        animal.eat();
        System.out.println("Cat height is--->" + animal.weight);

        animal = new Dog();
        animal.bark();
        animal.eat();
        System.out.println("Dog height is--->" + animal.weight);


    }
}
