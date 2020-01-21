package DesignPattern.AbstractFactoryDesignPattern.Factory;

import DesignPattern.AbstractFactoryDesignPattern.ChatWindow;

public class ChatFactory {

   public static ChatWindow createFactory(ChatAbstractFactory chatAbstractFactory) {
       return chatAbstractFactory.createObjects();
   }
}
