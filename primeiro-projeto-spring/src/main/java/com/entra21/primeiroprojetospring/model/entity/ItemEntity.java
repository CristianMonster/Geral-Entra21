package com.entra21.primeiroprojetospring.model.entity;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

//Nao precisa do @Data porque nao vai ser instanciado, lembraod que o @Data faz o getter e setter
//Não coloca como entidade porque ela é uma classe abstrata, logo nao se pode instanciar, logo nao se tem uma entidade de uma classe abstrata
@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)//Quando eu buscar um dvd ou um livro eu quero que você busque as informações da tabela item
@Table(name = "item")
public class ItemEntity {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ItemId;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "valor_venda")
    private Double valorVenda;

    @Column(name = "valor_locacao")
    private Double valorLocacao;

    @Column(name = "emprestado")
    private Boolean emprestado;

    @ManyToOne //Muitos itens podem ter uma franquia
    @JoinColumn(name = "id_franquia", referencedColumnName = "id") //nome na tabela item que ta com o mapeamento - id que ta sendo referenciado
    private FranquiaEntity Franquia; //A franquia que ele está pegando

    @OneToMany(mappedBy = "item")
    private Set<AvaliacaoEntity> avaliacoes;

    @ManyToMany
    @JoinTable(
            name = "genero_item",
            joinColumns = @JoinColumn(name = "id_item"), //o que esta na minha tabela item que esta sendo usado na genero item
            inverseJoinColumns = @JoinColumn(name = "id_genero")//o que eu vou procurar na genero
    )
    private Set<GeneroEntity> generos;

}
