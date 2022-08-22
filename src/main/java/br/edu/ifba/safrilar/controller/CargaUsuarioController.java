package br.edu.ifba.safrilar.controller;

import br.edu.ifba.safrilar.entity.CargaUsuario;
import br.edu.ifba.safrilar.repository.CargaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/CargaUsuario")
public class CargaUsuarioController {

    @Autowired
    private CargaUsuarioRepository cargaUsuarioRepository;

    @GetMapping
    public List<CargaUsuario> listar() {return cargaUsuarioRepository.findAll(); }


    @PostMapping
    public void incluir(@RequestBody CargaUsuario cargaUsuario){
        cargaUsuarioRepository.save(cargaUsuario);
    }

    @PutMapping
    public void alterar(@RequestBody CargaUsuario cargaUsuario){
        cargaUsuarioRepository.save(cargaUsuario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable BigInteger id){
        cargaUsuarioRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<CargaUsuario> ler(@PathVariable BigInteger id){
        return cargaUsuarioRepository.findById(id);
    }
}
