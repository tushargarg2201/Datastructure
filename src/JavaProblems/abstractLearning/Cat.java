package JavaProblems.abstractLearning;

public class Cat extends Animal{
    @Override
    public void bark() {
        System.out.println("Cat meou meou");
        setHeight();
    }

    public void setHeight() {
        weight = 1;
    }
}
