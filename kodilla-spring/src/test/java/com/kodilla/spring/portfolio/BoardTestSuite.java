package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testAddTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getDoneList().addTask("Cook dinner");

        board.getInProgressList().addTask("Do homework");

        board.getToDoList().addTask("Walk the dog");
        System.out.println(board);

        //Then
        Assertions.assertEquals(1, board.getDoneList().getTasks().size());
        Assertions.assertEquals(1, board.getInProgressList().getTasks().size());
        Assertions.assertEquals(1, board.getToDoList().getTasks().size());
    }
}
