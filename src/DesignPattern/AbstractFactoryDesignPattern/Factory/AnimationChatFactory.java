package DesignPattern.AbstractFactoryDesignPattern.Factory;

import DesignPattern.AbstractFactoryDesignPattern.AnimationChat;
import DesignPattern.AbstractFactoryDesignPattern.ChatWindow;

public class AnimationChatFactory implements ChatAbstractFactory {

    @Override
    public ChatWindow createObjects() {
        return new AnimationChat();
    }
}
