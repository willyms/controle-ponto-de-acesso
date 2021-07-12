package com.dio.desafio.model;

import lombok.*;
import org.hibernate.envers.*;

import javax.persistence.*;
import java.math.*;
import java.time.*;

@Data
@Entity
@Builder
@Audited
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @ManyToOne
    private Empresa empresa;
    private BigDecimal tolerancia;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private LocalDateTime finalJornada;
    private LocalDateTime inicioJornada;
    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
}
