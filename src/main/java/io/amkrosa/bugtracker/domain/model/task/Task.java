package io.amkrosa.bugtracker.domain.model.task;

import io.amkrosa.bugtracker.domain.model.user.User;

import java.util.UUID;

//This is our aggregate root. Anything related to our business logic will go through this class
public class Task {
    private UUID id;
    private User reporter;
    private User assignee;

    public Task(UUID id){
        this.id = id;
    }

    public void createTask(User reporter){
        this.reporter = reporter;
        assignee = null;
    }
}
