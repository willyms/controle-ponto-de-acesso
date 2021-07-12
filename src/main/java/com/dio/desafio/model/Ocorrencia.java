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
public class Ocorrencia {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String descricao;
}
