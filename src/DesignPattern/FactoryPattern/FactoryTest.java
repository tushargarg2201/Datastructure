package DesignPattern.FactoryPattern;

public class FactoryTest {
    public static void main(String[] args) {
       ChatWindowFactory chatWindowFactory = new ChatWindowFactory();
       ChatWindow chatWindow = chatWindowFactory.createChatFactoryObjects(ChatEnum.TextChat);
       chatWindow.createBubble();
    }
}
