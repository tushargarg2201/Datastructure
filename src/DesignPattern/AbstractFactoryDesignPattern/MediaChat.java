package DesignPattern.AbstractFactoryDesignPattern;

public class MediaChat implements ChatWindow {
    @Override
    public void createBubble() {
        System.out.println("It's an Media chat");
    }
}
