package com.dio.desafio.service;

import com.dio.desafio.model.*;
import com.dio.desafio.repositorio.*;
import lombok.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
@RequiredArgsConstructor
public class NivelAcessoService {

    private final NivelAcessoRepositorio nivelAcessorepositorio;


    public NivelAcesso save(NivelAcesso nivelAcesso){
        return nivelAcessorepositorio.save(nivelAcesso);
    }

    public NivelAcesso update(NivelAcesso nivelAcesso){
        return nivelAcessorepositorio.save(nivelAcesso);
    }

    public List<NivelAcesso> findAll() {
        return nivelAcessorepositorio.findAll();
    }

    public Optional<NivelAcesso> getById(Long idNivelAcesso) {
        return nivelAcessorepositorio.findById(idNivelAcesso);
    }

    public void delete(Long idNivelAcesso) {
        nivelAcessorepositorio.deleteById(idNivelAcesso);
    }
}
