package DesignPattern.FactoryPattern;

public class ChatWindowFactory {

    ChatWindow chatWindow;
    public ChatWindow createChatFactoryObjects(Enum type) {
        if (type.equals(ChatEnum.TextChat)) {
            chatWindow = new TextChat();
        } else if (type.equals(ChatEnum.MediaChat)) {
            chatWindow = new MediaChat();
        } else if (type.equals(ChatEnum.CalendarChat)) {
             chatWindow = new CalendarChat();
        }
        return chatWindow;
    }
}
