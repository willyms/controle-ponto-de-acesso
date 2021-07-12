package com.dio.desafio.model;

import lombok.*;
import org.hibernate.envers.*;

import javax.persistence.*;

@Data
@Entity
@Builder
@Audited
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "public", name = "empresa")
public class Empresa {
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
    private String cnpj;
    @ManyToOne
    private Endereco endereco;
    private String telefone;
}
