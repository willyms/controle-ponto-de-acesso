package com.dio.desafio.rest;


import com.dio.desafio.model.*;
import com.dio.desafio.service.*;
import lombok.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movimentacao")
public class MovimentacaoController {

    private final MovimentacaoService movimentacaoService;

    @PostMapping
    public Movimentacao createMovimentacao(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.save(movimentacao);
    }

    @GetMapping
    public List<Movimentacao> getMovimentacaoList(){
        return movimentacaoService.findAll();
    }

    @GetMapping("/{idMovimentacao}")
    public ResponseEntity<Movimentacao> getMovimentacaoById(@PathVariable("idMovimentacao") Movimentacao.MovimentacaoId idMovimentacao) throws Exception {
        return ResponseEntity.ok(movimentacaoService.getById(idMovimentacao).orElseThrow(() -> new NoSuchElementException("Movimentacao not found.")));
    }

    @PutMapping
    public Movimentacao updateMovimentacao(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.save(movimentacao);
    }

    @DeleteMapping("/{idMovimentacao}")
    public void deleteMovimentacao(@PathVariable("idMovimentacao") Movimentacao.MovimentacaoId idMovimentacao){
        movimentacaoService.delete(idMovimentacao);
    }
}
