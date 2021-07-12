package com.dio.desafio.rest;


import com.dio.desafio.model.*;
import com.dio.desafio.service.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/nivelAcesso")
public class NivelAcessoController {

    private final NivelAcessoService nivelAcessoService;

    @PostMapping
    public NivelAcesso createNivelAcesso(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.save(nivelAcesso);
    }

    @GetMapping
    public List<NivelAcesso> getNivelAcessoList(){
        return nivelAcessoService.findAll();
    }

    @GetMapping("/{idNivelAcesso}")
    public ResponseEntity<NivelAcesso> getNivelAcessoById(@PathVariable("idNivelAcesso") Long idNivelAcesso) throws Exception {
        return ResponseEntity.ok(nivelAcessoService.getById(idNivelAcesso).orElseThrow(() -> new NoSuchElementException("NivelAcesso not found.")));
    }

    @PutMapping
    public NivelAcesso updateNivelAcesso(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.save(nivelAcesso);
    }

    @DeleteMapping("/{idNivelAcesso}")
    public void deleteNivelAcesso(@PathVariable("idNivelAcesso") Long idNivelAcesso){
        nivelAcessoService.delete(idNivelAcesso);
    }
}
