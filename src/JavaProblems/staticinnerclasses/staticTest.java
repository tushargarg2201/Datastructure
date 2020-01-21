package JavaProblems.staticinnerclasses;

public class staticTest {
    public static void main(String [] args) {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.build();
        System.out.println(innerClass.z);

        OuterClass.InnerClass.display();
    }
}
