package ru.geekbrains.lesson1.animal;

import ru.geekbrains.lesson1.enums.Color;

public abstract class Animal{
    private boolean isOnDistance;
    private boolean isFinished;
    private int runDistance;
    private int jumpHeight;
    private int swimDistance;
    private String name;
    private Color color;
    private int age;
    public String kind;


    public Animal(String name, Color color, int age, int runDistance, int jumpHeight, int swimDistance) {
        this.isOnDistance = true;
        this.isFinished = false;
        this.name = name;
        this.color = color;
        this.age = age;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
    }

    public abstract void voice();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void run(int distance) {
        if (!isOnDistance) {
            return;
        }
        if (distance > runDistance) {
            System.out.println(String.format(this.kind + " %s сошел с дистанции", this.name));
            isOnDistance = false;
            return;
        }
        System.out.println(String.format(this.kind + " %s пробежал кросс длиной %d", this.name, distance));
    }


    public void jump(int height) {
        if (!isOnDistance) {
            return;
        }
        if (height > jumpHeight) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format(this.kind + " %s прыгнул на высоту %d", getName(), height));
    }

    public void swim(int distance) {
        if (!isOnDistance){

            return;
        }
        if (distance > swimDistance){
            isOnDistance = false;
            return;
        } else
            this.isFinished = true;
        System.out.println(String.format(this.kind + " %s проплыл дистанцию %d", getName(), distance));
    }

    public String getParticipantName() {
        return getName();
    }


    public int getParticipantAge() {
        return getAge();
    }

    public String getKind() {
        return this.kind;
    }

    public boolean isOnDistance(){
        return isOnDistance;
    }

    public boolean isFinished() {
        return isFinished;
    }
}
