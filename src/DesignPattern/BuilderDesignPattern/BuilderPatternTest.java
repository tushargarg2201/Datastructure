package DesignPattern.BuilderDesignPattern;

public class BuilderPatternTest {
    public static void main(String[] args) {
        Computer computer = new Computer.builder(2, 2, 500)
                .setBlueToothEnabled(true).build();

        System.out.println(computer.getHDD());

    }
}
