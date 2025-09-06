package com.listadetarefa.to_do_list.repository;

import com.listadetarefa.to_do_list.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
