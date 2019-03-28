package ru.geekbrains.lesson1;

/**
 * Интерфейс - участник соревнований
 */
public interface Participant {

    boolean isOnDistance();

    boolean isFinished();

    void run(int distance);

    void jump(int height);

    void swim(int distance);

    String getParticipantName();

    int getParticipantAge();

    String getKind();

}
