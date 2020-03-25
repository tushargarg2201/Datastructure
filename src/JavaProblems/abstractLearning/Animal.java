package JavaProblems.abstractLearning;

public abstract class Animal {
    public int weight = 10;

    public static void eat() {
        System.out.println("Every animal eat");
    }

    public  abstract  void bark();
    //public abstract int getHeight();
}
