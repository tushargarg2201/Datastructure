package DesignPattern.AbstractFactoryDesignPattern.Factory;


import DesignPattern.AbstractFactoryDesignPattern.ChatWindow;
import DesignPattern.AbstractFactoryDesignPattern.TextChat;

public class TextChatFactory implements ChatAbstractFactory {
    @Override
    public ChatWindow createObjects() {
        return (ChatWindow) new TextChat();
    }
}
