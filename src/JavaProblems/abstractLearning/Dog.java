package JavaProblems.abstractLearning;

public class Dog extends Animal {

    @Override
    public void bark() {
        System.out.println("Dog bark");
        setHeight();
    }

    public void setHeight() {
        weight = 3;
    }

    public static void eat() {
        System.out.println("Dog eat only Breads");
    }

}
