package br.edu.ifba.safrilar.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "table_carga")
public class Carga {

    @Id
    @GeneratedValue
    @Column(name = "id_carga")
    BigInteger id;

    @NotNull
    @Column(name = "descricao_carga")
    String descricaoCarga;

    @NotNull
    @Column(name = "valor_inicial_carga")
    float valorInicialCarga;

    @NotNull
    @Column(name = "disponivel_carga")
    boolean disponivelCarga;

    @OneToMany
    @JoinColumn(name = "id_carga")
    List<Usuario> usuarios = new ArrayList<>();

    @Column(name = "data_saida")
    Date dataSaida = new Date();

    @Column(name = "data_entrega")
    Date dataEntrega = new Date();

    @NotNull
    @Column(name = "peso_carga")
    float pesoCarga;
}
