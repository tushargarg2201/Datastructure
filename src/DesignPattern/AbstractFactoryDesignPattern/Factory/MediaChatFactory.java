package DesignPattern.AbstractFactoryDesignPattern.Factory;

import DesignPattern.AbstractFactoryDesignPattern.ChatWindow;
import DesignPattern.AbstractFactoryDesignPattern.MediaChat;

public class MediaChatFactory implements ChatAbstractFactory {

    @Override
    public ChatWindow createObjects() {
        return new MediaChat();
    }
}
