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
@Table(name = "table_tipo_carga")
public class TipoCarga {

    @Id
    @GeneratedValue
    @Column(name = "id_tipo_carga")
    BigInteger id;

    //carga_id_carga

    @NotNull
    @Column(name = "descricao_tipo_carga")
    String descricaoTipoCarga;
    
    
}
