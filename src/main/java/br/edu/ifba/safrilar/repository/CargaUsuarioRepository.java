package br.edu.ifba.safrilar.repository;

import br.edu.ifba.safrilar.entity.CargaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface CargaUsuarioRepository extends JpaRepository<CargaUsuario, BigInteger> {
}
