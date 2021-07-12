package com.dio.desafio.rest;

import com.dio.desafio.model.*;
import com.dio.desafio.service.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/localidade")
public class LocalidadeController {

    private final LocalidadeService localidadeService;

    @PostMapping
    public Localidade createLocalidade(@RequestBody Localidade localidade){
        return localidadeService.save(localidade);
    }

    @GetMapping
    public List<Localidade> getLocalidadeList(){
        return localidadeService.findAll();
    }

    @GetMapping("/{idLocalidade}")
    public ResponseEntity<Localidade> getLocalidadeById(@PathVariable("idLocalidade") Long idLocalidade) throws Exception {
        return ResponseEntity.ok(localidadeService.getById(idLocalidade).orElseThrow(() -> new NoSuchElementException("Localidade not found.")));
    }

    @PutMapping
    public Localidade updateLocalidade(@RequestBody Localidade localidade){
        return localidadeService.save(localidade);
    }

    @DeleteMapping("/{idLocalidade}")
    public void deleteLocalidade(@PathVariable("idLocalidade") Long idLocalidade){
        localidadeService.delete(idLocalidade);
    }
}
