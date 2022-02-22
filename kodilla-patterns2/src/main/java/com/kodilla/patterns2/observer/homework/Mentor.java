package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String MentorName;
    private int updateCount;

    public Mentor(String MentorName) {
        this.MentorName = MentorName;
    }

    @Override
    public void update(Homework homework) {
        System.out.println(MentorName + ": New tasks in topic: " + homework.getName() + "\n" +
                " (total: " + homework.getTasks().size() + " messages)");
        updateCount++;
    }

    public String getMentorName() {
        return MentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}

