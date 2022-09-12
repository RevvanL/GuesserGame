package ru.guesser.game;

import org.springframework.context.ApplicationEvent;

import java.util.ResourceBundle;


public class NumberIsLess extends Message {
    private String message;
    ResourceBundle resource = ResourceBundle.getBundle("text");

    public NumberIsLess(Object source) {
        super(source);
    }

    public String toString() {
        return resource.getString("myNumberIsLess");
    }


}
