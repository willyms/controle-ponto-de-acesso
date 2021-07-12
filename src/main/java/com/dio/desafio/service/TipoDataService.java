package com.dio.desafio.service;


import com.dio.desafio.model.*;
import com.dio.desafio.repositorio.*;
import lombok.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
@RequiredArgsConstructor
public class TipoDataService {

    private final TipoDataRepositorio tipoDatarepositorio;

    public TipoData save(TipoData tipoData){
        return tipoDatarepositorio.save(tipoData);
    }

    public TipoData update(TipoData tipoData){
        return tipoDatarepositorio.save(tipoData);
    }

    public List<TipoData> findAll() {
        return tipoDatarepositorio.findAll();
    }

    public Optional<TipoData> getById(Long idTipoData) {
        return tipoDatarepositorio.findById(idTipoData);
    }

    public void delete(Long idTipoData) {
        tipoDatarepositorio.deleteById(idTipoData);
    }
}
