package br.edu.ifba.safrilar.controller;

import br.edu.ifba.safrilar.entity.TipoCarga;
import br.edu.ifba.safrilar.repository.TipoCargaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/TipoCarga")
public class TipoCargaController {

    @Autowired
    private TipoCargaRepository tipoCargaRepository;

    @GetMapping
    public List<TipoCarga> listar() {return tipoCargaRepository.findAll(); }


    @PostMapping
    public void incluir(@RequestBody TipoCarga tipoCarga){
        tipoCargaRepository.save(tipoCarga);
    }

    @PutMapping
    public void alterar(@RequestBody TipoCarga tipoCarga){
        tipoCargaRepository.save(tipoCarga);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable BigInteger id){
        tipoCargaRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<TipoCarga> ler(@PathVariable BigInteger id){
        return tipoCargaRepository.findById(id);
    }
}
