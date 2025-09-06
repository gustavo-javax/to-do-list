package com.listadetarefa.to_do_list.controller;

import com.listadetarefa.to_do_list.entity.Tarefa;
import com.listadetarefa.to_do_list.service.TarefaService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
@RequiredArgsConstructor

public class TarefaController {

    private  final TarefaService service;

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa){
        return service.criar(tarefa);
    }

    @GetMapping
    public List<Tarefa> listar(){
        return service.listar();
    }
    @GetMapping("/{id}")
    public Tarefa buscar(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Tarefa atualizar(@PathVariable Long id, @RequestBody Tarefa tarefa){
        return service.atualizar(id, tarefa);
    }

    @DeleteMapping("/{id}")
        public void deletar(@PathVariable Long id){
           service.deletar(id);

    }




}
