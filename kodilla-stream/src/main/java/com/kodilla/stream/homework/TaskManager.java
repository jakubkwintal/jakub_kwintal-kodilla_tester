package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> actualTasks = TaskRepository.getTasks()
                .stream()
                .filter(u -> u.getDeadline().isBefore(LocalDate.now()))
                .map(TaskManager::getActualTasks)
                .collect(Collectors.toList());
        System.out.println(actualTasks);
    }

    public static LocalDate getActualTasks(Task task) {return task.getDeadline();}
}
