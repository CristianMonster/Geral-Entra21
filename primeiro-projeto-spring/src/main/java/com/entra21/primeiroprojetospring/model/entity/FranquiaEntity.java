package com.entra21.primeiroprojetospring.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data //gera getter e setter para todos os atributos
@Entity //por padrao ele procura o nome da classe
@Table(name = "franquia") //qual tabela
public class FranquiaEntity {
    @Column(name = "id") //aquelee atributo dessa classe é referente a tal coluna
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;


}
