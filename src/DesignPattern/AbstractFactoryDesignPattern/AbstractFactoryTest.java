package DesignPattern.AbstractFactoryDesignPattern;

import DesignPattern.AbstractFactoryDesignPattern.Factory.AnimationChatFactory;
import DesignPattern.AbstractFactoryDesignPattern.Factory.ChatFactory;
import DesignPattern.AbstractFactoryDesignPattern.Factory.MediaChatFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        ChatWindow chatWindow = ChatFactory.createFactory(new AnimationChatFactory());
        chatWindow.createBubble();
    }
}
