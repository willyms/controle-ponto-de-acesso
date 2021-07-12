package com.dio.desafio.service;

import com.dio.desafio.model.*;
import com.dio.desafio.repositorio.*;
import lombok.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
@RequiredArgsConstructor
public class MovimentacaoService {

    private final MovimentacaoRepositorio movimentacaorepositorio;

    public Movimentacao save(Movimentacao movimentacao){
        return movimentacaorepositorio.save(movimentacao);
    }

    public Movimentacao update(Movimentacao movimentacao){
        return movimentacaorepositorio.save(movimentacao);
    }

    public List<Movimentacao> findAll() {
        return movimentacaorepositorio.findAll();
    }

    public Optional<Movimentacao> getById(Movimentacao.MovimentacaoId idMovimentacao) {
        return movimentacaorepositorio.findById(idMovimentacao);
    }

    public void delete(Movimentacao.MovimentacaoId idMovimentacao) {
        movimentacaorepositorio.deleteById(idMovimentacao);
    }
}
