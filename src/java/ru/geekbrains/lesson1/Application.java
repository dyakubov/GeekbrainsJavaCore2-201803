package ru.geekbrains.lesson1;

import ru.geekbrains.lesson1.animal.Cat;
import ru.geekbrains.lesson1.animal.Dog;
import ru.geekbrains.lesson1.animal.Human;
import ru.geekbrains.lesson1.animal.Robot;
import ru.geekbrains.lesson1.course.*;
import ru.geekbrains.lesson1.enums.Color;

/**
 * Класс для запуска приложения - симулятор кросса
 */
public class Application {

    public static void main(String[] args) {
        Team team = new Team("<<Хвостики>>",
                new Cat("Барсик", Color.BLACK, 3, 80, 15, 0),
                new Dog("Палкан", Color.WHITE, 5, 150, 15, 15),
                new Human("Сережа", Color.WHITE, 22, 100, 15, 100),
                new Robot("T1000", Color.RED, 999, 1000, 1000, 0)
        );

        Course course = new Course(
                new Cross(100),
                new Wall(10),
                new Water(5)
        );


        course.doIt(team);


    }
}
