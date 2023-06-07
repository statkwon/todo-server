package com.sds.todoserver.service;

import com.sds.todoserver.domain.Task;
import com.sds.todoserver.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public Task create(String content) {
        Task task = new Task();
        task.setContent(content);
        return taskRepository.save(task);
    }

    public Optional<Task> findById(Long id) {
        return taskRepository.findById(id);
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Transactional
    public Task update(Long id, String content, Boolean isDone) {
        Task task = taskRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        task.setContent(content);
        task.setIsDone(isDone);
        return taskRepository.save(task);
    }

    public void delete(Long id) {
        taskRepository.deleteById(id);
    }

    public void deleteAll() {
        taskRepository.deleteAll();
    }
}
