package io.amkrosa.bugtracker.domain.model.user;

import io.amkrosa.bugtracker.domain.model.task.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//This is our aggregate root. Anything related to our business logic will go through this class
public class User {
    private UUID id;
    private String email;
    private List<Task> assignedTasks;
    private List<Task> createdTasks;

    public User(UUID id, String email){
        this.id = id;
        this.email = email;
        this.assignedTasks = new ArrayList<>();
        this.createdTasks = new ArrayList<>();
    }

    public void assignTask(Task task){
        assignedTasks.add(task);
    }
}
