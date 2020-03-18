package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Wybór repertuaru na płytę", LocalDate.of(2019, 10, 1), LocalDate.of(2019, 11, 30)));
        tasks.add(new Task("Próby", LocalDate.of(2019, 12, 1), LocalDate.of(2020, 2, 28)));
        tasks.add(new Task("Projekt bookletu płyty", LocalDate.of(2020, 2, 1), LocalDate.of(2020, 8, 31)));
        tasks.add(new Task("Nagranie", LocalDate.of(2020, 10, 15), LocalDate.of(2020, 10, 31)));
        tasks.add(new Task("Montaż, mastering i produkcja płyty", LocalDate.of(2020, 11, 1), LocalDate.of(2020, 12, 15)));
        return tasks;
    }
}
