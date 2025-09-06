package com.listadetarefa.to_do_list.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="titulo")
    private String titulo;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "concluida")
    private Boolean concluida;


}
