package com.sds.todoserver.controller;

import com.sds.todoserver.controller.dto.TaskCreateRequest;
import com.sds.todoserver.domain.Task;
import com.sds.todoserver.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<Task> create(@RequestBody TaskCreateRequest request) {
        taskService.create(request.getContent());
        return taskService.findAll();
    }

    @GetMapping
    public List<Task> list() {
        return taskService.findAll();
    }
}
