package br.edu.ifba.safrilar.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "table_carga_usuario")
public class CargaUsuario {

    @Id
    @GeneratedValue
    @Column(name = "id_carga_usuario")
    BigInteger id;

    @ManyToOne
    Carga carga = new Carga();
    @ManyToOne
    Usuario usuario = new Usuario();

    @NotNull
    @Column(name = "status_carga")
    boolean statusCarga;

    @NotNull
    @Column(name = "status_oferta")
    boolean statusOferta;

    @Column(name = "valor_oferta")
    float valorOferta;
    
    @Column(name = "tipo_acao")
    String tipoAcao;
}
