package DesignPattern.FactoryPattern;

public class CalendarChat implements ChatWindow {
    @Override
    public void createBubble() {
        System.out.println("It's a calendar chat bubble");
    }
}
