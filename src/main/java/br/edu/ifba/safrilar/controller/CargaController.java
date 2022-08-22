package br.edu.ifba.safrilar.controller;

import br.edu.ifba.safrilar.entity.Carga;
import br.edu.ifba.safrilar.repository.CargaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Carga")
public class CargaController {

    @Autowired
    private CargaRepository cargaRepository;

    @GetMapping
    public List<Carga> listar() {return cargaRepository.findAll(); }


    @PostMapping
    public void incluir(@RequestBody Carga carga){
        cargaRepository.save(carga);
    }

    @PutMapping
    public void alterar(@RequestBody Carga carga){
        cargaRepository.save(carga);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable BigInteger id){
        cargaRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Carga> ler(@PathVariable BigInteger id){
        return cargaRepository.findById(id);
    }
}
