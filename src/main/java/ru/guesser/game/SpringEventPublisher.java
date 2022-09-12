package ru.guesser.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class SpringEventPublisher implements ApplicationEventPublisherAware {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishEvent() {
        NumberIsLess numberIsLess = new NumberIsLess(this);
        applicationEventPublisher.publishEvent(numberIsLess);
    }

    public void publishEventBigger() {
        MyNumberIsBigger myNumberIsBigger = new MyNumberIsBigger(this);
        applicationEventPublisher.publishEvent(myNumberIsBigger);
    }

    public void publishHi() {
        Greeting greeting1 = new Greeting(this);
        System.out.println(greeting1.toString());
    }

    public void publishMake() {
        MakeAGuess makeAGuess = new MakeAGuess(this);
        System.out.println(makeAGuess.toString());
    }

    public void publishGratz() {
        Gratz gratz = new Gratz(this);
        System.out.print(gratz.toString());
    }

}




