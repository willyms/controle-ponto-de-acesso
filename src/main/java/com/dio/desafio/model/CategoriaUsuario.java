package com.dio.desafio.model;

import lombok.*;
import org.hibernate.envers.*;

import javax.persistence.*;

@Data
@Entity
@Audited
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaUsuario {
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
}
