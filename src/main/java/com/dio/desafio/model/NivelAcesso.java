package com.dio.desafio.model;

import lombok.*;
import org.hibernate.envers.*;

import javax.persistence.*;

@Data
@Entity
@Audited
@NoArgsConstructor
@AllArgsConstructor
public class NivelAcesso {
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
}
