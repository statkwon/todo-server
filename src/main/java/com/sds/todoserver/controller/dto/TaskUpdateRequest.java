package com.sds.todoserver.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskUpdateRequest {

    private Long id;
    private String content;
    private Boolean isDone;
}
