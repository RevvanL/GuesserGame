package ru.guesser.game;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.util.InputMismatchException;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Guesser guesser = new Guesser();
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        SpringEventPublisher springEventPublisher = context.getBean("springEventPublisher", SpringEventPublisher.class);
        springEventPublisher.publishHi();
        springEventPublisher.publishMake();
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        try {
            while (true) {
                while (true) {
                    a = scanner.nextInt();
                    if (a > guesser.theNumber) {
                        springEventPublisher.publishEvent();
                    } else if (a < guesser.theNumber) {
                        springEventPublisher.publishEventBigger();
                    } else if (a == guesser.theNumber) {
                        springEventPublisher.publishGratz();
                        System.out.println(a);
                        a = 9999;
                        break;
                    }
                }
                if (a == 9999) {
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Можно вводить только числа. Начните игру заново");
        }

    }
}

