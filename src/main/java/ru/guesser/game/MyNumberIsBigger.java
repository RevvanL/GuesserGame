package ru.guesser.game;

import org.springframework.context.ApplicationEvent;

import java.util.ResourceBundle;

public class MyNumberIsBigger extends Message {
    ResourceBundle resource = ResourceBundle.getBundle("text");

    public MyNumberIsBigger(Object source) {
        super(source);
    }

    public String toString() {
        return resource.getString("myNumberIsBigger");
    }

}
