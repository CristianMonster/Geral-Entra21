package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.dto.FranquiaDTO;
import com.entra21.primeiroprojetospring.model.dto.FranquiaPayloadDTO;
import com.entra21.primeiroprojetospring.model.entity.FranquiaEntity;
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
    //TUDO TEM QUE PASSAR PELO MEU SERVICE
    @GetMapping
    public List<FranquiaDTO> getFranquias(){
        return franquiaService.getAll();
    }

    @PostMapping
    public void addFranquia(@RequestBody FranquiaPayloadDTO newFranquia){
        franquiaService.save(newFranquia);
    }

    @GetMapping("/{id}")
    public FranquiaDTO getFranquia(@PathVariable(name = "id") Long id) {
        return franquiaService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteFranquia(@PathVariable(name = "id") Long id) {
        franquiaService.delete(id);
    }

    @PutMapping("/{id}")
    public FranquiaDTO updateFranquia(@PathVariable(name = "id") Long id,
                                      @RequestBody String novoNome) {
        return franquiaService.update(id, novoNome);
    }
}