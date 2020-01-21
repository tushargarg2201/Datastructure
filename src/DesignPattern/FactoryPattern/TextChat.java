package DesignPattern.FactoryPattern;

public class TextChat implements ChatWindow {
    @Override
    public void createBubble() {
        System.out.println("It's a TextChat bubble");
    }
}
