package com.dio.desafio.model;

import lombok.*;
import org.hibernate.envers.*;

import javax.persistence.*;
import javax.validation.constraints.*;

@Data
@Entity
@Builder
@Audited
@NoArgsConstructor
@AllArgsConstructor
public class JornadaTrabalho {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String descricao;
}
