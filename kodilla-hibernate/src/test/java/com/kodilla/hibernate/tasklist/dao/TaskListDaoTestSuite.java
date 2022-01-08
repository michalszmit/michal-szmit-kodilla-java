package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("ToDoList", "List of TO DO Items");
        taskListDao.save(taskList);
        String taskListName = taskList.getListName();

        //When
        List<TaskList> findByName = taskListDao.findByListName(taskListName);
        String name = findByName.get(0).getListName();

        //Then
        assertEquals("ToDoList", name);

        //Cleanup
        //taskListDao.delete(taskList);
        int id = findByName.get(0).getId();
        taskListDao.deleteById(id);

    }
}