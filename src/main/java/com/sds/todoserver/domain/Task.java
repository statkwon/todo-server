package com.sds.todoserver.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@Entity(name = "tasks")
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String content;
    @Column(nullable = false)
    private Boolean isDone = false;
    @LastModifiedDate
    @Column(nullable = false, columnDefinition = "TIMESTAMP")
    private Instant modifiedDate;
    @CreatedDate
    @Column(updatable = false, nullable = false, columnDefinition = "TIMESTAMP")
    private Instant createdDate;
}
