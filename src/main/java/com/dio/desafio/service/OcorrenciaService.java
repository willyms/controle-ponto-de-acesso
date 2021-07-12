package com.dio.desafio.service;

import com.dio.desafio.model.*;
import com.dio.desafio.repositorio.*;
import lombok.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
@RequiredArgsConstructor
public class OcorrenciaService {

    private final OcorrenciaRepositorio ocorrenciarepositorio;

    public Ocorrencia save(Ocorrencia ocorrencia){
        return ocorrenciarepositorio.save(ocorrencia);
    }

    public Ocorrencia update(Ocorrencia ocorrencia){
        return ocorrenciarepositorio.save(ocorrencia);
    }

    public List<Ocorrencia> findAll() {
        return ocorrenciarepositorio.findAll();
    }

    public Optional<Ocorrencia> getById(Long idOcorrencia) {
        return ocorrenciarepositorio.findById(idOcorrencia);
    }

    public void delete(Long idOcorrencia) {
        ocorrenciarepositorio.deleteById(idOcorrencia);
    }
}
