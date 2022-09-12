package ru.guesser.game;

import java.util.ResourceBundle;

public class Gratz extends Message {
    Guesser guesser = new Guesser();

    public Gratz(Object source) {
        super(source);
    }

    ResourceBundle resource = ResourceBundle.getBundle("text");

    @Override
    public String toString() {
        return resource.getString("gratz");
    }
}

