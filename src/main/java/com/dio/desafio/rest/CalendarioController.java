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
@RequestMapping("/calendario")
public class CalendarioController {

    private final CalendarioService calendarioService;

    @PostMapping
    public Calendario createCalendario(@RequestBody Calendario calendario){
        return calendarioService.save(calendario);
    }

    @GetMapping
    public List<Calendario> getCalendarioList(){
        return calendarioService.findAll();
    }

    @GetMapping("/{idCalendario}")
    public ResponseEntity<Calendario> getCalendarioById(@PathVariable("idCalendario") Long idCalendario) throws Exception {
        return ResponseEntity.ok(calendarioService.getById(idCalendario).orElseThrow(() -> new NoSuchElementException("Calendario not found.")));
    }

    @PutMapping
    public Calendario updateCalendario(@RequestBody Calendario calendario){
        return calendarioService.save(calendario);
    }

    @DeleteMapping("/{idCalendario}")
    public void deleteCalendario(@PathVariable("idCalendario") Long idCalendario){
        calendarioService.delete(idCalendario);
    }
}
