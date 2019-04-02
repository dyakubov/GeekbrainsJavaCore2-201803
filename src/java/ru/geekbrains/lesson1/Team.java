package ru.geekbrains.lesson1;

/**
 * Класс - комманда участников соревнований
 */
public class Team {

    private Participant[] participants;
    private String teamName;

    // здесь используется конструктор с переменным числом параметров
    public Team(String teamName, Participant... participants) {
        // внутри метода переменное число параметров интерпретируется как массив
        this.teamName = teamName;
        this.participants = participants;
    }

    public Participant[] getParticipants() {

        return participants;
    }

    public String getTeamName (){
        return this.teamName;
    }

    public void printParticipants(Team team){
        for (Participant participant : team.getParticipants()){
            System.out.println("-" + participant.getKind() + ": " + participant.getParticipantName() + ", возраст: " + participant.getParticipantAge());
        }
    }

    public void printFinishedParticipants(Team team) {
        System.out.println("*-*-*-*-*-*-*-ФИНИШИРОВАЛИ-*-*-*-*-*-*-*");
        for (Participant participant : team.getParticipants()) {
            if (participant.isFinished()) {
                System.out.println("-" + participant.getKind() + ": " + participant.getParticipantName() + ", возраст: " + participant.getParticipantAge());
                // }
            }
        }
    }


}
