package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.dto.GeneroDTO;
import com.entra21.primeiroprojetospring.model.dto.GeneroPayloadDTO;;
import com.entra21.primeiroprojetospring.view.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/generos")
public class GeneroRestController {
    @Autowired //sempre que ve um atributo com autowired ele vai retornar um valor
    private GeneroService generoService; //pega um repositório da franquia e coloca nessa variavel
    //TUDO TEM QUE PASSAR PELO MEU SERVICE
    @GetMapping
    public List<GeneroDTO> getGenero(){
        return generoService.getAll();
    }

    @PostMapping
    public void addFranquia(@RequestBody GeneroPayloadDTO newGenero){
        generoService.save(newGenero);
    }

    @GetMapping("/{id}")
    public GeneroDTO getGenero(@PathVariable(name = "id") Long id) {
        return generoService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteGenero(@PathVariable(name = "id") Long id) {
        generoService.delete(id);
    }

    @PutMapping("/{id}")
    public GeneroDTO updateGenero(@PathVariable(name = "id") Long id,
                                      @RequestBody String novoNome) {
        return generoService.update(id, novoNome);
    }
}
