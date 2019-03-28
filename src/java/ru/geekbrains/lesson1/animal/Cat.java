package ru.geekbrains.lesson1.animal;

import ru.geekbrains.lesson1.Participant;
import ru.geekbrains.lesson1.enums.Color;

public class Cat extends Animal implements Participant {


    public Cat(String name, Color color, int age, int runDistance, int jumpHeight, int swimDistance) {
        super(name, color, age, runDistance, jumpHeight, swimDistance);
        this.kind = "Кот";
    }

    @Override
    public void voice() {

        System.out.println("Мяу");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кошки не умеют плавать");
    }
}
