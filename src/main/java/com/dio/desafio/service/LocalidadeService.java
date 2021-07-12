package com.dio.desafio.service;


import com.dio.desafio.model.*;
import com.dio.desafio.repositorio.*;
import lombok.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
@RequiredArgsConstructor
public class LocalidadeService {

    private final LocalidadeRepositorio localidaderepositorio;

    public Localidade save(Localidade localidade){
        return localidaderepositorio.save(localidade);
    }

    public Localidade update(Localidade localidade){
        return localidaderepositorio.save(localidade);
    }

    public List<Localidade> findAll() {
        return localidaderepositorio.findAll();
    }

    public Optional<Localidade> getById(Long idLocalidade) {
        return localidaderepositorio.findById(idLocalidade);
    }

    public void delete(Long idLocalidade) {
        localidaderepositorio.deleteById(idLocalidade);
    }
}
