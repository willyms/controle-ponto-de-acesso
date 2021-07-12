package com.dio.desafio.model;

import lombok.*;
import org.hibernate.envers.*;

import javax.persistence.*;
import java.io.*;
import java.math.*;
import java.time.*;

@Data
@Entity
@Builder
@Audited
@NoArgsConstructor
@AllArgsConstructor
public class Movimentacao {

    @Embeddable
    @NoArgsConstructor
    @AllArgsConstructor
    public class MovimentacaoId implements Serializable {
        private Long idMovimentacao;
        private Long idUsuario;
    }

    @EmbeddedId
    private MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    @ManyToOne
    private Ocorrencia ocorrencia;

    @ManyToOne
    private Calendario calendario;

}
