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
@Table(name = "banco_hora")
public class BancoHora {

    @Embeddable
    @NoArgsConstructor
    @AllArgsConstructor
    public class BancoHoraId implements Serializable {
        private Long idBancoHora;
        private Long idMovimentacao;
        private Long idUsuario;
    }

    @EmbeddedId
    private BancoHoraId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal qntHoras;
    private BigDecimal saldoHoras;
}

