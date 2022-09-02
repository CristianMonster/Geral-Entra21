package com.entra21.primeiroprojetospring.view.repository;

import com.entra21.primeiroprojetospring.model.entity.FranquiaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository                                            //Classe e identificador dessa tabela
public interface FranquiaRepository extends JpaRepository<FranquiaEntity, Long> { //interface funciona como se fosse um contrato, o que herdar dela tem que ter os seus métodos.

}
