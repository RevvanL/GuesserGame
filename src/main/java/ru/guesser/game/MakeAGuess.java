package ru.guesser.game;

import java.util.ResourceBundle;

public class MakeAGuess extends Message {
    ResourceBundle resource = ResourceBundle.getBundle("text");

    public MakeAGuess(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return resource.getString("makeAGuess");
    }

}

