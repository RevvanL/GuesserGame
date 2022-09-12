package ru.guesser.game;

import java.util.ResourceBundle;

public class Greeting extends Message {
    ResourceBundle resource = ResourceBundle.getBundle("text");

    public Greeting(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return resource.getString("greeting");
    }


}
