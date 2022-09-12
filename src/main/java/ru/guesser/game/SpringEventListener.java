package ru.guesser.game;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SpringEventListener implements ApplicationListener<Message> {
    @Override
    public void onApplicationEvent(Message numberIsLess) {
        System.out.println(numberIsLess.toString());
    }

    public void numberIsBigger(Message myNumberIsBigger) {
        System.out.println(myNumberIsBigger.toString());
    }

    public void greeting(Message greeting) {
        System.out.println(greeting.toString());
    }

    public void letsPlay(Message makeGuess) {
        System.out.println(makeGuess.toString());
    }

    public void congratz(Message gratz) {
        System.out.println(gratz.toString());
    }
}
