package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MentorHomeworkTestSuite {

    @Test
    public void taskUpdate() {
        // Given
        Homework javaMicroservices = new JavaMicroservices();
        Homework javaMultithreading = new JavaMultithreading();
        Homework javaSpringAndHibernate = new JavaSpringAndHibernate();
        Mentor johnSmith = new Mentor("John Smith");
        Mentor ivoneEscobar= new Mentor("Ivone Escobar");
        Mentor jessiePinkman = new Mentor("Jessie Pinkman");
        javaMicroservices.registerMentor(johnSmith);
        javaMultithreading.registerMentor(ivoneEscobar);
        javaMultithreading.registerMentor(jessiePinkman);
        javaSpringAndHibernate.registerMentor(jessiePinkman);
        // When
        javaMicroservices.addTask("Module 1 task 1 for review");
        javaMultithreading.addTask("Google does not help, can someone point me what to do in task 3 module 4?");
        javaMultithreading.addTask("Module 2 final task, for review");
        javaMultithreading.addTask("Module 1 final task, for review");
        javaSpringAndHibernate.addTask("Stuck on task 1 module 1, sending for review");
        javaSpringAndHibernate.addTask("Module 3 second attempt at task 3 by Johny");
        javaSpringAndHibernate.addTask("Module 4 task 4, seriously what is this ?");
        // Then
        assertEquals(1, johnSmith.getUpdateCount());
        assertEquals(3, ivoneEscobar.getUpdateCount());
        assertEquals(6, jessiePinkman.getUpdateCount());
    }
}
