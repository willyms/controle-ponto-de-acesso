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
public class TipoData {
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
}
