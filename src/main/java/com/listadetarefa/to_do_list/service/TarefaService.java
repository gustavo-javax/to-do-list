package com.listadetarefa.to_do_list.service;

import com.listadetarefa.to_do_list.entity.Tarefa;
import com.listadetarefa.to_do_list.repository.TarefaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class TarefaService {

    private final TarefaRepository repo;


    //salva a tarefa
    public Tarefa criar(Tarefa tarefa){
        return repo.save(tarefa);
    }
    //listar todas as tarefas
   public List<Tarefa> listar(){
        return repo.findAll();
    }

    public Tarefa buscarPorId(Long id){
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Tarefa não encontrada com id: " + id));
            }
    public Tarefa atualizar(Long id, Tarefa nova){

        Tarefa antiga= buscarPorId(id);
        antiga.setTitulo(nova.getTitulo());
        antiga.setDescricao((nova.getDescricao()));
        antiga.setConcluida(nova.getConcluida());
        return repo.save(antiga);
    }
    public void deletar(Long id){
        repo.deleteById(id);

    }



}
