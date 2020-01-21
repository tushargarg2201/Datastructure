package JavaProblems.staticinnerclasses;

public class OuterClass {
    int x = 10;
    int y = 20;
    int z = 0;
    int t1 = 100;
    private static String message = "Hello";

     public OuterClass(InnerClass innerClass) {
        z = innerClass.z;
        x = innerClass.x;
    }

    public int getX() {
         return x;
    }

    public int getZ() {
         return z;
    }

    private static void outerClassStatic() {
         System.out.println("OuterClassStatic");
    }

    static class InnerClass {
        int x = 0;
        int z = 30;

        public static void display() {

            outerClassStatic();
            System.out.println("Static inner class display called" + message);
        }

        public OuterClass build() {
            return new OuterClass(this);
        }
    }
}
