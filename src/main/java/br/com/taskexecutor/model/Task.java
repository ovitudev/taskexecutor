package br.com.taskexecutor.model;

import br.com.taskexecutor.enums.StatusTask;
import jakarta.persistence.*;

@Entity
@Table(name = "TASK")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100)
    private String title;

    @Column(length = 100)
    private String description;

    @Column(length = 100)
    @Enumerated(EnumType.STRING) // Anotação para que no banco de dados seja salvo como uma ‘string’!
    private StatusTask status;

    public Task(String title, String description, StatusTask status) {
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public Task() {}

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StatusTask getStatus() {
        return status;
    }

    public void setStatus(StatusTask status) {
        this.status = status;
    }
}
