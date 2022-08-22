package br.edu.ifba.safrilar.controller;

import br.edu.ifba.safrilar.entity.Usuario;
import br.edu.ifba.safrilar.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> listar() {return usuarioRepository.findAll(); }


    @PostMapping
    public void incluir(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }

    @PutMapping
    public void alterar(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable BigInteger id){
        usuarioRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Usuario> ler(@PathVariable BigInteger id){
        return usuarioRepository.findById(id);
    }
}
