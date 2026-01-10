package br.com.taskexecutor.dto;

import br.com.taskexecutor.enums.StatusTask;
import br.com.taskexecutor.model.Task;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

//DTO responsável pelo registro de novas tarefas
public record NewTaskDTO(

        @NotBlank(message = "Título não pode ficar sem preencher!")
        @Size(min = 3, max = 50)
        String title,

        @NotBlank(message = "Descrição não pode ficar sem preencher!")
        @Size(min = 3, max = 2000)
        String description,

        @NotBlank(message = "Status deve ser selecionado!")
        StatusTask statusTask
) {
    public Task newTask() {
        Task task = new Task();

        task.setTitle(title);
        task.setDescription(description);
        task.setStatus(statusTask);

        return task;
    }
}