package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    private static final String LISTNAME = "My Tasks List";

    @Test
    public void testTaskListRepositorySave () {
        //Given
        TaskList taskList = new TaskList(LISTNAME, "First task list");

        //When
        taskListRepository.save(taskList);

        //Then
        int id = taskList.getId();
        Optional<TaskList> readTask = taskListRepository.findById(id);
        Assert.assertTrue(readTask.isPresent());

        //CleanUp
        taskListRepository.deleteById(id);
    }

    @Test
    public void testTaskListRepositoryFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, "First task list");
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTasks = taskListRepository.findByListName(listName);

        //Then
        Assert.assertEquals(1, readTasks.size());

        //CleanUp
        int id = readTasks.get(0).getId();
        taskListRepository.deleteById(id);
    }

    @Test
    public void testTaskListRepositorySaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList("New list", "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListRepository.save(taskList);
        int id = taskList.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        taskListRepository.deleteById(id);
    }
}