package DesignPattern.AbstractFactoryDesignPattern;

public class AnimationChat implements ChatWindow {
    @Override
    public void createBubble() {
        System.out.println("It's an animation chat");
    }
}