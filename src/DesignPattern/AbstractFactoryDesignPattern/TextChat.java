package DesignPattern.AbstractFactoryDesignPattern;

import DesignPattern.FactoryPattern.ChatWindow;

public class TextChat implements ChatWindow {
    @Override
    public void createBubble() {
        System.out.println("It's an Text chat");
    }
}
