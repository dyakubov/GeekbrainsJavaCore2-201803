package ru.geekbrains.lesson1.animal;

import ru.geekbrains.lesson1.Participant;
import ru.geekbrains.lesson1.enums.Color;

public class Dog extends Animal implements Participant {


    public Dog(String name, Color color, int age, int runDistance, int jumpHeight, int swimDistance) {
        super(name, color, age, runDistance, jumpHeight, swimDistance);
        this.kind = "Пес";
    }

    @Override
    public void voice() {

        System.out.println("Гав");
    }

}
