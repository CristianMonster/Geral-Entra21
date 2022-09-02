package com.entra21.primeiroprojetospring.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Genero")
public class GeneroEntity {
    @Column(name = "id") //aquelee atributo dessa classe é referente a tal coluna
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;
}
