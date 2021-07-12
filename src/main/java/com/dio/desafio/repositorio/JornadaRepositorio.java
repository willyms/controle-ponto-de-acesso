package com.dio.desafio.repositorio;

import com.dio.desafio.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface JornadaRepositorio extends JpaRepository<JornadaTrabalho, Long> {
}
