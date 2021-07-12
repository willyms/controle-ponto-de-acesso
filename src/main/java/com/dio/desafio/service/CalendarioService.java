package com.dio.desafio.service;

import com.dio.desafio.model.*;
import com.dio.desafio.repositorio.*;
import lombok.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
@RequiredArgsConstructor
public class CalendarioService {

    private final CalendarioRepositorio calendariorepositorio;

    public Calendario save(Calendario calendario) {
        return calendariorepositorio.save(calendario);
    }

    public Calendario update(Calendario calendario) {
        return calendariorepositorio.save(calendario);
    }

    public List<Calendario> findAll() {
        return calendariorepositorio.findAll();
    }

    public Optional<Calendario> getById(Long idCalendario) {
        return calendariorepositorio.findById(idCalendario);
    }

    public void delete(Long idCalendario) {
        calendariorepositorio.deleteById(idCalendario);
    }
}
