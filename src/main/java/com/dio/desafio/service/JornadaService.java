package com.dio.desafio.service;

import com.dio.desafio.model.*;
import com.dio.desafio.repositorio.*;
import lombok.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
@RequiredArgsConstructor
public class JornadaService {

    private  final JornadaRepositorio jornadarepositorio;

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho){
        return jornadarepositorio.save(jornadaTrabalho);
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho){
        return jornadarepositorio.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadarepositorio.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long idJornada) {
        return jornadarepositorio.findById(idJornada);
    }

    public void delete(Long idJornada) {
        jornadarepositorio.deleteById(idJornada);
    }
}
