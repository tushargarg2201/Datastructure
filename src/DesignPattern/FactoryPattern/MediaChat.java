package DesignPattern.FactoryPattern;

public class MediaChat implements ChatWindow {
    @Override
    public void createBubble() {
        System.out.println("It's a media chat bubble");
    }
}
