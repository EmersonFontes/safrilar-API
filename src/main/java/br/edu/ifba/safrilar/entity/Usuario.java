package br.edu.ifba.safrilar.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "table_usuario")

public class Usuario {

    @Id
    @GeneratedValue
    @Column(name = "id_usuario")
    BigInteger id;

    @NotNull
    @Column(name = "tipo_usuario")
    boolean tipoUsuario;

    @NotNull
    @Column(name = "nome_usuario")
    String nomeUsuario;

    @NotNull
    @Column(name = "senha_usuario")
    String senhaUsuario;

    @NotNull
    @Column(name = "telefone_usuario")
    String telefoneUsuario;

    @NotNull
    @Column(name = "data_nascimento")
    Date dataNascimento;

    @NotNull
    @Column(name = "cep_usuario")
    String cepUsuario;

    @NotNull
    @Column(name = "rua_usuario")
    String ruaUsuario;

    @NotNull
    @Column(name = "numero_usuario")
    String numeroUsuario;

    @NotNull
    @Column(name = "cpf_cnpj_usuario")
    String cpfCnpj;

    @Column(name = "complemento_usuario")
    String complementoUsuario;

    @Column(name = "caf_agricultor")
    String cafAgricultor;

    @Column(name = "peso_caminhao")
    float pesoCaminhao;

    @Column(name = "placa_caminhao")
    String placaCaminhao;

    @Column(name = "cnh_caminhoneiro")
    char cnhCaminhoneiro;

    @OneToMany
    @JoinColumn(name = "id_usuario")
    List<Carga> cargas = new ArrayList<>();


}
