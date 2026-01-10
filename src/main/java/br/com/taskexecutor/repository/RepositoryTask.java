package br.com.taskexecutor.repository;

import br.com.taskexecutor.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryTask extends JpaRepository<Task, Integer> {
}
