package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    public void TestFactoryDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drive = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        drive.executeTask();
        //Then
        assertEquals("Drive colleague", drive.getTaskName());
        assertTrue(drive.isTaskExecuted());
    }

    @Test
    public void TestFactoryPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paint = taskFactory.makeTask(TaskFactory.PAINTING_TASK);
        paint.executeTask();
        //Then
        assertEquals("Paint flowers", paint.getTaskName());
        assertTrue(paint.isTaskExecuted());
    }

    @Test
    public void TestFactoryShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shop = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);
        shop.executeTask();
        //Then
        assertEquals("Buy present", shop.getTaskName());
        assertTrue(shop.isTaskExecuted());
    }
}
