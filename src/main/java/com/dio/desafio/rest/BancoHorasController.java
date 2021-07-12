package com.dio.desafio.rest;


import com.dio.desafio.model.*;
import com.dio.desafio.service.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bancoHoras")
public class BancoHorasController {

    private final BancoHorasService bancoHorasService;

    @PostMapping
    public BancoHora createBancoHoras(@RequestBody BancoHora bancoHora) {
        return bancoHorasService.save(bancoHora);
    }

    @GetMapping
    public List<BancoHora> getBancoHorasList() {
        return bancoHorasService.findAll();
    }

    @GetMapping("/{idBancoHoras}")
    public ResponseEntity<BancoHora> getBancoHorasById(@PathVariable("idBancoHoras") BancoHora.BancoHoraId idBancoHora) throws Exception {
        return ResponseEntity.ok(bancoHorasService.getById(idBancoHora).orElseThrow(() -> new NoSuchElementException("BancoHoras not found.")));
    }

    @PutMapping
    public BancoHora updateBancoHoras(@RequestBody BancoHora bancoHora) {
        return bancoHorasService.save(bancoHora);
    }

    @DeleteMapping("/{idBancoHoras}")
    public void deleteBancoHoras(@PathVariable("idBancoHoras") BancoHora.BancoHoraId idBancoHoras) {
        bancoHorasService.delete(idBancoHoras);
    }
}
