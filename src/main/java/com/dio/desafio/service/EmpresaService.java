package com.dio.desafio.service;

import com.dio.desafio.model.*;
import com.dio.desafio.repositorio.*;
import lombok.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
@RequiredArgsConstructor
public class EmpresaService {

    private final EmpresaRepositorio empresarepositorio;

    public Empresa save(Empresa empresa){
        return empresarepositorio.save(empresa);
    }

    public Empresa update(Empresa empresa){
        return empresarepositorio.save(empresa);
    }

    public List<Empresa> findAll() {
        return empresarepositorio.findAll();
    }

    public Optional<Empresa> getById(Long idEmpresa) {
        return empresarepositorio.findById(idEmpresa);
    }

    public void delete(Long idEmpresa) {
        empresarepositorio.deleteById(idEmpresa);
    }
}
