package ru.geekbrains.lesson1.course;

import ru.geekbrains.lesson1.Participant;
import ru.geekbrains.lesson1.Team;

/**
 * Класс - полоса препятствий
 */
public class Course {

    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {

        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        System.out.println("Выступает команда: " + team.getTeamName() + "\nСостав команды:");
        team.printParticipants(team);
        System.out.println("На старт!\nВнимание!\n---Марш!---");


        for (Participant participant : team.getParticipants()) {
            for (Obstacle obstacle : obstacles) {
                obstacle.doIt(participant);

                // если участник сошел с дистанции, то нет смысла двигать его дальше
                if (!participant.isOnDistance()) {
                    break;
                }
            }
        }
        team.printFinishedParticipants(team);
    }

}
