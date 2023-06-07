package com.sds.todoserver.repository;

import com.sds.todoserver.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
