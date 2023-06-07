package com.sds.todoserver.service;

import com.sds.todoserver.domain.Task;
import com.sds.todoserver.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public Task create(String content) {
        Task task = new Task();
        task.setContent(content);
        return taskRepository.save(task);
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }
}
