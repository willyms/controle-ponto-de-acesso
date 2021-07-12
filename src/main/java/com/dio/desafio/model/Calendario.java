package com.dio.desafio.model;

import lombok.*;
import org.hibernate.envers.*;

import javax.persistence.*;
import java.time.*;

@Data
@Entity
@Builder
@Audited
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "calendario")
public class Calendario {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
}
