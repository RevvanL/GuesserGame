package ru.guesser.game;

import org.springframework.context.ApplicationEvent;

public abstract class Message extends ApplicationEvent {
    public Message(Object source) {
        super(source);
    }

    public abstract String toString();
}

