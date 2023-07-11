package com.codeeaser.bluetasks.test;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.codeeaser.bluetasks.domain.task.Task;
import com.codeeaser.bluetasks.domain.task.TaskRepository;
import com.codeeaser.bluetasks.domain.user.AppUser;
import com.codeeaser.bluetasks.domain.user.AppUserRepository;

import java.time.LocalDate;

@Component
public class InsertTestData {
    
    private AppUserRepository appUserRepository;

    private TaskRepository taskRepository;

    public InsertTestData(AppUserRepository appUserRepository, TaskRepository taskRepository) {
        this.appUserRepository = appUserRepository;
        this.taskRepository = taskRepository;
    }

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        //todo: Criptografar senha
        AppUser appUser = new AppUser(null, "luis", "abc", "Luis Eduardo S Pinheiro");
        appUserRepository.save(appUser);

        LocalDate baseDate = LocalDate.parse("2023-08-15");

        for (int i = 0; i <= 10; i++) {
            Task task = new Task(null, "Tarefa #" + i, baseDate.plusDays(i), false);
            task.setAppUser(appUser);
            taskRepository.save(task);
        }
        
    }
}