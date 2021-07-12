package com.dio.desafio.service;


import com.dio.desafio.model.*;
import com.dio.desafio.repositorio.*;
import lombok.*;
import org.springframework.stereotype.*;


import java.util.*;

@Service
@RequiredArgsConstructor
public class BancoHorasService {

    private final BancoHorasRepositorio bancoHorasrepositorio;

    public BancoHora save(BancoHora bancoHoras){
        return bancoHorasrepositorio.save(bancoHoras);
    }

    public BancoHora update(BancoHora bancoHoras){
        return bancoHorasrepositorio.save(bancoHoras);
    }

    public List<BancoHora> findAll() {
        return bancoHorasrepositorio.findAll();
    }

    public Optional<BancoHora> getById(BancoHora.BancoHoraId idBancoHoras) {
        return bancoHorasrepositorio.findById(idBancoHoras);
    }

    public void delete(BancoHora.BancoHoraId idBancoHoras) {
        bancoHorasrepositorio.deleteById(idBancoHoras);
    }
}
