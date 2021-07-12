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
public class Endereco {
    @Id
    @GeneratedValue
    private Long id;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String complemento;
}
