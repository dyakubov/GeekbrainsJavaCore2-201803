package ru.geekbrains.lesson1.animal;

import ru.geekbrains.lesson1.Participant;
import ru.geekbrains.lesson1.enums.Color;

/**
 * Робот не является животным, но может учавствовать в соревнованиях
 * так как реализует интерфейс {@link Participant}
 */

public class Robot implements Participant {
    private boolean isOnDistance;
    private boolean isFinished;
    private Color color;
    private int runDistance;
    private int swimDistance;
    private int jumpHeight;
    private String name;
    private int age;
    private String kind;

    public Robot(String name, Color color, int age, int runDistance, int jumpHeight, int swimDistance) {
        this.isOnDistance = true;
        this.isFinished = false;
        this.name = name;
        this.color = color;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
        this.age = age;
        this.kind = "Робот";

    }

    @Override
    public boolean isOnDistance() {

        return isOnDistance;
    }

    @Override
    public void run(int distance) {
        if (!isOnDistance) {
            return;
        }
        if (distance > runDistance) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format(getKind() + " %s пробежал кросс длиной %d", this.name, distance));
    }

    @Override
    public void jump(int height) {
        if (!isOnDistance) {
            return;
        }
        if (height > jumpHeight) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format(getKind() + " %s прыгнул на высоту %d", this.name, height));
    }

    @Override
    public void swim(int distance) {
        isOnDistance = false;
        System.out.println("Роботы не умеют плавать");
    }

    @Override
    public String getParticipantName() {
        return this.name;
    }

    @Override
    public int getParticipantAge() {
        return this.age;
    }

    @Override
    public String getKind() {
        return this.kind;
    }

    @Override
    public boolean isFinished() {
        return isFinished;
    }
}
