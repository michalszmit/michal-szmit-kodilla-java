package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void registerMentor(Observer observer);
    void notifyMentor();
    void removeMentor(Observer observer);
}