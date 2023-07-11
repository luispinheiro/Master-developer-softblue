package com.codeeaser.bluetasks.domain.task;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {
    
    Task findByDescription(String description);

    void save(Task task);

}
