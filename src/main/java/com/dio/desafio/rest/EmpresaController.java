package com.dio.desafio.rest;



import com.dio.desafio.model.*;
import com.dio.desafio.service.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/empresa")
public class EmpresaController {

   private final EmpresaService empresaService;

    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa empresa){
        return empresaService.save(empresa);
    }

    @GetMapping
    public List<Empresa> getEmpresaList(){
        return empresaService.findAll();
    }

    @GetMapping("/{idEmpresa}")
    public ResponseEntity<Empresa> getEmpresaById(@PathVariable("idEmpresa") Long idEmpresa) throws Exception {
        return ResponseEntity.ok(empresaService.getById(idEmpresa).orElseThrow(() -> new NoSuchElementException("Empresa not found.")));
    }

    @PutMapping
    public Empresa updateEmpresa(@RequestBody Empresa empresa){
        return empresaService.save(empresa);
    }

    @DeleteMapping("/{idEmpresa}")
    public void deleteEmpresa(@PathVariable("idEmpresa") Long idEmpresa){
        empresaService.delete(idEmpresa);
    }
}
