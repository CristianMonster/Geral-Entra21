package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.dto.FranquiaListagemDTO;
import com.entra21.primeiroprojetospring.model.entity.FranquiaEntity;
import com.entra21.primeiroprojetospring.view.repository.FranquiaRepository;
import com.entra21.primeiroprojetospring.view.service.FranquiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/franquias") //tudo que cair nesse lugar vai retornar ex localhost:8080/franquias
public class FranquiaRestController { //controlador da minha api responsavel pela Franquia

    @Autowired //sempre que ve um atributo com autowired ele vai retornar um valor
    private FranquiaService franquiaService; //pega um repositório da franquia e coloca nessa variavel

    @Autowired
    private FranquiaRepository franquiaRepository;

    @GetMapping
    public List<FranquiaListagemDTO> getFranquias(){
        return franquiaService.getAll();
    }

    @PostMapping
    public void addFranquia(@RequestBody FranquiaEntity entity){
        franquiaRepository.save(entity);
    }

    @GetMapping("/{id}")
    public ResponseEntity <FranquiaEntity> getFranquia(@PathVariable(name = "id") Long id){ //informando que quando o spring bater nesas requisição é pra pocurar no mapeamento o parametro de nome id
        Optional<FranquiaEntity> franquia = franquiaRepository.findById(id);
        if(franquia.isPresent()){ // se a franquia existe
            return ResponseEntity.ok(franquia.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public void deleteFranquia(@PathVariable(name = "id") Long id){
        franquiaRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity <FranquiaEntity> uptadeFranquia(@PathVariable(name = "id") Long id, @RequestBody String novoNome){
        Optional<FranquiaEntity> entity = franquiaRepository.findById(id);
        if (entity.isPresent()){
            entity.get().setNome(novoNome);
            return ResponseEntity.ok(franquiaRepository.save(entity.get()));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}