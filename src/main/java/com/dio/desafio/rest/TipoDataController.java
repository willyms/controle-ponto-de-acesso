package com.dio.desafio.rest;

import com.dio.desafio.model.*;
import com.dio.desafio.service.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tipoData")
public class TipoDataController {

    private final TipoDataService tipoDataService;

    @PostMapping
    public TipoData createTipoData(@RequestBody TipoData tipoData){
        return tipoDataService.save(tipoData);
    }

    @GetMapping
    public List<TipoData> getTipoDataList(){
        return tipoDataService.findAll();
    }

    @GetMapping("/{idTipoData}")
    public ResponseEntity<TipoData> getTipoDataById(@PathVariable("idTipoData") Long idTipoData) throws Exception {
        return ResponseEntity.ok(tipoDataService.getById(idTipoData).orElseThrow(() -> new NoSuchElementException("TipoData not found.")));
    }

    @PutMapping
    public TipoData updateTipoData(@RequestBody TipoData tipoData){
        return tipoDataService.save(tipoData);
    }

    @DeleteMapping("/{idTipoData}")
    public void deleteTipoData(@PathVariable("idTipoData") Long idTipoData){
        tipoDataService.delete(idTipoData);
    }
}
