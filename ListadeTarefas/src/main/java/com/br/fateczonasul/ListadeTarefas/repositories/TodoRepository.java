package com.br.fateczonasul.ListadeTarefas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.br.fateczonasul.ListadeTarefas.models.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
